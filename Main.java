import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Load the movie dataset
        movieLoader movieLoader = new movieLoader();
        List<movie> movies;
        try {
            movies = movieLoader.loadMovies("movies.csv"); // Ensure movies.csv is in the right directory
        } catch (IOException e) {
            System.out.println("Error loading the movie dataset: " + e.getMessage());
            return;
        }

        // Get user preferences
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Recommender!");

        System.out.print("Enter your preferred genres (comma-separated, e.g., Action,Sci-Fi): ");
        String genreInput = scanner.nextLine();
        List<String> preferredGenres = Arrays.asList(genreInput.split(","));

        System.out.print("Enter your minimum movie rating (e.g., 7.0): ");
        double preferredRating = scanner.nextDouble();

        userPreferences preferences = new userPreferences(preferredGenres, preferredRating);

        // Generate movie recommendations
        movieRecommender recommender = new movieRecommender();
        List<movie> recommendations = recommender.recommendMovies(movies, preferences);

        // Display the recommendations
        System.out.println("\nHere are your movie recommendations:");
        if (recommendations.isEmpty()) {
            System.out.println("No movies found matching your preferences.");
        } else {
            recommendations.forEach(System.out::println);
        }

        // Close the scanner
        scanner.close();
    }
}

