package org.example.ex29.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //input loop
        double rate = inputLoop();
        //quickCalculator
        InvestmentCalculator ic = new InvestmentCalculator();
        //print result
        System.out.printf("It will take %.0f years to double your initial investment.\n", ic.quickCalculator(rate));
    }

    private static double inputLoop() {
        String input;
        while(true) {
            input = ratePrompt();
            if (isNumber(input) && Double.parseDouble(input) != 0) {
                break;
            }
            System.out.println("Sorry. That's not a valid input.");
        }
        return Double.parseDouble(input);
    }

    private static boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String ratePrompt() {
        System.out.print("What is the rate of return? ");
        return in.nextLine();
    }
}
