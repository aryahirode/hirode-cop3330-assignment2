package org.example.ex33.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        questionPrompt();
        Magic8Ball magic8Ball = new Magic8Ball();
        System.out.printf("\n%s\n", magic8Ball.fortune());
    }

    private static String questionPrompt() {
        System.out.print("What's your question?\n> ");
        return in.nextLine();
    }


}
