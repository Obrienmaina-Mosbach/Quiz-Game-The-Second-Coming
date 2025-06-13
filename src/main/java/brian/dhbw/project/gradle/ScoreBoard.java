package brian.dhbw.project.gradle;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap; // To preserve insertion order for basic scores map if needed
import static com.mongodb.client.model.Sorts.descending;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;

public class ScoreBoard {

    private Map<String, Integer> scores; // Current scores for display, not directly persisted here
    private List<Map.Entry<String, Integer>> leaderboard; // For sorted display
    private MongoCollection<Document> scoresCollection;

    public ScoreBoard() {
        scores = new LinkedHashMap<>(); // Use LinkedHashMap to maintain order if you display 'current scores'
        leaderboard = new ArrayList<>();
        MongoDatabase database = DatabaseConfig.getDatabase();
        this.scoresCollection = database.getCollection("playerScores"); // Collection for scores
        loadScores(); // Load initial scores from DB
    }

    public void updateScore(String playerName, int score) {
        // Find if player exists
        Document existingScoreDoc = scoresCollection.find(eq("playerName", playerName)).first();

        if (existingScoreDoc != null) {
            int currentHighestScore = existingScoreDoc.getInteger("score");
            if (score > currentHighestScore) {
                // Update only if new score is higher
                scoresCollection.updateOne(eq("playerName", playerName), Updates.set("score", score));
                System.out.println("Updated high score for " + playerName + ": " + score);
            } else {
                System.out.println(playerName + "'s current score (" + score + ") is not higher than existing high score (" + currentHighestScore + ").");
            }
        } else {
            // Insert new player score
            Document newScoreDoc = new Document("playerName", playerName)
                    .append("score", score);
            scoresCollection.insertOne(newScoreDoc);
            System.out.println("Inserted new score for " + playerName + ": " + score);
        }

        // After updating/inserting, refresh the in-memory leaderboard
        updateLeaderboard();
    }

    private void updateLeaderboard() {
        leaderboard.clear();
        // Fetch all scores, sort by score in descending order, limit to top 10 (or all if less than 10)
        scoresCollection.find()
                .sort(descending("score"))
                .limit(10) // Get top 10
                .forEach(doc -> leaderboard.add(
                        Map.entry(doc.getString("playerName"), doc.getInteger("score"))
                ));
    }

    public void displayScores() {
        // This method might become less relevant if you always display the leaderboard
        // or if 'scores' map only temporarily holds current game data.
        // For now, it will show the current state of the in-memory 'scores' map.
        System.out.println("Current Game Scores (not necessarily global):");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayLeaderboard() {
        System.out.println("\n--- Global Leaderboard (Top 10) ---");
        if (leaderboard.isEmpty()) {
            System.out.println("No scores yet. Play a game to set one!");
        } else {
            for (int i = 0; i < leaderboard.size(); i++) {
                Map.Entry<String, Integer> entry = leaderboard.get(i);
                System.out.println((i + 1) + ". " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public int getHighestScore() {
        // Fetch the highest score directly from the database for accuracy
        Document topScoreDoc = scoresCollection.find()
                .sort(descending("score"))
                .limit(1)
                .first();
        return topScoreDoc != null ? topScoreDoc.getInteger("score") : 0;
    }

    private void loadScores() {
        // On initialization, load all scores into the in-memory 'scores' map
        // (Optional: if you need all scores for display or manipulation, otherwise just refresh leaderboard)
        scoresCollection.find().forEach(doc -> {
            scores.put(doc.getString("playerName"), doc.getInteger("score"));
        });
        updateLeaderboard(); // Also update the leaderboard on load
    }
}
