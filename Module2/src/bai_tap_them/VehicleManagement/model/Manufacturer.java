package bai_tap_them.VehicleManagement.model;

public class Manufacturer {
    private int manufacturerId;
    private String manufacturerName;
    private String nation;

    public Manufacturer(int manufacturerId, String manufacturerName, String nation) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.nation = nation;
    }

    public Manufacturer() {

    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getNation() {
        return nation;
    }

    @Override
    public String toString() {
        return "Manufacturer has: " +
                "manufacturerId: " + manufacturerId +
                ", manufacturer name: " + manufacturerName +
                ", with nation: '" + nation;
    }
}
