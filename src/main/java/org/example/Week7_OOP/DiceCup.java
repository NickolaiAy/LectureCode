package org.example.Week7_OOP;

import java.util.ArrayList;

public class DiceCup {
    private ArrayList<Dice> allDice;
    DiceCup(int numberOfDice) {
        allDice = new ArrayList<>();
        for (int d = 0; d < numberOfDice; d++) {
            Dice dice = new Dice();
            allDice.add(dice);
        }
    }
    public int rollAll() {
        int total = 0;
        for (Dice d : allDice) {
            int diceRoll = d.roll();
            total += diceRoll;
        }
    return total;
    }
}
