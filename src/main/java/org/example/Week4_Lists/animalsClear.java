package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class animalsClear {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        animals.clear();
        System.out.println(animals);
    }
}
