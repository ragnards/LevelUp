package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.aquabus;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;

public class MarlinAquabus extends Aquabus {
    private static final String MANUFACTURER = "Astron Marine";
    private static final double MAX_SPEED = 60;
    private static final int CAPACITY = 12;

    public MarlinAquabus(String title, double fuelConsumption, double price) {
        super(MANUFACTURER, title, MAX_SPEED, FuelType.DIESEL, fuelConsumption, price, CAPACITY);
    }
}
