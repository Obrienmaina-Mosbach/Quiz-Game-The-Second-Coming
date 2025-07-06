package brian.dhbw.project.gradle;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static com.mongodb.client.model.Sorts.descending;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;

public class ScoreBoard {


    private MongoCollection<Document> scoresCollection;


    public ScoreBoard() {

        MongoDatabase database = DatabaseConfig.getDatabase();
        this.scoresCollection = database.getCollection("playerScores");
        System.out.println("ScoreBoard initialized and connected to 'playerScores' collection.");
    }


    public void updateScore(String playerName, int score, String difficulty, String topic) { // Added topic parameter

        Document existingScoreDoc = scoresCollection.find(
                and(eq("playerName", playerName), eq("difficulty", difficulty), eq("topic", topic)) // Filter by topic
        ).first();

        if (existingScoreDoc != null) {

            int currentHighestScore = existingScoreDoc.getInteger("score");
            if (score > currentHighestScore) {

                scoresCollection.updateOne(
                        and(eq("playerName", playerName), eq("difficulty", difficulty), eq("topic", topic)), // Filter by topic
                        Updates.set("score", score) // Uses MongoDB Updates helper
                );
                System.out.println("Updated high score for " + playerName + " (" + topic + " - " + difficulty + "): " + score);
            } else {
                System.out.println(playerName + "'s current score (" + score + ") for " + topic + " - " + difficulty + " is not higher than existing high score (" + currentHighestScore + ").");
            }
        } else {

            Document newScoreDoc = new Document("playerName", playerName)
                    .append("difficulty", difficulty)
                    .append("topic", topic) // Store topic
                    .append("score", score);
            scoresCollection.insertOne(newScoreDoc);
            System.out.println("Inserted new score for " + playerName + " (" + topic + " - " + difficulty + "): " + score);
        }
    }


    public String getLeaderboardString(String difficulty, String topic) {
        StringBuilder leaderboardText = new StringBuilder();
        leaderboardText.append("\n--- Global Leaderboard (").append(topic).append(" - ").append(difficulty).append(" Difficulty - Top 10) ---\n"); // Updated header

        List<Map.Entry<String, Integer>> currentDifficultyLeaderboard = new ArrayList<>();


        scoresCollection.find(and(eq("difficulty", difficulty), eq("topic", topic))) // Filter by topic as well
                .sort(descending("score"))
                .limit(10)
                .forEach(doc -> currentDifficultyLeaderboard.add(
                        Map.entry(doc.getString("playerName"), doc.getInteger("score"))
                ));

        if (currentDifficultyLeaderboard.isEmpty()) {
            leaderboardText.append("No scores yet for ").append(topic).append(" - ").append(difficulty).append(" difficulty. Play a game to set one!\n");
        } else {

            for (int i = 0; i < currentDifficultyLeaderboard.size(); i++) {
                Map.Entry<String, Integer> entry = currentDifficultyLeaderboard.get(i);
                leaderboardText.append((i + 1)).append(". ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
        }
        return leaderboardText.toString();
    }

    public int getHighestScore(String difficulty) {

        Document topScoreDoc = scoresCollection.find(eq("difficulty", difficulty))
                .sort(descending("score"))
                .limit(1)
                .first();
        return topScoreDoc != null ? topScoreDoc.getInteger("score") : 0;
    }
}
