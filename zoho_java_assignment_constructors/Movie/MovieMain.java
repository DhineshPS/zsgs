public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        Movie movie2 =   new Movie("Fight Club", "David Fincher", 1999, 8.8);
        Movie movie3 = new Movie("Avatar", "James Cameron", 2008, 7.9);

        Movie.addMovie(movie1);
        Movie.addMovie(movie2);
        Movie.addMovie(movie3);

        Movie.displayMovies();
    }
}
