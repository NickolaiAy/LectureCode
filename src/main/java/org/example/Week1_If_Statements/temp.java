package org.example.Week1_If_Statements;

public class temp {
    public static void main(String[] args) {
        // Declare and initialize a String variable to store the current month
        String currentMonth = "January";
        // Declare and initialize an integer variable to store the current day of the month
        int dayOfMonth = 11;
        // Declare and initialize a double variable to store the forecasted high temperature
        double forecastHigh = 19.4;
        // Declare and initialize a double variable to store the forecasted low temperature
        double forecastLow = -3.7;
        // Calculate the difference between the forecasted high and low temperatures
        double tempDiff = forecastHigh - forecastLow;
        // Print the date, and the difference between the high and low temperatures
        // Note: There's a missing space in the original print statement after the dayOfMonth variable.
        System.out.println("On " + currentMonth + " " + dayOfMonth + " the difference between the high and low temperature is " + tempDiff + " degrees.");
    }
}
