package brian.dhbw.project.gradle;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

public class QuestionBank {

    private List<QuizQuestion> questions;
    private MongoCollection<Document> questionsCollection;

    public QuestionBank(String topic, String difficulty) {

        MongoDatabase database = DatabaseConfig.getDatabase();
        this.questionsCollection = database.getCollection("questions");
        this.questions = new ArrayList<>();
        loadQuestions(topic, difficulty);
    }


    private void loadQuestions(String topic, String difficulty) {
        System.out.println("Loading questions for topic: " + topic + ", difficulty: " + difficulty);

        for (Document doc : questionsCollection.find(
                and(eq("topic", topic), eq("difficulty", difficulty)))) {

            String questionText = doc.getString("question");
            List<String> options = (List<String>) doc.get("options");
            String answer = doc.getString("answer");
            String qTopic = doc.getString("topic");
            String qDifficulty = doc.getString("difficulty");

            MultipleChoiceQuestion question = new MultipleChoiceQuestion(
                    questionText, options, answer, qTopic, qDifficulty
            );
            this.questions.add(question);
        }

        if (this.questions.isEmpty()) {
            System.out.println("No questions found for topic: " + topic + ", difficulty: " + difficulty + ". Please ensure data is in MongoDB.");
        }
    }


    public List<QuizQuestion> getQuestions() {
        return questions;
    }


    public void addQuestion(MultipleChoiceQuestion question) {
        Document doc = new Document("question", question.getQuestionText())
                .append("options", question.getOptions())
                .append("answer", question.getAnswer())
                .append("topic", question.getTopic())
                .append("difficulty", question.getDifficulty());
        questionsCollection.insertOne(doc);
        System.out.println("Question added to MongoDB: " + question.getQuestionText());
    }
}