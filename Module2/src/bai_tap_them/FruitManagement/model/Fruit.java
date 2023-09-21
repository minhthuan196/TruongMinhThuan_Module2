package bai_tap_them.FruitManagement.model;

public class Fruit {
    private String nameFruit;
    private int typeFruit;
    private String dateOfManufacture;
    private int expiry;
    private String origin;
    private double price;

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public int getTypeFruit() {
        return typeFruit;
    }

    public void setTypeFruit(int typeFruit) {
        this.typeFruit = typeFruit;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fruit(String nameFruit, int typeFruit, String dateOfManufacture, int expiry, String origin, double price) {
        this.nameFruit = nameFruit;
        this.typeFruit = typeFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.origin = origin;
        this.price = price;
    }

    public Fruit() {

    }

    @Override
    public String toString() {
        return "nameFruit = " + nameFruit +
                ", typeFruit = " + typeFruit +
                ", dateOfManufacture = " + dateOfManufacture +
                ", expiry = " + expiry +
                ", origin = " + origin +
                ", price = " + price+"\n";
    }
}
