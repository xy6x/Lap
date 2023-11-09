import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Review> reviews = new ArrayList();

    public Book() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }



    public void addReview(Review r) {

        reviews.add(r);

    }
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public double getAverageRating() {
        Review t = new Review();
        double a = 0;
        for (int i = 0; i < reviews.size(); i++) {
            Review r = reviews.get(i);
            a += r.getRating();
            System.out.println(a / (i + 1));
        }
        return a;

    }

    public String getReviews() {


        for (int i = 0; i <= reviews.size(); i++) {
            Review r = reviews.get(i);
            return r.getUsername() + r.getComment() + r.getRating();


        }
        return null;
    }


    public void purchase(User user) {


            user.addToCart(this);
        if (stock >= 0) {
            stock--;

        }else System.out.println("not ");



    }

    public boolean isBestseller() {
        if (getAverageRating() >= 4.5) {
            return true;
        }

        return false;
    }

    public void restock(int quantity) {
        stock += quantity;
    }

    public String getMediaType() {
        return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + getStock() +
                ", reviews=" + getReviews() + '}' + super.toString();
    }
}
