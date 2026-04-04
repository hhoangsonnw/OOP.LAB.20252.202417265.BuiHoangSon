package SRCCode.services;

import SRCCode.DVD;
import SRCCode.Cart;
import SRCCode.models.Media;
import SRCCode.models.Order;
import java.util.List;
import java.util.ArrayList;

public class UserService {

    public boolean loginUser(String username, String password) {
        return true;
    }

    public boolean register(String userDetails) {
        return true;
    }

    public List<Media> searchMedia(String keyword) {
        return new ArrayList<Media>();
    }

    public Media viewMedia(String mediaId) {
        return new Media();
    }

    public boolean addToCart(String mediaId) {
        return true;
    }

    public Cart viewCart() {
        return new Cart();
    }

    public boolean updateCart(Cart updatedCart) {
        return true;
    }

    public Order placeOrder(Cart cart) {
        boolean shippingEntered = enterShippingInfo("123 Main St...");
        boolean paymentProcessed = processPayment(cart.getCalculateCost());

        if (shippingEntered && paymentProcessed) {
            return new Order();
        }
        return null;
    }

    public Order trackOrders(String orderId) {
        return new Order();
    }

    private boolean processPayment(double amount) {
        return true;
    }

    private boolean enterShippingInfo(String shippingDetails) {
        return true;
    }
}