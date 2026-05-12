package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
    private String warranty;

    public DigitalVideoDisc(String title) {
        this.setId(++nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory("Unknown");
        this.director = "Unknown";
        this.setCost(0.0f);
        this.length = 0;
        this.warranty = "No warranty";
    }

    public DigitalVideoDisc(String title, String category, String director,
                           float cost, int length, String warranty) {
        this.setId(++nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.setCost(cost);
        this.length = length;
        this.warranty = warranty;
    }

    public DigitalVideoDisc(String title, String category, String director,
                           int length, float cost) {
        this.setId(++nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.setCost(cost);
        this.length = length;
        this.warranty = "No warranty";
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.setId(++nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.director = "Unknown";
        this.setCost(cost);
        this.length = 0;
        this.warranty = "No warranty";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.getTitle() + " | Director: " + director + 
                         " | Category: " + this.getCategory() + " | Price: $" + this.getCost());
    }

    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + director + 
               " - " + length + ": " + this.getCost() + " $";
    }

    public boolean isMatch(String searchTitle) {
        return this.getTitle().toLowerCase().contains(searchTitle.toLowerCase());
    }
}
