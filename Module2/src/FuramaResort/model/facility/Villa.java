package FuramaResort.model.facility;

public class Villa extends Facility {
    private java.lang.String roomStandards;
    private double poolArea;
    private int numberOfFloors;

    public Villa(int idService, java.lang.String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, java.lang.String roomStandards, double poolArea, int numberOfFloors) {
        super(idService, nameService, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(java.lang.String roomStandards, double poolArea, int numberOfFloors) {
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {

    }

    public java.lang.String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(java.lang.String roomStandards) {
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
    public java.lang.String toString() {
        return "Id Service = " + getIdService() +
                ", Name Service = " + getNameService() +
                ", Usable Area = " + getUsableArea() +
                ", Rental Costs = " + getRentalCosts() +
                ", MaximumNumber Of People = " + getMaximumNumberOfPeople() +
                ", Rental Type = " + getRentalType() +
                ", Room Standards = " + roomStandards +
                ", Pool Area = " + poolArea +
                ", Number Of Floors = " + numberOfFloors + "\n";
    }
}
