package org.example.Week5_Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class h {
    public static void main(String[] args) {
        Map<String, String> h = new HashMap<>();// creates a hashmap for all the IT Classes
        h.put("1100", "Info Tech Concepts");
        h.put("1110", "Info Tech SKills");
        h.put("1150", "Programming Logic");
        h.put("1250", "Windows");
        h.put("1425", "Data Communications");
        System.out.println(h);
        System.out.println("The value for the key 1150 is " + h.get("1150"));
        System.out.println("Does HashMap contain the key 1100? " + h.containsKey("1100"));
        System.out.println("Is there an entry with the value \"Windows\"? " + h.containsKey("Windows"));
        System.out.println("Delete the 1250 key-value pair by key. The value is " + h.remove("1250"));
        System.out.println("Delete a key that doesnt exist, what does this return? " + h.remove("1724"));
        for (String classNumber : h.keySet()) { // Loop through all class numbers in the map 'h' and print them with their corresponding names
            System.out.println("Class Number = " + classNumber + " Class Name = " + h.get(classNumber));
        }
        System.out.println("\nPrinting out all values using a loop\n");
        for (String value : h.values()) {
            System.out.println(value);
        }
        System.out.println("\nA loop for both keys and values\n");
        for (Map.Entry<String, String> entry: h.entrySet()) { //Iterates through entire list and finds the key and string variable name
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
