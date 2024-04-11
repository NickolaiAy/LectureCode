package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class animalsCollections {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Zebra");
        animals.add("Fish");
        animals.add("Bird");
        animals.add("Fish");
        System.out.println("Original animals list: " + animals);
        Collections.sort(animals);
        System.out.println("Sorted animals list: " + animals);
        Collections.replaceAll(animals, "Fish", "Shark");
        System.out.println("Replace \"Fish\" with \"Shark\", now the list is: " + animals);
        Collections.reverse(animals);
        System.out.println("In reserve order: " + animals);
        Collections.shuffle(animals);
        System.out.println("Shuffle list: " + animals);
        System.out.println("First in the alphabet: " + Collections.min(animals));
        System.out.println("Last in the alphabet: " + Collections.max(animals));
        Collections.fill(animals, "Koala");
        System.out.println("Replaced every element with Koala and now the list is: " + animals);
    }
}
