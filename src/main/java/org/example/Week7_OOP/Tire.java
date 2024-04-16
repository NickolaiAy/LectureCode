package org.example.Week7_OOP;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Tire {
    // Fields to store tire's name, price, and warranty in miles
    private String name;
    private double price;
    private int warrantyMiles;

    // Constructor to initialize a new Tire object with name, price, and warranty miles
    public Tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    // Method to calculate and return the price per 1000 miles of the tire
    public double pricePer1000Miles() {
        return (price / (double) warrantyMiles) * 1000;
    }

    // Method to calculate and return the total cost for a set of four tires
    public double costForSet() {
        return price * 4;
    }

    // Override toString to provide a string representation of the tire information
    @Override
    public String toString() {
        return String.format("%s costs %.2f and has a warranty of %d miles. Cost per 1000 miles is $%.2f",
                name, price, warrantyMiles, pricePer1000Miles());
    }
}
