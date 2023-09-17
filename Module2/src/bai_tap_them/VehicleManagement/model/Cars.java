package bai_tap_them.VehicleManagement.model;

public class Cars extends Vehicle {
    private int numberOfSeats;
    private String carType;

    public Cars() {

    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car: licensePlates = " + this.getLicensePlates() + '\t' +
                ", manufacturer = " + this.getManufacturer() + '\t' +
                ", yearOfManufacture = " + this.getYearOfManufacture() +
                ", owner = " + this.getOwner() + '\t' +
                ", numberOfSeats = " + numberOfSeats +
                ", vehicleType = " + carType;
    }
}
