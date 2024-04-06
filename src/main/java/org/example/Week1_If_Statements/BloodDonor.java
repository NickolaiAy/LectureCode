package org.example.Week1_If_Statements;

import input.InputUtils;

public class BloodDonor {
    public static void main(String[] args) {
        System.out.println("What is your weight?");
        double weight = InputUtils.doubleInput();
        System.out.println("How old are you?");
        int age = InputUtils.intInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor");
        } else {
            System.out.println("Sorry, you are not eligible");
        }
    }
}
