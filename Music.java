import java.util.List;

public class Music extends Media{
    private int artist ;

    public Music(String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
    }

    public void listen(User user){

    }
    public List<Music> generatePlaylist(List<Music> musicCatalog){
        return null;
    }

    public String getMediaType(){
        return null;
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
