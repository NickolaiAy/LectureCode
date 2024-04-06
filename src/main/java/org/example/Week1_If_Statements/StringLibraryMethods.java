package org.example.Week1_If_Statements;

public class StringLibraryMethods {
    public static void main(String[] args) {
        String quote = "Java is to JavaScript what Car";
        //ToUpperCase, and toLowerCase
        System.out.println(quote.toUpperCase());
        System.out.println(quote.toUpperCase());
        //replace - replaces one character with another
        String replaced = quote.replace(" ", "#");
        System.out.println(replaced);
        //length - what you'd except
        System.out.println(quote.length());
        //indexOf - find position of a character in a string
        //remember count from 0
        System.out.println(quote.indexOf("J"));
        System.out.println(quote.indexOf("C"));
        //contains - does one string contain another?
        System.out.println(quote.contains("Java"));
        System.out.println(quote.contains("Ruby"));
    }
}
