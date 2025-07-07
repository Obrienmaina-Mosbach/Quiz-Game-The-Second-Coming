package brian.dhbw.project.gradle;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameController {

    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private ScoreTracker scoreTracker;
    private ScoreBoard scoreBoard;


    private List<String> correctResponses = Arrays.asList(
            "Correct! Well done.🪅",
            "Nice job! That's right.🎊",
            "Excellent! You got it.🥳",
            "Great work! Correct answer.🎊",
            "Spot on! That's correct.🪅",
            "Sweet, You are on a Roll. 🎉",
            "Fantastic! Keep it up.🌟",
            "Absolutely right! 👍",
            "Perfect! You nailed it.🎯"
    );


    private List<String> incorrectResponses = Arrays.asList(
            "Oops, that's incorrect. Try again next time!",
            "Not quite. Better luck on the next one.",
            "That's not the answer. Keep learning!",
            "Incorrect. Don't worry, every mistake is a learning opportunity.",
            "Wrong answer. But don't give up!"
    );

    private int responseIndex = 0;
    private String playerName;
    private String gameTopic;
    private String gameDifficulty;

    private GameUIWrapper ui;


    public GameController(GameUIWrapper ui) {
        this.ui = ui;
        this.currentQuestionIndex = 0;
        this.scoreTracker = new ScoreTracker();
        this.scoreBoard = new ScoreBoard();
        this.questions = new ArrayList<>();
    }

    public void setGameParameters(String playerName, String topic, String difficulty) {
        this.playerName = playerName;
        this.gameTopic = topic;
        this.gameDifficulty = difficulty;

        ui.appendOutput("GameController: Loading questions for topic: " + topic + ", difficulty: " + difficulty + "\n");
        QuestionBank questionBank = new QuestionBank(topic, difficulty);
        this.questions = questionBank.getQuestions();

        if (this.questions.isEmpty()) {
            ui.appendOutput("No questions loaded for topic: " + topic + ", difficulty: " + difficulty + ". Please ensure data is in MongoDB.\n");
            ui.endQuiz();
        } else {
            ui.appendOutput("GameController: Questions loaded. Ready to start.\n");
        }
    }


    public void startQuiz() {
        if (questions.isEmpty()) {
            ui.appendOutput("Cannot start quiz: No questions available.\n");
            ui.endQuiz();
            return;
        }
        displayCurrentQuestion();
    }

    private void displayCurrentQuestion() {
        if (currentQuestionIndex < questions.size()) {
            QuizQuestion question = questions.get(currentQuestionIndex);

            ui.displayQuestion(question.getQuestionText(), ((MultipleChoiceQuestion) question).getOptions());
        } else {
            endQuiz();
        }
    }

    public void processAnswerAndLoadNextQuestion(String userAnswer) {
        if (currentQuestionIndex >= questions.size()) {
            ui.appendOutput("Quiz already finished.\n");
            return;
        }

        QuizQuestion question = questions.get(currentQuestionIndex);


        if (userAnswer.equalsIgnoreCase("skip")) {
            ui.appendOutput("Question skipped.\n");
            currentQuestionIndex++;
            ui.appendOutput("------------------------------------\n");
            displayCurrentQuestion();
        } else if (userAnswer.equalsIgnoreCase("previous")) {
            if (currentQuestionIndex > 0) {
                currentQuestionIndex--;
                ui.appendOutput("Going back to previous question.\n");
            } else {
                ui.appendOutput("Already at the first question. Cannot go back.\n");
                ui.setButtonsEnabled(true);
                return;
            }
            ui.appendOutput("------------------------------------\n");
            displayCurrentQuestion();
        } else {
            if (question.checkAnswer(userAnswer)) {
                ui.appendOutput(correctResponses.get(responseIndex) + "\n");
                responseIndex = (responseIndex + 1) % correctResponses.size();
                scoreTracker.incrementScore();
                ui.appendOutput("Score incremented. Current score: " + scoreTracker.getScore() + "\n");
                currentQuestionIndex++;
                ui.appendOutput("------------------------------------\n");
                displayCurrentQuestion();
            } else {

                ui.appendOutput(incorrectResponses.get(responseIndex % incorrectResponses.size()) + "\n");
                ui.appendOutput("The correct answer is: " + getCorrectAnswerForDisplay(question) + "\n");
                currentQuestionIndex++;


                ui.setButtonsEnabled(false);
                Timer feedbackTimer = new Timer(4500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ui.appendOutput("------------------------------------\n");
                        displayCurrentQuestion();
                        ((Timer)e.getSource()).stop();
                    }
                });
                feedbackTimer.setRepeats(false);
                feedbackTimer.start();
            }
        }
    }


    public void skipQuestion() {
        if (currentQuestionIndex < questions.size()) {
            ui.appendOutput("Question skipped.\n");
            currentQuestionIndex++;
            displayCurrentQuestion();
        } else {
            endQuiz();
        }
    }


    public void loadPreviousQuestion() {
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--;
            ui.appendOutput("Going back to previous question.\n");
            displayCurrentQuestion();
        } else {
            ui.appendOutput("Already at the first question. Cannot go back.\n");
            ui.setButtonsEnabled(true);
        }
    }


    private void endQuiz() {

        int totalQuestions = questions.size();
        int correctAnswers = scoreTracker.getScore();
        int incorrectAnswers = totalQuestions - correctAnswers;


        ui.appendOutput("--- Quiz Finished! ---\n");
        ui.appendOutput("Player: " + playerName + "\n");
        ui.appendOutput("Topic: " + gameTopic + "\n");
        ui.appendOutput("Difficulty: " + gameDifficulty + "\n");
        ui.appendOutput("Total Questions: " + totalQuestions + "\n");
        ui.appendOutput("Correct Answers: " + correctAnswers + "\n");
        ui.appendOutput("Incorrect Answers: " + incorrectAnswers + "\n");
        ui.appendOutput("Your Final Score: " + scoreTracker.getScore() + "\n\n");


        scoreBoard.updateScore(playerName, scoreTracker.getScore(), gameDifficulty, gameTopic);


        String leaderboardText = scoreBoard.getLeaderboardString(gameDifficulty, gameTopic);


        System.err.println("DEBUG: Leaderboard String from ScoreBoard: \n" + leaderboardText);

        ui.appendOutput(leaderboardText);

        ui.endQuiz();
    }


    public void resetGame() {
        this.currentQuestionIndex = 0;
        this.scoreTracker = new ScoreTracker();
        this.questions = new ArrayList<>();
        this.responseIndex = 0;
        this.playerName = null;
        this.gameTopic = null;
        this.gameDifficulty = null;

    }


    private String getCorrectAnswerForDisplay(QuizQuestion question) {
        if (question instanceof MultipleChoiceQuestion) {
            return ((MultipleChoiceQuestion) question).getAnswer();
        }
        return "Answer not available for this question type.";
    }
}
