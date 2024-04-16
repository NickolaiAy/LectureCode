package org.example.Week7_OOP;

import java.util.ArrayList;

import static input.InputUtils.*;

public class Game {
    private DiceCup diceCup;
    private ArrayList<Player> players;

    public static void main(String[] args) {
        Game knockout = new Game();
        knockout.startGame();
    }
    private void startGame() {
        diceCup = new DiceCup(2);
        int numberOfPlayers = positiveIntInput("How many players?");
        createPlayers(numberOfPlayers);
        setKnockoutNumbers();
        play();
        printGameResults();
    }

    private boolean setKnockoutNumbers() {
        for (Player p : players) {
            int knockOutNumber;
            do {
                knockOutNumber = intInput("Player " + p.getName() + ", " + "please enter your knock-out number. It must be 6,7,8 or 9");
            } while (knockOutNumber < 6 || knockOutNumber > 9);
            p.setKnockoutNumbers(knockOutNumber);
        }
        return false;
    }
    private void printGameResults() {
        System.out.println("\n**** GAME RESULTS ****\n");
        for (Player player : players) {
            if (player.isKnockedOut()) {
                System.out.println(player.getName() + " was knocked out");
            } else {
                System.out.println(player.getName() + " IS THE WINNER!!!!");
            }
        }
    }

    private void play() {
        int playerIndex = 0;
        int totalPlayers = players.size();
        while (moreThanOnePlayerInPlay()) {
            Player currentPlayer = players.get(playerIndex);
            System.out.println();
            if (currentPlayer.isKnockedOut()) {
                System.out.println("Sorry player " + currentPlayer.getName() + ", you are knocked out.");
            } else {
                stringInput("Player " + currentPlayer.getName() + ", press enter to roll:");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }
            playerIndex = (playerIndex+1) % totalPlayers;
        }
    }

    private boolean moreThanOnePlayerInPlay() {
        int totalInPlay = 0;
        for (Player p: players) {
            if (!p.isKnockedOut()) {
                totalInPlay++;
            }
        }
        System.out.println("There are " + totalInPlay + " player(s) in the game");
        return totalInPlay > 1;
    }


    private void createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();
        for (int p = 1; p <= numberOfPlayers; p++) {
            String name = stringInput("Enter player " + p + "'s name:");
            Player player = new Player(name);
            players.add(player);
        }
    }
}

