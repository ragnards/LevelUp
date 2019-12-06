package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;

public abstract class Electrobus extends Vehicle {

    public Electrobus(String manufacturer, String title, double maxSpeed, double fuelConsumption,
                      double price, int passengerCapacity) {
        super(manufacturer, title, maxSpeed, FuelType.ELECTRIC_POWER, fuelConsumption, price, passengerCapacity);
    }
}
