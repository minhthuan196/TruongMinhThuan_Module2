package FuramaResort.model.facility;

public class Room extends Facility {
    private java.lang.String freeServiceIncluded;

    public Room(int idService, java.lang.String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, java.lang.String freeServiceIncluded) {
        super(idService, nameService, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(java.lang.String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room() {

    }

    public java.lang.String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(java.lang.String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public java.lang.String toString() {
        return "Id Service = " + getIdService() +
                ", Name Service = " + getNameService() +
                ", Usable Area = " + getUsableArea() +
                ", Rental Costs = " + getRentalCosts() +
                ", MaximumNumber Of People = " + getMaximumNumberOfPeople() +
                ", Rental Type = " + getRentalType() +
                ", Free Service Included = " + freeServiceIncluded + "\n";
    }
}
