package bai_tap_them.VehicleManagement.service;

import bai_tap_them.VehicleManagement.model.Trucks;
import bai_tap_them.VehicleManagement.model.Vehicle;
import bai_tap_them.VehicleManagement.repository.TrucksRepository;

import java.util.List;

public class TrucksService implements IVehicleService<Trucks> {
    private final TrucksRepository trucksRepository = new TrucksRepository();

    @Override
    public void createVehicle(Trucks trucks) {
        trucksRepository.createVehicle(trucks);
    }

    @Override
    public List<Trucks> showVehicle() {
        return trucksRepository.showVehicle();
    }

    @Override
    public void removeVehicle(String licensePlates) {
        trucksRepository.removeVehicle(licensePlates);
    }

    @Override
    public Vehicle findVehicle(String licensePlates) {
        return trucksRepository.findVehicle(licensePlates);
    }
}