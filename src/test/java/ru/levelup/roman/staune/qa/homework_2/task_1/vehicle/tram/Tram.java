package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.tram;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.Electrobus;

class Tram extends Electrobus {

    public Tram(String manufacturer, String title, double maxSpeed,
                double fuelConsumption, double price, int passengerCapacity) {
        super(manufacturer, title, maxSpeed, fuelConsumption, price, passengerCapacity);
    }

    @Override
    public void drive(double speed) {
        System.out.printf("Трамвай %s едет со скоростью %.2f км/ч\n", getTitle(), speed);
    }

    @Override
    public void stop() {
        System.out.printf("Трамвай %s делает остановку\n", getTitle());
    }

    @Override
    public void boarding() {
        System.out.println("Идет посадка/высадка пассажиров из трамвая " + getTitle());
    }
}
