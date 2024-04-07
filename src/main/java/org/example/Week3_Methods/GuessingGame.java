package org.example.Week3_Methods;

import static input.InputUtils.stringInput;

public class GuessingGame {
    public static void main(String[] args) {
        String computerFavoriteFood = "chips";
        String guess = stringInput("Guess what a computer's favorite food is?");

        if (checkUserGuess(guess, computerFavoriteFood)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, the right answer is " + computerFavoriteFood);
        }
    }

    private static boolean checkUserGuess(String guess, String correctAnswer) {
        if (guess.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else if (guess.equalsIgnoreCase(correctAnswer + "?")) {
        return true;
        } else {
            return false;
        }
    }
}
