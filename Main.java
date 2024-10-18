import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Clears the console
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Linux and macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing the console: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        clearConsole();
        // creates a movieLoader object that loads the movies from the csv file
        movieLoader movieLoader = new movieLoader();
        List<movie> movies;
        try {
            movies = movieLoader.loadMovies("movies.csv");
        } catch (IOException e) {
            System.out.println("Error loading the movie dataset: " + e.getMessage());
            return;
        }

        //scanner checks for inputs in console
        Scanner scanner = new Scanner(System.in);
        // Starts the Console Application
        System.out.println("Welcome to the Movie Recommender!");

        System.out.print("Enter your preferred genres (comma-separated, e.g., Action,Sci-Fi): ");
        String genreInput = scanner.nextLine();
        List<String> preferredGenres = Arrays.asList(genreInput.split(","));

        System.out.print("Enter your minimum movie rating (e.g., 7.0): ");
        double preferredRating = scanner.nextDouble();

        userPreferences preferences = new userPreferences(preferredGenres, preferredRating);

        
        movieRecommender recommender = new movieRecommender();
        List<movie> recommendations = recommender.recommendMovies(movies, preferences);

        // Prints the recommendations
        System.out.println("\nHere are your movie recommendations:");
        if (recommendations.isEmpty()) {
            System.out.println("No movies found matching your preferences.");
        } else {
            recommendations.forEach(System.out::println);
        }

       
        scanner.close();
    }
}

