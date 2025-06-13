package brian.dhbw.project.gradle;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document; // MongoDB's document class
import java.util.ArrayList;
import java.util.List;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

public class QuestionBank {

    private List<Question> questions;
    private MongoCollection<Document> questionsCollection;

    public QuestionBank(String topic, String difficulty) {
        MongoDatabase database = DatabaseConfig.getDatabase();
        // Assuming your questions are in a collection named "questions"
        this.questionsCollection = database.getCollection("questions");
        loadQuestions(topic, difficulty);
    }

    private void loadQuestions(String topic, String difficulty) {
        this.questions = new ArrayList<>();
        // Query MongoDB for questions matching topic and difficulty
        for (Document doc : questionsCollection.find(
                and(eq("topic", topic), eq("difficulty", difficulty)))) {
            // Map MongoDB Document to your Question object
            Question question = new Question();
            question.setQuestion(doc.getString("question"));
            question.setOptions((List<String>) doc.get("options")); // Cast is safe if "options" is an array of strings
            question.setAnswer(doc.getString("answer"));
            this.questions.add(question);
        }

        if (this.questions.isEmpty()) {
            System.out.println("No questions found for topic: " + topic + ", difficulty: " + difficulty + ". Please ensure data is in MongoDB.");
            // Optionally, load some default questions or exit gracefully
        }
    }

    public List<Question> getQuestions() {
        return questions;
    }

    // You might want to add methods here to add/update questions in MongoDB
    public void addQuestion(Question question) {
        Document doc = new Document("question", question.getQuestion())
                .append("options", question.getOptions())
                .append("answer", question.getAnswer())
                .append("topic", question.getTopic()) // Assuming Question also has topic/difficulty now
                .append("difficulty", question.getDifficulty());
        questionsCollection.insertOne(doc);
        System.out.println("Question added to MongoDB.");
    }
}
