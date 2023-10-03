package FuramaResort.model.facility;

public class Villa extends Facility {
    private String roomStandards;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String idService, String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandards, double poolArea, int numberOfFloors) {
        super(idService, nameService, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {

    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Id Service = " + getIdService() +
                ", Name Service = " + getNameService() +
                ", Usable Area = " + getUsableArea() +
                ", Rental Costs = " + getRentalCosts() +
                ", MaximumNumber Of People = " + getMaximumNumberOfPeople() +
                ", Rental Type = " + getRentalType() +
                ", Room Standards = " + getRoomStandards() +
                ", Pool Area = " + getPoolArea() +
                ", Number Of Floors = " + getNumberOfFloors() + "\n";
    }
}
