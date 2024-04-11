package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class vehiclesList {
    public static void main(String[] args) {
        List<String> vehicles = new ArrayList<>();

        vehicles.add("Car");
        vehicles.add("Bus");
        vehicles.add("Train");
        vehicles.add("Boat");
        System.out.println(vehicles);
        String firstVehicle = vehicles.get(0);
        System.out.println(firstVehicle);
        System.out.println(vehicles);
        String truck = vehicles.get(2);
        System.out.println(truck);
        String error = vehicles.get(4);
    }
}
