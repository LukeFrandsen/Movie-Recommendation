import java.util.List;

public class userPreferences {
    private List<String> preferredGenres;
    private double preferredRating;

    public userPreferences(List<String> preferredGenres, double preferredRating) {
        this.preferredGenres = preferredGenres;
        this.preferredRating = preferredRating;
    }

    public List<String> getPreferredGenres() {
        return preferredGenres;
    }

    public double getPreferredRating() {
        return preferredRating;
    }
}