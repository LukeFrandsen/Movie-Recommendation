import java.util.List;
import java.util.stream.Collectors;

public class movieRecommender {

    public List<movie> recommendMovies(List<movie> movies, userPreferences preferences) {
        return movies.stream()
                .filter(movie -> preferences.getPreferredGenres().contains(movie.getGenre()))
                .filter(movie -> movie.getRating() >= preferences.getPreferredRating())
                .collect(Collectors.toList());
    }
}