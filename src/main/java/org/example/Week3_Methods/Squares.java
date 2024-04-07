package org.example.Week3_Methods;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        double number = doubleInput("Please enter a number and I'll square it");
        square(number);
    }

    public static void square(double number) {
        double sq = number * number;
        System.out.println("The square of " + number + " is " + sq);
    }
}
