package org.example.Week3_Methods;

import static input.InputUtils.doubleInput;

public class mpgCalculator {
        public static double calculateMPG(double miles, double gallons) {
            if (gallons == 0) {
                // Avoid division by zero error
                return 0.0;
            } else {
                return miles / gallons;
            }
        }

        public static void main(String[] args) {

            double miles = doubleInput("Enter the number of miles driven: ");
            double gallons = doubleInput("Enter the number of gallons of gas used: ");
            double mpg = calculateMPG(miles, gallons);
            System.out.printf("The car's MPG for this journey is: %.2f\n", mpg);
        }
}
