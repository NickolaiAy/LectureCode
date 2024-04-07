package org.example.Week3_Methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class tires2 {
    public static void main(String[] args) {
        String report = getTireInfo();
        System.out.println(report);
    }

    public static String getTireInfo() {
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerMile = price / miles;
        return " The " + tireName + " tire costs " + pricePerMile + " dollars per miles.";
    }
}
