package org.example.Week2;

import java.util.Scanner;

public class welding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?", scanner);
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?", scanner);
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?", scanner);

        if (cottonClothes || woolClothes && closedToeShoes) {
            System.out.println("You are dressed safely for welding.");
        } else {
            System.out.println("You must wear wool or cotton clothes, and closed toe shoes.");
        }
    }

    private static boolean yesNoInput(String prompt, Scanner scanner) {
        System.out.println(prompt + " (yes/no)");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("yes");
}
}