package bai_tap_them.VehicleManagement.service;

import bai_tap_them.VehicleManagement.model.Motorbikes;
import bai_tap_them.VehicleManagement.model.Vehicle;
import bai_tap_them.VehicleManagement.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IVehicleService<Motorbikes> {
    private final MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public void createVehicle(Motorbikes motorbikes) {
        motorbikeRepository.createVehicle(motorbikes);
    }

    @Override
    public List<Motorbikes> showVehicle() {
        return motorbikeRepository.showVehicle();
    }

    @Override
    public void removeVehicle(String licensePlates) {
        motorbikeRepository.removeVehicle(licensePlates);
    }

    @Override
    public Vehicle findVehicle(String licensePlates) {
        return motorbikeRepository.findVehicle(licensePlates);
    }
}
