package bai_tap_them.VehicleManagement.model;

public class Trucks extends Vehicle {
    private int payload;

    public Trucks(int licensePlates, String manufacturer, int yearOfManufacture, String owner, int payload) {
        super(licensePlates, manufacturer, yearOfManufacture, owner);
        this.payload = payload;
    }

    public Trucks(int payload) {
        this.payload = payload;
    }

    public Trucks() {

    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Car: licensePlates= " + this.getLicensePlates() + '\t' +
                ", manufacturer= " + this.getManufacturer() + '\t' +
                ", yearOfManufacture= " + this.getYearOfManufacture() +
                ", owner=" + this.getOwner() + '\t' +
                ", payload = " + payload;
    }
}
