import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("JAVA", "yousef", "11401", 550.50, 10);
        Review z = new Review("good ", 4, " java ");
        b1.purchase(b1);
        b1.addReview(z);
        System.out.println(b1.toString());
        b1.getStock();
        b1.isBestseller();

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

    }
}