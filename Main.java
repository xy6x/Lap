import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("JAVA", "yousef", "11401", 550.50, 10);
        Review z = new Review("good ", 4, " java ");
        b1.addReview(z);
        User u1= new User("abdullah","abdullah@gmail.com");
        User u2= new User("wiled","wilou@gmail.com");
        User u3= new User("yaser","yooou@gmail.com");
        User u4= new User("bader","baeu@gmail.com");

        System.out.println(b1.toString());
//        b1.purchase(b1);
        System.out.println(b1.getStock());
        b1.isBestseller();
//                    User u = new User();
        System.out.println(u1.getPurchaseMediaList());
//        u1.getPurchaseMediaList();
//        u1.addToCart(b1);
//        System.out.println(u1.getShoppingCart());
//        u1.checkOut();
//        System.out.println(u1.getShoppingCart());
//        b1.purchase(u1);
//        u1.getShoppingCart();
//        System.out.println("---------------------------------------");
//
//        Book b2 = new Book("C#", "Kalide", "114570", 700, 12);
//        Review z2 = new Review("excellent ", 5, " java ");
//        b2.addReview(z2);
//        System.out.println(b2.toString());
//        System.out.println("---------------------------------------");
//
//        Book b3 = new Book("C", "yousef", "114545", 950, 41);
//        Review z3 = new Review("very good ", 5, " java ");
//        b3.addReview(z3);
//        System.out.println(b3.toString());
//        System.out.println("---------------------------------------");
//
//
//        Book b4 = new Book("Python", "yousef", "11221", 250, 13);
//        Review z4 = new Review("not good ", 2, " java ");
//
//        b4.addReview(z4);
//        System.out.println(b4.toString());
        Movie m1= new Movie("JP", "yousef", "1101", 40,3);
        Movie m2= new Movie("R", "saleh", "1151", 20,2);
        Movie m3= new Movie("GO", "naser", "1501", 10,1);
        Movie m4= new Movie("OutSystem", "yousef", "1102", 35,3);
        Movie m=new Movie();
        ArrayList<Movie> M30 =new ArrayList<Movie>();
        M30.add(m1);
        M30.add(m2);
        M30.add(m3);
        M30.add(m4);
        m.recommendSimilarMovies(M30);
        m1.watch(u1);
        m2.watch(u2);
        m3.watch(u3);
        m4.watch(u4);
        Music m25 =new Music();
        Music mm1= new Music("HE","Yousef","1121",2.5);
        ArrayList<Music> m26 =new ArrayList<Music>();
        m26.add(mm1);
        mm1.generatePlaylist(m26);

    }
}