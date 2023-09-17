package bai_tap_them.VehicleManagement.controller;

import bai_tap_them.VehicleManagement.model.Motorbikes;
import bai_tap_them.VehicleManagement.model.Vehicle;
import bai_tap_them.VehicleManagement.service.MotorbikeService;

import java.util.List;

public class MotorbikeController {
    private final MotorbikeService motobikeService = new MotorbikeService();

    public List<Motorbikes> showMotorbike() {
        return motobikeService.showVehicle();
    }

    public void createMotorbike(Motorbikes motorbikes) {
        motobikeService.createVehicle(motorbikes);
    }

    public void removeMotorbike(String licensePlates) {
        motobikeService.removeVehicle(licensePlates);
    }

    public Vehicle findMotorbike(String licensePlates) {
        return motobikeService.findVehicle(licensePlates);
    }
}
