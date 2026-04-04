package SRCcode
public class Aims {
     public static void main(String[] args) {
        createCart();
    }

    public static void createCart() {
        Cart cart = new Cart();
        DVD dvd = new DVD("Title", "Action", "Director", 9.99f, 120, "1 year");
        cart.addProduct(dvd);
    }
}
