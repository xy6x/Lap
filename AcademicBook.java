public class AcademicBook extends  Book {
    private  String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price, stock);
    }

    public String getMediaType(){
        return null;
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
