public class ThrillerMovie extends Movie{

    ThrillerMovie(String movieName, double rating) {
        super(movieName, rating);
    }
    
    public void displayMovie() {
        System.out.println(this.movieName + " thriller movie is playing");
    }

    public void showRating() {
        System.out.println(this.movieName + " is rated " + this.rating);
    }
}
