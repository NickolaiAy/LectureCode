package org.example.Week4_Lists;

import java.util.LinkedList;
import java.util.List;

public class trees {
    public static void main(String[] args) {
        List<String> trees = new LinkedList<>();

        trees.add("Pine");
        trees.add("Oak");
        trees.add("Elm");
        trees.add("Aspen");
        trees.add(2,"Palm");
        System.out.println("Tree at index 1 is " + trees.get(1));

        for (String tree: trees) {
            System.out.println(tree);
        }
        trees.remove("Oak");
        trees.remove(0);
        System.out.println(trees);

        if (trees.contains("Aspen")) {
            System.out.println("Tree List contains Aspen");
        }
        int numberOfTrees = trees.size();
        System.out.println("There are " + numberOfTrees + " trees in the list.");
    }
}
