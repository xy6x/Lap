import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private int artist ;

    public Music(){

}
    public Music(String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
    }

    public void listen(User user){
        User u1 = new User();
        user.addToCart(this);

    }
    public ArrayList<Music> generatePlaylist(List<Music> musicCatalog){

        ArrayList<Music> tb = new ArrayList<>();
        for (int i = 0; i <musicCatalog.size() ; i++) {
            if (musicCatalog.get(i).getAuteur() == this.getAuteur()) {
                tb.add(musicCatalog.get(i));
            }

        }
        return tb;

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
