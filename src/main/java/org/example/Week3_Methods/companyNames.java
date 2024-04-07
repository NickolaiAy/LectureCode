package org.example.Week3_Methods;

import java.util.Arrays;

public class companyNames {
    public static void main(String[] args) {
        String [] companyNames = {"Ikea", "at&t", "cvs","3m"};
        for (int x = 0; x < companyNames.length; x++) {
            companyNames[x] = companyNames[x].toUpperCase();
        }
        System.out.println(Arrays.toString(companyNames));
    }
}
