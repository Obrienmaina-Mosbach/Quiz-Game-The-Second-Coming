package brian.dhbw.project.gradle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {


        private String question;
        private List<String> options;
        private String answer;

        // Default constructor
        public Question() {
        }

        // Getters and setters
        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
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

        // Method to get the index of the correct answer
        public int getCorrectAnswerIndex() {
            return options.indexOf(answer);
        }

        // Method to get the question text
        public String getQuestionText() {
            return question;
        }
}

