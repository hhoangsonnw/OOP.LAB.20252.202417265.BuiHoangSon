package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.disc.DVD;

public class Cart {

    private float calculateCost;
    private int quantityOrder;
    private final List<DVD> dvdList;

    public Cart() {
        this.dvdList = new ArrayList<>();
        this.calculateCost = 0;
        this.quantityOrder = 0;
    }

    public void addDigitalVideoDisc(DVD dvd) {
        if (dvd != null) {
            dvdList.add(dvd);
            quantityOrder++;
            calculateCost += dvd.getCost();
        }
    }

    public void addDigitalVideoDisc(DVD[] dvdArray) {
        if (dvdArray != null && dvdArray.length > 0) {
            for (DVD dvd : dvdArray) {
                if (dvd != null) {
                    dvdList.add(dvd);
                    quantityOrder++;
                    calculateCost += dvd.getCost();
                }
            }
        }
    }

    public void addDigitalVideoDisc(DVD dvd1, DVD dvd2) {
        if (dvd1 != null && dvd2 != null) {
            dvdList.add(dvd1);
            quantityOrder++;
            calculateCost += dvd1.getCost();
            
            dvdList.add(dvd2);
            quantityOrder++;
            calculateCost += dvd2.getCost();
        }
    }

    public void addDigitalVideoDisc(DVD dvd1, DVD dvd2, DVD dvd3) {
        if (dvd1 != null && dvd2 != null && dvd3 != null) {
            dvdList.add(dvd1);
            quantityOrder++;
            calculateCost += dvd1.getCost();
            
            dvdList.add(dvd2);
            quantityOrder++;
            calculateCost += dvd2.getCost();
            
            dvdList.add(dvd3);
            quantityOrder++;
            calculateCost += dvd3.getCost();
        }
    }

    public void addProduct(DVD dvd) {
        addDigitalVideoDisc(dvd);
    }

    public void removeProduct(DVD dvd) {
        if (dvdList.contains(dvd)) {
            dvdList.remove(dvd);
            quantityOrder--;
            calculateCost -= dvd.getCost();
        }
    }

    public float getCalculateCost() {
        return calculateCost;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public List<DVD> getDvdList() {
        return new ArrayList<>(dvdList);
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int itemNumber = 1;
        for (DVD dvd : dvdList) {
            System.out.println(itemNumber + ". " + dvd.getTitleValue() + " - " + 
                             dvd.getCategories() + " - " + dvd.getDirector() + 
                             " - " + dvd.getLength() + ": " + dvd.getCost() + " $");
            itemNumber++;
        }
        System.out.println("Total cost: " + calculateCost);
        System.out.println("***************************************************");
    }

    public void searchCartById(int id) {
        System.out.println("Searching for DVD with ID: " + id);
        System.out.println("(Note: DVD class doesn't have ID field. Use DigitalVideoDisc class for ID-based search)");
    }

    public void searchCartByTitle(String title) {
        System.out.println("Searching for DVD with title: " + title);
        boolean found = false;
        int resultNumber = 1;
        for (DVD dvd : dvdList) {
            if (dvd.getTitleValue().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(resultNumber + ". " + dvd.getTitleValue() + " - " + 
                                 dvd.getCategories() + " - " + dvd.getDirector() + 
                                 " - " + dvd.getLength() + ": " + dvd.getCost() + " $");
                found = true;
                resultNumber++;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
}
