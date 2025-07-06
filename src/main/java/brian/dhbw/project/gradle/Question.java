package brian.dhbw.project.gradle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {

    private String question;
    private List<String> options;
    private String answer;
    private String topic;
    private String difficulty;

    public Question() {
    }

    public String getQuestion() { return question; }

    public void setQuestion(String question) { this.question = question; }

    public List<String> getOptions() { return options; }


    public void setOptions(List<String> options) { this.options = options; }

    public String getAnswer() { return answer; }

    public void setAnswer(String answer) { this.answer = answer; }

    public String getTopic() { return topic; }

    public void setTopic(String topic) { this.topic = topic; }

    public String getDifficulty() { return difficulty; }

    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    public int getCorrectAnswerIndex() {
        return options.indexOf(answer);
    }

    public String getQuestionText() {
        return question;
    }
}