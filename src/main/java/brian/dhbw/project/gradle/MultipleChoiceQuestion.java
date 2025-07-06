package brian.dhbw.project.gradle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MultipleChoiceQuestion extends QuizQuestion {
    private List<String> options;
    private String answer;

    public MultipleChoiceQuestion() {
        super("", "", "");
    }

    public MultipleChoiceQuestion(String questionText, List<String> options, String answer, String topic, String difficulty) {
        super(questionText, topic, difficulty);
        this.options = options;
        this.answer = answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public void display() {
        System.out.println("\nQuestion: " + getQuestionText()); // Uses getter from superclass for abstraction.
        if (options != null && !options.isEmpty()) {
            // Iterates through options to display them clearly.
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
        } else {
            System.out.println("No options available for this question. This question may be malformed."); // Defensive
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        try {
            int answerIndex = Integer.parseInt(userAnswer) - 1;


            if (answerIndex >= 0 && answerIndex < options.size()) {
                return Objects.equals(options.get(answerIndex), answer);
            }
        } catch (NumberFormatException e) {
            return false;
        } catch (IndexOutOfBoundsException e) {
            // User enters a number outside the range of available options
            return false;
        }
        return false;
    }


    public int getCorrectAnswerIndex() {
        return options.indexOf(answer);
    }
}