package ru.levelup.roman.staune.qa.homework_2.task_1;

public class Car extends Vehicle {


    protected Car(double maxSpeed, FuelType fuelType, double fuelConsumption, double price, double passengerCapacity) {
        super(maxSpeed, fuelType, fuelConsumption, price, passengerCapacity);
    }

    @Override
    public void drive(int speed) {
        System.out.printf("Едем со скоростью %d км/ч\n", speed);
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
