package ru.levelup.roman.staune.qa.homework_2.task_1;

abstract class Vehicle implements Drivable, PeopleCarriage {
    private double maxSpeed;
    private FuelType fuelType;
    private double fuelConsumption;
    private double price;
    private double passengerCapacity;

    protected Vehicle(double maxSpeed, FuelType fuelType, double fuelConsumption, double price, double passengerCapacity) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.passengerCapacity = passengerCapacity;
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

    public void setPassengerCapacity(double passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
