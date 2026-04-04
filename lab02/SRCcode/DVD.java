package SRCcode;

public class DVD {

    private String title;
    private String categories;
    private String director;
    private float cost;
    private int length;
    private String warranty;

    public DVD() {}

    public String getTitle() {
        return title;
    }

    public String getCategories() {
        return categories;
    }

    public String getDirector() {
        return director;
    }

    public float getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public String getWarranty() {
        return warranty;
    }

    // Optional: mô tả DVD
    public String DVDdesc() {
        return "Title: " + title +
               ", Categories: " + categories +
               ", Director: " + director +
               ", Cost: " + cost +
               ", Length: " + length +
               ", Warranty: " + warranty;
    }
}
