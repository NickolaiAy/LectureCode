package org.example.Week2_Loops;

import static input.InputUtils.doubleInput;

public class BusFareTotal {
    public static void main(String[] args) {
        double total = 0;
        for (int day = 0; day < 7; day++) { //this creates a conditional that loops through the days of the week
            double dayExpense = doubleInput("On day " + (day+1) + "of the week, what did you spend on bus fares?"); //
            total = total + dayExpense; //calculates the total weekly expenses for bus fare
        }
        System.out.println("For the week, you spent $" + total + "for bus fares.");
        }
    }

