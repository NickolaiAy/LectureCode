package org.example.Week7_OOP;

import static input.InputUtils.intInput;

public class Player {
    private String name;
    private boolean knockedOut;
    private int knockOutNumber;

    Player(String name) {
        this.name = name;
        this.knockedOut = false;
    }

    public String playTurn(DiceCup diceCup) {
        int score = diceCup.rollAll();
        if (playerKnockedOut(score)) {
            knockedOut = true;
        }
        String resultTemplate = "PLayer %s rolled a total of %d and %s knocked out. (Your knockout number is %d)";
        String result = String.format(resultTemplate, name, score, knockedOut ? " was" : "was not", knockOutNumber);
        return result;
    }

    private boolean playerKnockedOut(int score) {
        int knockoutNumber = 0;
        if (score == knockoutNumber) {
        return true;
    } else {
        return false;
    }
    }


    public String getName() {
        return getName();
    }

    public void setKnockoutNumbers(int knockOutNumber) {

    }

    public boolean isKnockedOut() {
        return false;
    }
}
