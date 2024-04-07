package org.example.Week3_Methods;

import static input.InputUtils.intInput;

public class creditsToGraduate {
    public static int howManyCreditsToGraduate(int creditsEarned, int creditsNeeded) {
        return creditsNeeded - creditsEarned;
    }

    public static void main(String[] args) {

        int creditsEarned = intInput("Enter the number of credits you have earned: ");


        int creditsNeeded     = intInput("Enter the total number of credits needed to graduate: ");


        int creditsToGraduate = howManyCreditsToGraduate(creditsEarned, creditsNeeded);

        if (creditsToGraduate > 0) {
            System.out.printf("You need %d more credits to graduate.\n", creditsToGraduate);
        } else {
            System.out.println("Congratulations! You have enough credits to graduate.");
        }
    }
}
