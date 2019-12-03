package ru.levelup.roman.staune.qa.homework_2.task_1;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.Vehicle;

import java.util.List;

class TransportParkUtils {
    void printPark(TransportPark park) {
        System.out.printf("Транспортный парк %s:\n", park.getName());
        park.getVehicles().forEach(System.out::println);
    }

    void calculateParkCost(TransportPark park) {
        double cost = 0;
        for (Vehicle vehicle : park.getVehicles()) {
            cost = cost + vehicle.getPrice();
        }
        System.out.printf("Стоимость транспорного парка %s: %.2f\n", park.getName(), cost);
    }

    void sortByFuelConsumption(TransportPark park) {
        List<Vehicle> vehicles = park.getVehicles();
        vehicles.sort((Vehicle o1, Vehicle o2) -> {
            if (o1.getFuelType() != o2.getFuelType()) {
                return o1.getFuelType().compareTo(o2.getFuelType());
            }
            if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
                return 1;
            } else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
                return -1;
            }
            return 0;
        });

        System.out.println("Сортировка парка по расходу топлива");
        printPark(park);
    }
}
