package bai_tap_them.VehicleManagement.repository;

import bai_tap_them.VehicleManagement.model.Cars;
import bai_tap_them.VehicleManagement.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarsRepository implements IVehicleRepository<Cars> {
    Scanner scanner = new Scanner(System.in);
    private final List<Cars> carsList = new ArrayList<>();

    @Override
    public void createVehicle(Cars cars) {
        this.carsList.add(cars);
    }

    @Override
    public List<Cars> showVehicle() {
        return this.carsList;
    }

    @Override
    public void removeVehicle(String licensePlates) {
        for (Cars cars : this.carsList) {
            if (cars.getLicensePlates().equalsIgnoreCase(licensePlates)) {
                System.out.println("Are you sure you want to delete it? (Yes/No)");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    this.carsList.remove(cars);
                    System.out.println("Remove successfully");
                    return;
                } else if (confirm.equalsIgnoreCase("No")) {
                    System.out.println("Cancel remove");
                    return;
                }
            } else {
                System.out.println("Could not find the license plate of the Car that needs to be remove");
            }
        }
    }

    @Override
    public Vehicle findVehicle(String licensePlates) {
        for (Cars cars : this.carsList) {
            if (cars.getLicensePlates().equalsIgnoreCase(licensePlates)) {
                return cars;
            }
        }
        return null;
    }
}
