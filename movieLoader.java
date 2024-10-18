import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class movieLoader {

    public List<movie> loadMovies(String filePath) throws IOException {

        List<movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip the header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String title = data[0];
                String genre = data[1];
                double rating = Double.parseDouble(data[2]);
                int year = Integer.parseInt(data[3]);
                movies.add(new movie(title, genre, rating, year));
            }
        }
        return movies;
    }
}