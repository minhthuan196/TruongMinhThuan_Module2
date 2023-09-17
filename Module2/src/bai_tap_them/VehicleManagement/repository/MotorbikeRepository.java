package bai_tap_them.VehicleManagement.repository;

import bai_tap_them.VehicleManagement.model.Motorbikes;
import bai_tap_them.VehicleManagement.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeRepository implements IVehicleRepository<Motorbikes> {
    Scanner scanner = new Scanner(System.in);
    private final List<Motorbikes> motorbikesList = new ArrayList<>();

    @Override
    public void createVehicle(Motorbikes motorbikes) {
        this.motorbikesList.add(motorbikes);
    }

    @Override
    public List<Motorbikes> showVehicle() {
        return this.motorbikesList;
    }

    @Override
    public void removeVehicle(String licensePlates) {
        for (Motorbikes motorbikes : this.motorbikesList) {
            if (motorbikes.getLicensePlates().equalsIgnoreCase(licensePlates)) {
                System.out.println("Are you sure you want to delete it? (Yes/No)");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    this.motorbikesList.remove(motorbikes);
                    System.out.println("Remove successfully");
                    return;
                } else if (confirm.equalsIgnoreCase("No")) {
                    System.out.println("Cancel remove");
                    return;
                }
            } else {
                System.out.println("Could not find the license plate of the motorbike that needs to be remove");
            }
        }
    }

    @Override
    public Vehicle findVehicle(String licensePlates) {
        for (Motorbikes motorbikes : this.motorbikesList) {
            if (motorbikes.getLicensePlates().equalsIgnoreCase(licensePlates)) {
                return motorbikes;
            }
        }
        return null;
    }
}
