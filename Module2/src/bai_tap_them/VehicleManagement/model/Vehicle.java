package bai_tap_them.VehicleManagement.model;

public abstract class Vehicle {
    private String licensePlates;
    private Manufacturer manufacturer;
    private int yearOfManufacture;
    private String owner;

    public Vehicle(String licensePlates, Manufacturer manufacturer, int yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public Vehicle() {

    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "licensePlates = " + licensePlates + '\t' +
                ", manufacturer = " + manufacturer + '\t' +
                ", yearOfManufacture = " + yearOfManufacture +
                ", owner = " + owner + '\t';
    }
}
