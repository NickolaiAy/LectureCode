package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class animalsRemove {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(); //Creates a list of animals
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        animals.remove(2); //removes the second entry in the index starting from 0
        animals.remove(0); // removes the first entry in the index starting from 0
        System.out.println(animals);
    }
}
