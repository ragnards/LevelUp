package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.aquabus;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.Car;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;

public class Aquabus extends Car {
    public Aquabus(String manufacturer, String title, double maxSpeed, FuelType fuelType,
                   double fuelConsumption, double price, int passengerCapacity) {
        super(manufacturer, title, maxSpeed, fuelType, fuelConsumption, price, passengerCapacity);
    }

    @Override
    public void drive(double speed) {
        System.out.printf("Аквабус %s плывет со скоростью %.2f км/ч\n", getTitle(), speed);
    }

    @Override
    public void stop() {
        System.out.printf("Аквабус %s делает остановку\n", getTitle());
    }

    @Override
    public void boarding() {
        System.out.println("Идет посадка/высадка пассажиров из аквабуса " + getTitle());
    }
}
