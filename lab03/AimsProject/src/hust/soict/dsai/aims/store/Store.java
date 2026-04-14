package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DVD;

public class Store {
    private DVD[] itemsInStore;
    private int count;

    public Store(int capacity) {
        this.itemsInStore = new DVD[capacity];
        this.count = 0;
    }

    public boolean addDVD(DVD dvd) {
        if (dvd == null) {
            return false;
        }
        if (count >= itemsInStore.length) {
            return false;
        }
        itemsInStore[count] = dvd;
        count++;
        return true;
    }

    public boolean removeDVD(DVD dvd) {
        if (dvd == null) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < count - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public void displayStore() {
        System.out.println("Store Inventory (" + count + " items):");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].getTitleValue() + " - " + 
                             itemsInStore[i].getCategories() + " - " + 
                             itemsInStore[i].getDirector() + " - $" + itemsInStore[i].getCost());
        }
    }

    public int getItemCount() {
        return count;
    }

    public DVD[] getItemsInStore() {
        return itemsInStore;
    }
}
