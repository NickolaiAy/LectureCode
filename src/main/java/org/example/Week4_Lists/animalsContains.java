package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class animalsContains {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        if (animals.contains("Bear")) { //checks if animals list contains bear
            System.out.println("The list contains a bear");
        } else {
            System.out.println("No bear in this list");
        }
    }
}
