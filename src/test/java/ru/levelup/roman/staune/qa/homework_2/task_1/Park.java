package ru.levelup.roman.staune.qa.homework_2.task_1;

import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.aquabus.HitekAquabus;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.aquabus.MarlinAquabus;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.bus.Volgabus;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.tram.AksmTram;
import ru.levelup.roman.staune.qa.homework_2.task_1.vehicle.tram.CitadisTram;

public class Park {
    public static void main(String[] args) {
        TransportPark transportPark = new TransportPark("ГорПаркВозница");

        transportPark.addVehicle(new Volgabus("СитиРитм-15", 2_500_000, 56));
        transportPark.addVehicle(new CitadisTram("Citadis-301", 500, 4_000_000, 230));
        transportPark.addVehicle(new MarlinAquabus("Marlin-813", 50, 1_500_000));
        transportPark.addVehicle(new Volgabus("СитиРитм-12", 2_000_000, 48));
        transportPark.addVehicle(new AksmTram(200, 3_000_000));
        transportPark.addVehicle(new HitekAquabus("Hitek taxi II", 30, 2_000_000));

        TransportParkUtils parkUtils = new TransportParkUtils();
        parkUtils.printPark(transportPark);
        parkUtils.calculateParkCost(transportPark);
        parkUtils.sortByFuelConsumption(transportPark);
        parkUtils.findBusByManufacturer(transportPark, "ВАП Волжанин");
    }
}
