package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;

public class Car extends Vehicle {

    public Car(String manufacturer, String title, double maxSpeed, FuelType fuelType,
               double fuelConsumption, double price, int passengerCapacity) {
        super(manufacturer, title, maxSpeed, fuelType, fuelConsumption, price, passengerCapacity);
    }

    @Override
    public void drive(double speed) {
        System.out.printf("Едем со скоростью %0.2f км/ч\n", speed);
    }

    @Override
    public void stop() {
        System.out.println("Делаем остановку");
    }

    @Override
    public void boarding() {
        System.out.println("Идет посадка/высадка пассажиров");
    }
}
