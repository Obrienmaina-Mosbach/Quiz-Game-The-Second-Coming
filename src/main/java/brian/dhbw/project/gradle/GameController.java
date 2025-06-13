package brian.dhbw.project.gradle;

import java.io.IOException; // Although not directly used for System.in.available() anymore, kept for general readiness
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException; // Added for explicit catch of NoSuchElementException
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GameController {
    private List<Question> questions;
    private int currentQuestionIndex;
    private Scanner scanner; // This scanner will now be passed from Game.java
    private Timer timer;
    private int timeLimit;
    private ScoreTracker scoreTracker;
    private ScoreBoard scoreBoard;
    private List<String> correctResponses = Arrays.asList(
            "Correct! Well done.",
            "Nice job! That's right.",
            "Excellent! You got it.",
            "Great work! Correct answer.",
            "Spot on! That's correct."
    );
    private int responseIndex = 0;
    private volatile boolean timerExpired; // Use volatile for thread visibility
    private String playerName;

    /**
     * Constructor for GameController.
     * Initializes the game with player details, loads questions, and sets up scoring.
     * The Scanner instance is passed from Game.java to ensure a single Scanner on System.in.
     *
     * @param playerName The name of the current player.
     * @param topic The chosen quiz topic.
     * @param difficulty The chosen difficulty level (Easy, Medium, Hard).
     * @param sharedScanner The Scanner instance used for console input.
     */
    public GameController(String playerName, String topic, String difficulty, Scanner sharedScanner) {
        this.playerName = playerName;
        // Initialize QuestionBank and load questions based on topic and difficulty
        QuestionBank questionBank = new QuestionBank(topic, difficulty);
        this.questions = questionBank.getQuestions();
        this.currentQuestionIndex = 0;
        this.scanner = sharedScanner; // Use the passed scanner instance
        this.scoreTracker = new ScoreTracker();
        this.scoreBoard = new ScoreBoard();
        setTimeLimit(difficulty); // Set the time limit based on difficulty
    }

    /**
     * Sets the time limit for each question based on the chosen difficulty level.
     *
     * @param difficulty The difficulty level (Easy, Medium, Hard).
     */
    private void setTimeLimit(String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "easy":
                this.timeLimit = 30; // 30 seconds for easy questions
                break;
            case "medium":
                this.timeLimit = 20; // 20 seconds for medium questions
                break;
            case "hard":
                this.timeLimit = 10; // 10 seconds for hard questions
                break;
            default:
                this.timeLimit = 30; // Default to 30 seconds
                break;
        }
    }

    /**
     * Starts and manages the main game loop.
     * Iterates through questions, displays them, handles timed input,
     * checks answers, updates scores, and manages game flow.
     */
    public void startGame() {
        // Loop through questions until all are answered or game ends
        while (currentQuestionIndex < questions.size()) {
            final Question question = questions.get(currentQuestionIndex);
            displayQuestion(question);

            timerExpired = false; // Reset the timer expired flag for the new question
            startTimer(); // Starts the countdown timer for the current question

            final String[] userAnswerContainer = {null}; // Array to hold user input from a separate thread

            // Create a new thread to read user input. This allows the main thread to
            // wait for a limited time (via join) while the input thread blocks on nextLine().
            Thread inputReadingThread = new Thread(() -> {
                try {
                    // Check if there's a line available without blocking indefinitely if the stream is closed
                    // or if hasNextLine() becomes false due to external reasons (e.g., EOF).
                    // This specifically addresses NoSuchElementException if the stream is truly exhausted.
                    if (scanner.hasNextLine()) {
                        userAnswerContainer[0] = scanner.nextLine();
                    }
                } catch (IllegalStateException e) {
                    // This can happen if the scanner itself was closed while inputReadingThread was waiting.
                    System.err.println("Error: Scanner was closed prematurely while waiting for input. " + e.getMessage());
                } catch (NoSuchElementException e) {
                    // This can happen if the underlying input stream is closed before a line is found.
                    // This is the error we were specifically debugging.
                    System.err.println("Error: No line found in input stream. It might be exhausted or closed. " + e.getMessage());
                }
            });

            inputReadingThread.start(); // Start the thread that will read user input

            try {
                // Main thread waits for the inputReadingThread to complete, but only for 'timeLimit' seconds.
                // If inputReadingThread finishes within this time, it means input was received.
                // If it times out, inputReadingThread is still blocking, and we proceed based on timerExpired.
                inputReadingThread.join(timeLimit * 1000);
            } catch (InterruptedException e) {
                // If the current thread (main game loop) is interrupted while waiting for input,
                // restore its interrupted status and print an error.
                Thread.currentThread().interrupt();
                System.err.println("Game interrupted: " + e.getMessage());
            } finally {
                // Ensure the timer is always cancelled and purged to free up resources,
                // regardless of whether input was received or time ran out.
                if (timer != null) {
                    timer.cancel(); // Stop the timer
                    timer.purge();  // Remove all scheduled tasks from the timer's queue
                    timer = null;   // Clear the timer reference for the next question
                }
                // Interrupt the input thread if it's still alive (meaning it timed out)
                if (inputReadingThread.isAlive()) {
                    inputReadingThread.interrupt(); // Attempt to interrupt the blocking nextLine() call.
                    // Note: System.in.read/Scanner.nextLine() blocking is not
                    // always responsive to Thread.interrupt() across all JVMs/OS.
                }
            }

            String userAnswer = userAnswerContainer[0]; // Retrieve the input. This will be null if timeout occurred.

            // Decision logic based on whether input was received or time ran out
            if (userAnswer == null) { // This means input was not received (either timed out or input stream issue)
                System.out.println("Time's up for this question!");
                System.out.println("The correct answer was: " + question.getAnswer());
                currentQuestionIndex++; // Automatically advance to the next question on timeout
            } else {
                // Input was received before the timer ran out
                if (userAnswer.equalsIgnoreCase("skip")) {
                    System.out.println("Question skipped.");
                    currentQuestionIndex++; // Advance to the next question
                } else if (userAnswer.equalsIgnoreCase("previous")) {
                    // If 'previous' is entered, decrement index if possible.
                    // The loop will re-display the (now previous) question in the next iteration.
                    if (currentQuestionIndex > 0) {
                        currentQuestionIndex--;
                        System.out.println("Going back to previous question.");
                    } else {
                        System.out.println("Already at the first question. Cannot go back.");
                        // Stay on the current question if already at the beginning.
                        // currentQuestionIndex does not change.
                    }
                } else {
                    // Process user's numerical answer
                    try {
                        int answerIndex = Integer.parseInt(userAnswer) - 1; // Convert to 0-based index
                        // Check if the answer is within valid options and matches the correct answer
                        if (answerIndex >= 0 && answerIndex < question.getOptions().size() &&
                                question.getOptions().get(answerIndex).equals(question.getAnswer())) {
                            System.out.println(correctResponses.get(responseIndex)); // Provide positive feedback
                            responseIndex = (responseIndex + 1) % correctResponses.size(); // Cycle through responses
                            scoreTracker.incrementScore(); // Increase score
                            currentQuestionIndex++; // Advance to the next question on correct answer
                        } else {
                            System.out.println("Incorrect. The correct answer is: " + question.getAnswer());
                            currentQuestionIndex++; // Advance to the next question even on incorrect answer
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number corresponding to your answer (e.g., 1, 2, 3).");
                        // Modified: Advance to the next question even on invalid number format to prevent infinite loop.
                        currentQuestionIndex++;
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid option number. Please choose from the given options (e.g., 1, 2, 3).");
                        // Modified: Advance to the next question even on out-of-bounds number to prevent infinite loop.
                        currentQuestionIndex++;
                    }
                }
            }
            System.out.println("------------------------------------"); // Separator for clarity between questions
        }

        // Game finished: display final score and leaderboard
        System.out.println("Quiz finished! Your score is: " + scoreTracker.getScore());
        scoreBoard.updateScore(playerName, scoreTracker.getScore()); // Persist score to MongoDB
        scoreBoard.displayLeaderboard(); // Display global leaderboard
        // The scanner is closed by Game.java, as it owns the original System.in Scanner.
        // No need to close it here.
    }

    /**
     * Displays the current question and its options to the console.
     *
     * @param question The Question object to display.
     */
    private void displayQuestion(Question question) {
        System.out.println("\nQuestion: " + question.getQuestionText()); // Added newline for better readability
        List<String> options = question.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("You have " + timeLimit + " seconds. Enter your answer (or type 'skip' to skip, 'previous' to go back): ");
    }

    /**
     * Starts a new timer for the current question.
     * Any previously active timer is cancelled.
     */
    private void startTimer() {
        // Cancel and purge any existing timer to ensure only one is active at a time
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
        // Create a new Timer instance. 'true' makes it a daemon thread,
        // which means it won't prevent the JVM from exiting if the main thread finishes.
        timer = new Timer(true);
        timerExpired = false; // Reset the flag when starting a new timer
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // This method runs in the Timer's background thread.
                // It only sets the flag; the main game loop reacts to this flag.
                // We avoid printing "Time's up!" here to prevent race conditions or
                // messy output if the user is typing in the main thread.
                timerExpired = true;
            }
        }, timeLimit * 1000); // Schedule to run after timeLimit seconds
    }
}
