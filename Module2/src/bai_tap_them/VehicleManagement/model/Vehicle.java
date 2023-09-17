package bai_tap_them.VehicleManagement.model;

public abstract class Vehicle {
    private int licensePlates;
    private String manufacturer;
    private int yearOfManufacture;
    private String owner;

    public Vehicle(int licensePlates, String manufacturer, int yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public Vehicle() {

    }

    public void setLicensePlates(int licensePlates) {
        this.licensePlates = licensePlates;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLicensePlates() {
        return licensePlates;
    }

    public String getManufacturer() {
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
        return "licensePlates='" + licensePlates + '\t' +
                ", manufacturer='" + manufacturer + '\t' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\t';
    }
}
