package bai_tap_them.VehicleManagement.controller;

import bai_tap_them.VehicleManagement.model.Cars;
import bai_tap_them.VehicleManagement.model.Vehicle;
import bai_tap_them.VehicleManagement.service.CarsService;

import java.util.List;

public class CarController {
    private final CarsService carService = new CarsService();

    public List<Cars> showCar() {
        return carService.showVehicle();
    }

    public void createCar(Cars cars) {
        carService.createVehicle(cars);
    }

    public void removeCar(String licensePlates) {
        carService.removeVehicle(licensePlates);
    }

    public Vehicle findCar(String licensePlates) {
        return carService.findVehicle(licensePlates);
    }
}
