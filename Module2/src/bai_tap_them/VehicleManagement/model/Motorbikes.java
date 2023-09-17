package bai_tap_them.VehicleManagement.model;

public class Motorbikes extends Vehicle {
    private int wattage;

    public Motorbikes() {
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorbike: licensePlates = " + this.getLicensePlates() + '\t' +
                ", manufacturer = " + this.getManufacturer() + '\t' +
                ", yearOfManufacture = " + this.getYearOfManufacture() +
                ", owner = " + this.getOwner() + '\t' +
                ", wattage = " + wattage;
    }
}
