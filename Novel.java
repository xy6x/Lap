public class Novel extends Book {
    private String genre ;

    public Novel(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price, stock);
    }

    public String getMediaType(){
        return null;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
