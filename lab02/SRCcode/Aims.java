package SRCcode;
import java.util.Scanner;

public class Aims {

    private static Cart cart = new Cart();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageStore();
                    break;
                case 2:
                    viewMedia();
                    break;
                case 3:
                    addToCart();
                    break;
                case 4:
                    placeOrder();
                    break;
                case 5:
                    payment();
                    break;
                case 0:
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }


    public static void manageStore() {

    }

    public static void viewMedia() {
    }

    public static void addToCart() {
    }

    public static void placeOrder() {
    }

    public static void payment() {
    }


    public static void showMenu() {
        System.out.println("1. Manage store");
        System.out.println("2. View media");
        System.out.println("3. Add to cart");
        System.out.println("4. Place order");
        System.out.println("5. Payment");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }
}