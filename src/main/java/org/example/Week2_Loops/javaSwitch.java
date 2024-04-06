package org.example.Week2_Loops;

import static input.InputUtils.stringInput;

public class javaSwitch {
    public static void main(String[] args) {
        String language = stringInput("Please tell me the name of a programming language?");
        switch (language.toLowerCase()) {
            case "java":
                System.out.println("Oracle maintains Java");
                break;
            case "c#":
                System.out.println("Microsoft maintains C#");
                break;
            case "python":
                System.out.println("The Python Foundation maintains Python");
                break;
            default:
                System.out.println("I don't know about that language");
        }
    }
}
