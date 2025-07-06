package brian.dhbw.project.gradle;

public class ScoreTracker {
    private int score;
    public ScoreTracker() {
        this.score = 0; // Initialize score to zero for a new game.
        System.out.println("ScoreTracker initialized. Current game score reset to 0.");
    }

    public void incrementScore() {
        this.score++; // Increment the private score.
        System.out.println("Score incremented. Current score: " + this.score);
    }

    public int getScore() {
        return score;
    }
}