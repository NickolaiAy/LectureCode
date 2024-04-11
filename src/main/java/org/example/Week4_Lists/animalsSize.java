package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class animalsSize {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        int numberOfAnimals = animals.size();
        System.out.println("There are " + numberOfAnimals + "animals in the list.");
    }
}
