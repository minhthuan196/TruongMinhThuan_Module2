package bai_tap_them.VehicleManagement.service;

import bai_tap_them.VehicleManagement.model.Cars;
import bai_tap_them.VehicleManagement.model.Vehicle;
import bai_tap_them.VehicleManagement.repository.CarsRepository;

import java.util.List;

public class CarsService implements IVehicleService<Cars> {
    private final CarsRepository carRepository = new CarsRepository();


    @Override
    public void createVehicle(Cars cars) {
        carRepository.createVehicle(cars);
    }

    @Override
    public List<Cars> showVehicle() {
        return carRepository.showVehicle();
    }

    @Override
    public void removeVehicle(String licensePlates) {
        carRepository.removeVehicle(licensePlates);
    }

    @Override
    public Vehicle findVehicle(String licensePlates) {
        return carRepository.findVehicle(licensePlates);
    }
}
