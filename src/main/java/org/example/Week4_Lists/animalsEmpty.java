package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class animalsEmpty {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        System.out.println(animals);
        System.out.println("Is the list empty? " + animals.isEmpty());
        animals.clear(); //Clears all caches data in the list
        System.out.println(animals);
        System.out.println("Is the list empty? " + animals.isEmpty()); //checks if list is empty
    }
}
