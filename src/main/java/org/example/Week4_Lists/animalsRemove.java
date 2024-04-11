package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class animalsRemove {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        animals.remove(2);
        animals.remove(0);
    }
}
