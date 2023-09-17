package bai_tap_them.VehicleManagement.model;

public class Trucks extends Vehicle {
    private int payload;

    public Trucks() {

    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Car: licensePlates = " + this.getLicensePlates() + '\t' +
                ", manufacturer = " + this.getManufacturer() + '\t' +
                ", yearOfManufacture = " + this.getYearOfManufacture() +
                ", owner = " + this.getOwner() + '\t' +
                ", payload = " + payload;
    }
}
