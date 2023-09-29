package FuramaResort.model.facility;

public class House extends Facility {
    private java.lang.String roomStandards;
    private int numberOfFloors;

    public House(int idService, java.lang.String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, java.lang.String roomStandards, int numberOfFloors) {
        super(idService, nameService, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandards = roomStandards;
        this.numberOfFloors = numberOfFloors;
    }

    public House(java.lang.String roomStandards, int numberOfFloors) {
        this.roomStandards = roomStandards;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {

    }

    public java.lang.String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(java.lang.String roomStandards) {
        this.roomStandards = roomStandards;
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
                ", Number Of Floors = " + numberOfFloors + "\n";
    }
}
