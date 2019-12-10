package ru.levelup.roman.staune.qa.homework_2.task_1;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TransportPark {
    private String name;
    private List<Vehicle> vehicles;

    public TransportPark(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}