package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.tram;

public class CitadisTram extends Tram {
    private static final String MANUFACTURER = "Alstom";
    private static final double MAX_SPEED = 70;

    public CitadisTram(String title, double fuelConsumption, double price, int passengerCapacity) {
        super(MANUFACTURER, title, MAX_SPEED, fuelConsumption, price, passengerCapacity);
    }
}
