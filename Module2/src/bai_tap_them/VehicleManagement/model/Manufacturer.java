package bai_tap_them.VehicleManagement.model;

public class Manufacturer {
    private final int manufacturerId;
    private final String manufacturerName;
    private final String nation;

    public Manufacturer(int manufacturerId, String manufacturerName, String nation) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "manufacturer Id: " + manufacturerId +
                ", manufacturer name: " + manufacturerName +
                ", with nation: " + nation;
    }
}
