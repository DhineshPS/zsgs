public abstract class Movie {
    public String movieName;
    public double rating;

    Movie(String movieName, double rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public abstract void displayMovie();
    public abstract void showRating();
}
