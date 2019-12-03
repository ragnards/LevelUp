package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.aquabus;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;

public class HitekAquabus extends Aquabus {
    private static final String MANUFACTURER = "EK Marine Global";
    private static final double MAX_SPEED = 60;
    private static final int CAPACITY = 12;

    public HitekAquabus(String title, double fuelConsumption, double price) {
        super(MANUFACTURER, title, MAX_SPEED, FuelType.DIESEL, fuelConsumption, price, CAPACITY);
    }
}
