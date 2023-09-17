package bai_tap_them.VehicleManagement.controller;

import bai_tap_them.VehicleManagement.model.Trucks;
import bai_tap_them.VehicleManagement.model.Vehicle;
import bai_tap_them.VehicleManagement.service.TrucksService;

import java.util.List;

public class TruckController {
    private final TrucksService truckService = new TrucksService();

    public List<Trucks> showTruck() {
        return truckService.showVehicle();
    }

    public void createTruck(Trucks trucks) {
        truckService.createVehicle(trucks);
    }

    public void removeTruck(String licensePlates) {
        truckService.removeVehicle(licensePlates);
    }

    public Vehicle findTrunk(String licensePlates) {
        return truckService.findVehicle(licensePlates);
    }
}
