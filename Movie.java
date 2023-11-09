import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;
    public Movie(){

    }

    public Movie(String title, String auteur, String ISBN, double price,int duration) {
        super(title, auteur, ISBN, price);
        this.duration=duration;
    }

    public void watch(User user){
    User u1 = new User();
        user.addToCart(this);
    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        ArrayList<Movie> tr = new ArrayList<>();
        for (int i = 0; i <movieCatalog.size() ; i++) {
            if (movieCatalog.get(i).getAuteur() == this.getAuteur()) {
                tr.add(movieCatalog.get(i));
            }

        }
        return tr;
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
