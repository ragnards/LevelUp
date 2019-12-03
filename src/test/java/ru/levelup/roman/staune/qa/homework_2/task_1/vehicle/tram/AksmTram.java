package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.tram;

public class AksmTram extends Tram {
    private static final String MANUFACTURER = "Белкоммунмаш";
    private static final String TITLE = "АКСМ-843";
    private static final double MAX_SPEED = 100;
    private static final int CAPACITY = 226;

    public AksmTram(double fuelConsumption, double price) {
        super(MANUFACTURER, TITLE, MAX_SPEED, fuelConsumption, price, CAPACITY);
    }
}
