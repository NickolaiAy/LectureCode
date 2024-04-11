package org.example.Week3_Methods;

import java.util.Arrays;

public class companyNames {
    public static void main(String[] args) {
        String [] companyNames = {"Ikea", "at&t", "cvs","3m"}; // creates an array of company names
        for (int x = 0; x < companyNames.length; x++) { //iterates over the entire array until finished
            companyNames[x] = companyNames[x].toUpperCase();
        }
        System.out.println(Arrays.toString(companyNames));
    }
}
