public class movie {
        private String title;
        private String genre;
        private double rating;
        private int releaseYear;
    
        public movie(String title, String genre, double rating, int releaseYear) {
            this.title = title;
            this.genre = genre;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }
    
        public String getTitle() {
            return title;
        }
    
        public String getGenre() {
            return genre;
        }
    
        public double getRating() {
            return rating;
        }
    
        public int getReleaseYear() {
            return releaseYear;
        }
    
        @Override
        public String toString() {
            return String.format("%s (Rating: %.1f, Genre: %s, Year: %d)", title, rating, genre, releaseYear);
        }
}
