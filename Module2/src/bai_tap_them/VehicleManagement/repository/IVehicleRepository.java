package bai_tap_them.VehicleManagement.repository;

import bai_tap_them.VehicleManagement.model.Vehicle;

import java.util.List;

public interface IVehicleRepository<E> {
    void createVehicle(E e);

    List<E> showVehicle();

    void removeVehicle(String licensePlates);

    Vehicle findVehicle(String licensePlates);

}
