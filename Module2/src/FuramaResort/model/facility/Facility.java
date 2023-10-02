package FuramaResort.model.facility;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double usableArea;
    private int rentalCosts;
    private int maximumNumberOfPeople;
    private String rentalType;

    public Facility(String idService, String nameService, double usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Id Service = " + idService +
                ", Name Service = " + nameService +
                ", Usable Area = " + usableArea +
                ", Rental Costs = " + rentalCosts +
                ", Maximum Number Of People = " + maximumNumberOfPeople +
                ", Rental Type = " + rentalType + "\n";
    }
}
