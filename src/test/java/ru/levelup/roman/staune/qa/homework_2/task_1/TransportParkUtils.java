package ru.levelup.roman.staune.qa.homework_2.task_1;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.Vehicle;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.bus.Bus;

import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("########################################");
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
        System.out.println("########################################");
        System.out.println("Сортировка парка по расходу топлива");
        printPark(park);
    }

    void findBusByManufacturer(TransportPark park, String manufacturer) {
        List<Bus> findResult = park.getVehicles().stream()
                .filter(vehicle -> vehicle instanceof Bus)
                .map(vehicle -> (Bus) vehicle)
                .filter(bus -> bus.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
        System.out.println("########################################");
        System.out.printf("Список автобусов производителя \"%s\" в парке \"%s\":\n", manufacturer, park.getName());
        if (findResult.isEmpty()) {
            System.out.println("Не найдено ни одного автобуса");
        } else {
            findResult.forEach(System.out::println);
        }
    }
}
