import java.util.ArrayList;

public class User {
    private String username;
    private String email;

    private ArrayList<Media> purchaseMediaList = new ArrayList();

    private ArrayList<Integer> shoppingCart = new ArrayList();

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media) {

        purchaseMediaList.add(media);
        for (int i = 0; i < purchaseMediaList.size(); i++) {
            Media r = purchaseMediaList.get(i);
            System.out.println(r.getPrice() + r.getAuteur());

        }

    }

    public void removeFromCart(Media media) {

    }

    public void checkOut() {

    }

}
