package org.example.Week5_Hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class snowfall {
    public static void main(String[] args) {
        // Create a HashMap to store monthly snowfall (String month as key, Double snowfall as value)
        Map<String, Double> snowfall = new HashMap<>();

        // Add some sample snowfall data for January and February
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        System.out.println("Current snowfall data: " + snowfall);  // Print the HashMap contents

        // Update January's snowfall
        snowfall.put("January", 4.6);
        System.out.println("Updated snowfall data: " + snowfall);  // Print the HashMap contents again

        // Get user input for a new month and snowfall amount
        String newMonth = stringInput("Enter the month: ");
        double newSnow = positiveDoubleInput("Enter snowfall amount for " + newMonth + " (inches): ");

        // Check if the entered month already exists in the HashMap
        boolean overwrite = true;
        if (snowfall.containsKey(newMonth)) {
            double existingSnow = snowfall.get(newMonth);
            System.out.println(newMonth + " already has recorded snowfall: " + existingSnow + " inches.");

            // Ask the user if they want to update the existing data
            overwrite = yesNoInput("Do you want to overwrite the existing data for " + newMonth + "?");
        }

        // Update the HashMap based on user choice
        if (overwrite) {
            snowfall.put(newMonth, newSnow);
            System.out.println("Snowfall data for " + newMonth + " has been updated to " + newSnow + " inches.");
        } else {
            System.out.println("HashMap remains unchanged.");
        }
    }
}
