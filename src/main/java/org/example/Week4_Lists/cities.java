package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Minneapolis");
        cities.add("Saint Paul");
        cities.add("Bloomington");
        cities.add("Brooklyn Park");
        cities.add("Golden Valley");
        for (String city: cities){
            System.out.println(city);
        }
    }
}
