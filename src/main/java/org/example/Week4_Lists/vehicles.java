package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class vehicles {
    public static void main(String[] args) {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("Bus");
        vehicles.add("Car");
        vehicles.add(0, "Train");
        vehicles.add(0, "Boat");
        vehicles.add(2,"Airplane");
        vehicles.add(4,"Truck");
        System.out.println(vehicles);
    }
}
