package org.example.Week3_Methods;

import static input.InputUtils.doubleInput;

public class MilesToKm {
    public static void main(String[] args) {
        double miles = doubleInput("Please enter number of miles");
        double km = milesToKM(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers");
    }

    public static double milesToKM(double miles) {
        double km = miles * 1.6;
        return km;
    }
}
