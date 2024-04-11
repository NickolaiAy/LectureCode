package org.example.Week5_Hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class snowfall {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        System.out.println(snowfall);
        snowfall.put("January", 4.6);
        System.out.println(snowfall);
        String newMonth = stringInput("Enter month: ");
        double newSnow = positiveDoubleInput("Enter snow for " + newMonth);
        boolean overwrite = true;
        if (snowfall.containsKey(newMonth)) {
            double snow = snowfall.get(newMonth);
            System.out.println(newMonth + " is already in the HashMap");
            System.out.println("Snowfall for " + newMonth + " was " + snow + " inches");
            overwrite = yesNoInput("Do you want to overwrite the old data?");
        }
        if (overwrite) {
            snowfall.put(newMonth, newSnow);
        } else {
            System.out.println("HashMap was not modified.");
        }
    }
}
