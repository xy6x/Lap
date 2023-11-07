import java.util.List;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
    }

    public void watch(User user){

    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        return null;
    }
    public String getMediaType(){
        return null;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
