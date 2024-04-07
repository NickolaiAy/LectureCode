package org.example.Week3_Methods;

import static input.InputUtils.*;

public class TiresFinal {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tire Price Comparison Calculator");

        int numberOfTireToCompare = positiveIntInput("Please enter the number of tires to compare");
        String[] tireReports = new String[numberOfTireToCompare];
        for (int t = 0; t < numberOfTireToCompare; t++) {
            String report = getTireInfo();
            tireReports[t] = report;
        }
        printReportTable(tireReports);
    }

    private static String getTireInfo() {
        String name = stringInput("What is the name of the tire?");
        double price = positiveDoubleInput("Enter the price of " + name);
        int mileWarranty = positiveIntInput("Enter the number of miles warranty");

        double dollarsPerMile = price / mileWarranty;
        double dollarsPer1000Miles = dollarsPerMile * 1000;

        return String.format("%S costs %f, has a %d mile warranty, costs $%.3f per 1000 miles", name, price, mileWarranty, dollarsPer1000Miles);
    }
    private static void printReportTable(String [] tireReports) {
        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }
    }
}
