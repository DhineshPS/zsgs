public class Main {
   public static void main(String[] args) {
    Movie tMovie = new ThrillerMovie();
    Movie hMovie = new HorrorMovie();

    tMovie.watchMovie();
    hMovie.watchMovie();

    tMovie.buyMovie();
    hMovie.buyMovie();
   }
}
