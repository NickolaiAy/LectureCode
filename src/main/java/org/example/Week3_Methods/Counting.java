package org.example.Week3_Methods;

import static input.InputUtils.intInput;

public class Counting {
    public static void main(String[] args) {
        int smallNumber = intInput("Please enter a small integer number");
        int largeNumber = intInput("Please enter a larger integer number");
        System.out.println("I will now count from " + smallNumber + " to " + largeNumber);
        count(smallNumber, largeNumber);
    }

    public static void count(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}
