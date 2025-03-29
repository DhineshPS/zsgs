public class Main {
    public static void main(String[] args) {
        Movie tMovie = new ThrillerMovie("Mission Impossible", 8.8);
        Movie hMovie = new HorrorMovie("The Conjuring", 7.5);

        tMovie.displayMovie();
        tMovie.showRating();

        hMovie.displayMovie();
        hMovie.showRating();
    }
}
