package brian.dhbw.project.gradle;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ScoreBoard {

    private Map<String, Integer> scores;
    private List<Map.Entry<String, Integer>> leaderboard;
    private static final String FILE_PATH = "scores.json";

    public ScoreBoard() {
        scores = new HashMap<>();
        leaderboard = new ArrayList<>();
        loadScores();
    }

    public void updateScore(String playerName, int score) {
        scores.put(playerName, score);
        saveScores();
        updateLeaderboard();
    }

    private void updateLeaderboard() {
        leaderboard.clear();
        leaderboard.addAll(scores.entrySet());
        leaderboard.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
    }

    public void displayScores() {
        System.out.println("Scoreboard:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayLeaderboard() {
        System.out.println("Leaderboard:");
        for (int i = 0; i < Math.min(10, leaderboard.size()); i++) {
            Map.Entry<String, Integer> entry = leaderboard.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public int getHighestScore() {
        return leaderboard.isEmpty() ? 0 : leaderboard.get(0).getValue();
    }

    private void loadScores() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Object obj = parser.parse(reader);
            if (obj instanceof JSONArray) {
                JSONArray scoresArray = (JSONArray) obj;
                for (Object scoreObj : scoresArray) {
                    JSONObject scoreObject = (JSONObject) scoreObj;
                    String playerName = (String) scoreObject.get("playerName");
                    int score = ((Long) scoreObject.get("score")).intValue();
                    scores.put(playerName, score);
                }
                updateLeaderboard();
            } else {
                System.out.println("Invalid JSON format: Expected an array of scores.");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void saveScores() {
        JSONArray scoresArray = new JSONArray();
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            JSONObject scoreObject = new JSONObject();
            scoreObject.put("playerName", entry.getKey());
            scoreObject.put("score", entry.getValue());
            scoresArray.add(scoreObject);
        }
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(scoresArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
