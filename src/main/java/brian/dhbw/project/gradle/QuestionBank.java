package brian.dhbw.project.gradle;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class QuestionBank {

    private List<Question> questions;

    public QuestionBank(String topic, String difficulty) {
        loadQuestions(topic, difficulty);
    }

    private void loadQuestions(String topic, String difficulty) {
        String fileName = topic.toLowerCase() + "_" + difficulty.toLowerCase() + ".json";
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IOException("File not found: " + fileName);
            }
            QuestionData data = mapper.readValue(inputStream, QuestionData.class);
            this.questions = data.getQuestions();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Question> getQuestions() {
        return questions;
    }

    private static class QuestionData {
        private String topic;
        private String difficulty;
        private List<Question> questions;

        public String getTopic() {
            return topic;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public List<Question> getQuestions() {
            return questions;
        }
    }

}
