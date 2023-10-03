package FuramaResort.model.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String idService, java.lang.String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(idService, nameService, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room() {

    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Id Service = " + getIdService() +
                ", Name Service = " + getNameService() +
                ", Usable Area = " + getUsableArea() +
                ", Rental Costs = " + getRentalCosts() +
                ", MaximumNumber Of People = " + getMaximumNumberOfPeople() +
                ", Rental Type = " + getRentalType() +
                ", Free Service Included = " + getFreeServiceIncluded() + "\n";
    }
}
