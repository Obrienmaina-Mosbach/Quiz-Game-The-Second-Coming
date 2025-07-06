package brian.dhbw.project.gradle;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GameController {
    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private ScoreTracker scoreTracker;
    private ScoreBoard scoreBoard;
    private List<String> correctResponses = Arrays.asList(
            "Correct! Well done.🎉",
            "Nice job! That's right.🎊",
            "Excellent! You got it.🥳",
            "Great work! Correct answer.🎊",
            "Spot on! That's correct.🪅",
            "Sweet, You are on a Roll. 🎉"
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
        this.questions = new java.util.ArrayList<>();
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
        } else if (userAnswer.equalsIgnoreCase("previous")) {
            if (currentQuestionIndex > 0) {
                currentQuestionIndex--;
                ui.appendOutput("Going back to previous question.\n");
            } else {
                ui.appendOutput("Already at the first question. Cannot go back.\n");
                ui.setButtonsEnabled(true);
                return;
            }
        } else {
            if (question.checkAnswer(userAnswer)) {
                ui.appendOutput(correctResponses.get(responseIndex) + "\n");
                responseIndex = (responseIndex + 1) % correctResponses.size();
                scoreTracker.incrementScore();
                ui.appendOutput("Score incremented. Current score: " + scoreTracker.getScore() + "\n");
                currentQuestionIndex++;
            } else {
                ui.appendOutput("Incorrect. The correct answer is: " + getCorrectAnswerForDisplay(question) + "\n");
                currentQuestionIndex++;
            }
        }
        ui.appendOutput("------------------------------------\n");

        displayCurrentQuestion();
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
        ui.appendOutput("Quiz finished! Your score for " + gameTopic + " (" + gameDifficulty + ") is: " + scoreTracker.getScore() + "\n");
        scoreBoard.updateScore(playerName, scoreTracker.getScore(), gameDifficulty, gameTopic);

        String leaderboardText = scoreBoard.getLeaderboardString(gameDifficulty, gameTopic);

        System.err.println("DEBUG: Leaderboard String from ScoreBoard: \n" + leaderboardText);

        ui.appendOutput(leaderboardText);

        ui.endQuiz(); //(disables buttons)
    }


    public void resetGame() {
        this.currentQuestionIndex = 0;
        this.scoreTracker = new ScoreTracker(); // Reset score
        this.questions = new java.util.ArrayList<>(); // Clear questions
        this.responseIndex = 0; // Reset response index
        this.playerName = null; // Clear player name
        this.gameTopic = null; // Clear topic
        this.gameDifficulty = null; // Clear difficulty
    }

    private String getCorrectAnswerForDisplay(QuizQuestion question) {
        if (question instanceof MultipleChoiceQuestion) {
            return ((MultipleChoiceQuestion) question).getAnswer();
        }
        return "Answer not available for this question type.";
    }
}
