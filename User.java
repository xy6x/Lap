import java.util.ArrayList;

public class User{
    private String username;
    private String email;
public User(){

}
    public User(String username, String email, ArrayList<ArrayList<Media>> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    private ArrayList<ArrayList<Media>> purchaseMediaList = new ArrayList();

    private ArrayList<Media> shoppingCart = new ArrayList();

    public ArrayList<ArrayList<Media>> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<ArrayList<Media>> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media) {

         shoppingCart.add(media);
        for (int i = 0; i < shoppingCart.size(); i++) {
            Media r = shoppingCart.get(i);
            System.out.println(r.getAuteur()+" "+r.getPrice()+" "+r.getISBN() +" "+ r.getTitle());

        }

    }

    public void removeFromCart(Media media) {

    }

    public void checkOut() {
        purchaseMediaList.add(shoppingCart);
        for (ArrayList p:purchaseMediaList
             ) {
            System.out.println(p.toString());

        }
        shoppingCart.removeLast();

        Book b =new Book();

    }

}
