public class HorrorMovie extends Movie{
    HorrorMovie(String movieName, double rating) {
        super(movieName, rating);
    }
    
    public void displayMovie() {
        System.out.println(this.movieName + " horror movie is playing");
    }

    public void showRating() {
        System.out.println(this.movieName + " is rated " + this.rating);
    }
}
