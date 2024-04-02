package org.example.Week3_Methods;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        // Creates a random object this will form the basis of the number game
        Random random = new Random();
        int randomNumber = random.nextInt(10); // this will generate a random number between 0 and whatever number within parenthesis
        System.out.println("Random secret number between 0 and 9 = " + randomNumber);
    }
}
