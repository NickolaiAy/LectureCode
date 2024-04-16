package org.example.Week7_OOP;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class TireComparison {
    public static void main(String[] args) {
        // Display a welcome message at the start of the program
        System.out.println("Welcome to the Tire Price Comparison Calculator");

        // List to store all the tire information
        List<Tire> tireReports = new ArrayList<>();

        // Loop to gather tire information repeatedly until the user decides to stop
        do {
            Tire tire = getTireInfo(); // Get tire information from user
            tireReports.add(tire); // Add the new tire to the list
        } while (yesNoInput("More tires to add to comparison?")); // Check if user wants to add more tires

        printReportTable(tireReports); // Display all the collected tire data in a table
    }

    // Method to gather tire information from the user
    private static Tire getTireInfo() {
        String name = stringInput("What is the name of the tire?"); // Get tire name
        double price = positiveDoubleInput("Enter the price of " + name); // Get tire price
        int mileWarranty = positiveIntInput("Enter the number of miles warranty"); // Get warranty in miles

        return new Tire(name, price, mileWarranty); // Return a new Tire object with the gathered information
    }

    // Method to print all tire information in a formatted table
    private static void printReportTable(List<Tire> tireReports) {
        for (Tire tire : tireReports) {
            System.out.println(tire); // Print each tire's information
        }
    }
}
