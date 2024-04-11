package org.example.Week5_Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class snowfall {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        System.out.println(snowfall);
        snowfall.put("January", 4.6);
        System.out.println(snowfall);
    }
}
