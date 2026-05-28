package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DVD;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void main(String[] args) {
        testStore();
        System.out.println("\n" + "=".repeat(50) + "\n");
        testCart();
    }

    public static void testStore() {
        System.out.println(">>> TESTING STORE <<<\n");
        
        Store store = new Store(10);

        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 19.95f, 87, "1 year warranty");
        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 24.95f, 87, "1 year warranty");
        DVD dvd3 = new DVD("Aladin", "Animation", "Ron Clements", 18.99f, 90, "1 year warranty");
        DVD dvd4 = new DVD("Inception", "Science Fiction", "Christopher Nolan", 14.95f, 148, "1 year warranty");
        DVD dvd5 = new DVD("Avatar", "Science Fiction", "James Cameron", 22.95f, 162, "1 year warranty");

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        store.addDVD(dvd5);

        System.out.println("=== Store Before Removal ===");
        store.displayStore();

        store.removeDVD(dvd2);
        store.removeDVD(dvd4);

        System.out.println("\n=== Store After Removal ===");
        store.displayStore();

        System.out.println("\nTotal items: " + store.getItemCount());
    }

    public static void testCart() {
        System.out.println(">>> TESTING SHOPPING CART <<<\n");
        
        Cart cart = new Cart();

        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 19.95f, 87, "1 year warranty");
        cart.addDigitalVideoDisc(dvd1);

        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 24.95f, 87, "1 year warranty");
        cart.addDigitalVideoDisc(dvd2);

        DVD dvd3 = new DVD("Aladin", "Animation", "Ron Clements", 18.99f, 90, "1 year warranty");
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("=== Test printCart() ===");
        cart.printCart();

        System.out.println("\n=== Test searchCartByTitle() ===");
        System.out.println("\nSearching for 'Lion':");
        cart.searchCartByTitle("Lion");

        System.out.println("\nSearching for 'Star':");
        cart.searchCartByTitle("Star");

        System.out.println("\nSearching for 'Aladdin':");
        cart.searchCartByTitle("Aladdin");

        System.out.println("\nSearching for 'Frozen' (not in cart):");
        cart.searchCartByTitle("Frozen");

        System.out.println("\n=== Test searchCartById() ===");
        cart.searchCartById(1);

        System.out.println("\n=== Test DigitalVideoDisc.isMatch() ===");
        DigitalVideoDisc ddvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc ddvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);

        System.out.println("ddvd1.isMatch('Lion'): " + ddvd1.isMatch("Lion"));
        System.out.println("ddvd1.isMatch('King'): " + ddvd1.isMatch("King"));
        System.out.println("ddvd2.isMatch('Wars'): " + ddvd2.isMatch("Wars"));
        System.out.println("ddvd2.isMatch('Trek'): " + ddvd2.isMatch("Trek"));

        System.out.println("\n=== Test DigitalVideoDisc.toString() ===");
        System.out.println(ddvd1.toString());
        System.out.println(ddvd2.toString());
    }
}
