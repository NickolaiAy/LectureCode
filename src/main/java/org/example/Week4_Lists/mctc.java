package org.example.Week4_Lists;

import java.util.ArrayList;
import java.util.List;

public class mctc {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("I am Nickolai Ayeni and");
        arrayList.add(" I go to MCTC");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
