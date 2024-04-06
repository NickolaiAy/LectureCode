package org.example.Week2_Loops;

import java.util.Random;

public class SwitchWithInts {
    public static void main(String[] args) {
        System.out.println("Testing the random number generator");
        Random rng = new Random();
        int randomChoice = rng.nextInt(5);

        switch (randomChoice) {
            case 0:
                System.out.println("RNG chose 0");
                break;
            case 1:
                System.out.println("RNG chose 1");
                break;
            case 2:
                System.out.println("RNG chose 2");
                break;
            case 3:
                System.out.println("RNG chose 3");
                break;
            case 4:
                System.out.println("RNG chose 4");
                break;
            default:
                System.out.println("RNG chose something else:" + randomChoice);
        }
    }
}
