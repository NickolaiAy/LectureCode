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
        System.out.println("Tree at index 1 is " + trees.get(1)); //Gets the tree at index 1 which is a Oak tree

        for (String tree: trees) { //iterates through all the trees
            System.out.println(tree);
        }
        trees.remove("Oak");
        trees.remove(0);
        System.out.println(trees);

        if (trees.contains("Aspen")) { //checks if aspen is still in the list
            System.out.println("Tree List contains Aspen");
        }
        int numberOfTrees = trees.size(); //checks current number of trees
        System.out.println("There are " + numberOfTrees + " trees in the list.");
    }
}
