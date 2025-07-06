package brian.dhbw.project.gradle;

public abstract class QuizQuestion {

    private String questionText;
    private String topic;
    private String difficulty;


    public QuizQuestion(String questionText, String topic, String difficulty) {
        this.questionText = questionText;
        this.topic = topic;
        this.difficulty = difficulty;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public abstract void display();

    public abstract boolean checkAnswer(String userAnswer);
}