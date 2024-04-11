package org.example.Week2_Loops;

import static input.InputUtils.doubleInput;

public class AverageTestScoresSimpleLoop {
    public static void main(String[] args) {
        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        for (int test = 1; test <= numberOfTests; test++) { // creates a conditional loop where all tests are added until there are no more tests
            testScore = doubleInput("Enter test score #" + test);
            testScoreSum = testScoreSum + testScore; //adds up test scores
        }
        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = " + testScoreAverage);
    }
}
