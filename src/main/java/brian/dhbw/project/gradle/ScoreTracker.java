package brian.dhbw.project.gradle;

public class ScoreTracker {
    private int score;

    public ScoreTracker() {
        this.score = 0;
    }

    public void incrementScore() {
        this.score++;
    }

    public int getScore() {
        return score;
    }
}