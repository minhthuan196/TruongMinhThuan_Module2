package FuramaResort.model.facility;

public class House extends Facility {
    private String roomStandards;
    private int numberOfFloors;

    public House(String idService, java.lang.String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandards, int numberOfFloors) {
        super(idService, nameService, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandards = roomStandards;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {

    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
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
                ", Number Of Floors = " + getNumberOfFloors() + "\n";
    }
}
