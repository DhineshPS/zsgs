import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;

    private static ArrayList<Movie> movies = new ArrayList<>();

    public Movie(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void addMovie(Movie movie) {
        movies.add(movie);
    }

    public static void displayMovies() {
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Release Year: " + movie.getReleaseYear());
            System.out.println("Rating: " + movie.getRating());
            System.out.println();
        }
    }
}
