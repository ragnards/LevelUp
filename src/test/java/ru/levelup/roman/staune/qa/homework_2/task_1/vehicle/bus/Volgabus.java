package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.bus;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;

public class Volgabus extends Bus {
    private static final String MANUFACTURER = "ВАП Волжанин";
    private static final double MAX_SPEED = 120;
    private static final double FUEL_CONSUMPTION = 42.5;

    public Volgabus(String title, double price, int passengerCapacity) {
        super(MANUFACTURER, title, MAX_SPEED, FuelType.DIESEL, FUEL_CONSUMPTION, price, passengerCapacity);
    }
}
