package org.example.Week3_Methods;

public class Squares3 {
    public static void main(String[] args) {
        System.out.println("Here are the squares of the numbers 1 to 10");

        for (int x = 1; x <= 10; x++) {
            double xsquared = square(x);
            System.out.println("The square of " + x + " is " + xsquared);
        }
    }

    public static double square(double n) {
        double sq = n * n;
        return sq;
    }
}
