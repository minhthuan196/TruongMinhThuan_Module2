package bai_tap_them.VehicleManagement.repository;

import bai_tap_them.VehicleManagement.model.Trucks;
import bai_tap_them.VehicleManagement.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrucksRepository implements IVehicleRepository<Trucks> {
    Scanner scanner = new Scanner(System.in);
    private final List<Trucks> trucksList = new ArrayList<>();

    @Override
    public void createVehicle(Trucks trucks) {
        this.trucksList.add(trucks);
    }

    @Override
    public List<Trucks> showVehicle() {
        return this.trucksList;
    }

    @Override
    public void removeVehicle(String licensePlates) {
        for (Trucks trucks : this.trucksList) {
            if (trucks.getLicensePlates().equalsIgnoreCase(licensePlates)) {
                System.out.println("Are you sure you want to delete it? (Yes/No)");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    this.trucksList.remove(trucks);
                    System.out.println("Remove successfully");
                    return;
                } else if (confirm.equalsIgnoreCase("No")) {
                    System.out.println("Cancel remove");
                    return;
                }
            } else {
                System.out.println("Could not find the license plate of the Trunk that needs to be remove");
            }
        }
    }

    @Override
    public Vehicle findVehicle(String licensePlates) {
        for (Trucks trucks : this.trucksList) {
            if (trucks.getLicensePlates().equalsIgnoreCase(licensePlates)) {
                return trucks;
            }
        }
        return null;
    }
}
