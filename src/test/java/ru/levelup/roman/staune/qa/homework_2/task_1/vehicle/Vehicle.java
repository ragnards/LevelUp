package ru.levelup.roman.staune.qa.homework_2.task_1.vehicle;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.enums.FuelType;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.interfaces.Drivable;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.interfaces.PeopleCarriage;

public abstract class Vehicle implements Drivable, PeopleCarriage {
    private String manufacturer;
    private String title;
    private double maxSpeed;
    private FuelType fuelType;
    private double fuelConsumption;
    private double price;
    private int passengerCapacity;

    public Vehicle(String manufacturer, String title, double maxSpeed, FuelType fuelType,
                   double fuelConsumption, double price, int passengerCapacity) {
        this.manufacturer = manufacturer;
        this.title = title;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.passengerCapacity = passengerCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", title='" + title + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelType=" + fuelType +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
