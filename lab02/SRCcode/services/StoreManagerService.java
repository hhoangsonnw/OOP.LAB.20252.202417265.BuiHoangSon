package SRCCode.services;

import SRCCode.DVD;
import SRCCode.Cart;
import SRCCode.models.Inventory;
import SRCCode.models.Order;
import java.util.List;
import java.util.ArrayList;

public class StoreManagerService {

    public boolean loginManager(String username, String password) {
        return true;
    }

    public boolean addDVD(DVD dvd) {
        return true;
    }

    public boolean removeDVD(String dvdId) {
        return true;
    }

    public boolean updateDVD(DVD dvd) {
        return true;
    }

    public Inventory reviewInventory() {
        return new Inventory();
    }

    public List<Order> viewOrders() {
        return new ArrayList<Order>();
    }

    public boolean updateOrderStatus(String orderId, String newStatus) {
        return true;
    }
}