package brian.dhbw.project.gradle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GameController {
        private List<Question> questions;
        private int currentQuestionIndex;
        private Scanner scanner;
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
        private boolean timerExpired;
        private String playerName;

        public GameController(String playerName, String topic, String difficulty) {
            this.playerName = playerName;
            QuestionBank questionBank = new QuestionBank(topic, difficulty);
            this.questions = questionBank.getQuestions();
            this.currentQuestionIndex = 0;
            this.scanner = new Scanner(System.in);
            this.scoreTracker = new ScoreTracker();
            this.scoreBoard = new ScoreBoard();
            setTimeLimit(difficulty);
        }

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

        public void startGame() {
            while (currentQuestionIndex < questions.size()) {
                Question question = questions.get(currentQuestionIndex);
                displayQuestion(question);
                startTimer();
                String userAnswer = scanner.nextLine();
                if (!timerExpired) {
                    timer.cancel();
                    if (userAnswer.equalsIgnoreCase("skip")) {
                        skipQuestion();
                    } else if (userAnswer.equalsIgnoreCase("previous")) {
                        previousQuestion();
                    } else {
                        checkAnswer(question, userAnswer);
                        currentQuestionIndex++;
                    }
                }
                timerExpired = false;
            }
            System.out.println("Quiz finished! Your score is: " + scoreTracker.getScore());
            scoreBoard.updateScore(playerName, scoreTracker.getScore());
            displayFinalScores();
        }

        private void displayQuestion(Question question) {
            System.out.println("Question: " + question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            System.out.println("Enter your answer (or type 'skip' to skip, 'previous' to go back): ");
        }

        private void startTimer() {
            timer = new Timer();
            timerExpired = false;
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    timerExpired = true;
                    currentQuestionIndex++;
                    startGame();
                }
            }, timeLimit * 1000);
        }

        private void skipQuestion() {
            currentQuestionIndex++;
        }

        private void previousQuestion() {
            if (currentQuestionIndex > 0) {
                currentQuestionIndex--;
            }
        }

        private void checkAnswer(Question question, String userAnswer) {
            try {
                int answerIndex = Integer.parseInt(userAnswer) - 1;
                if (question.getOptions().get(answerIndex).equals(question.getAnswer())) {
                    System.out.println(correctResponses.get(responseIndex));
                    responseIndex = (responseIndex + 1) % correctResponses.size();
                    scoreTracker.incrementScore();
                } else {
                    System.out.println("Incorrect. The correct answer is: " + question.getAnswer());
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number corresponding to your answer.");
            }
        }

        private void displayFinalScores() {
            System.out.println("Final Score for " + playerName + ": " + scoreTracker.getScore());
            System.out.println("Highest Score: " + scoreBoard.getHighestScore());
        }
}

