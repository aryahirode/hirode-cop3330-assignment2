/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex26.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = balancePrompt();
        double apr = aprPrompt();
        double monthly = monthlyPrompt();
        PaymentCalculator pc = new PaymentCalculator();
        double monthsNeeded = pc.calculateMonthsUntilPaidOff(balance, apr, monthly);
        System.out.printf("It will take you %.0f months to pay off this card.", monthsNeeded);
    }

    private static double balancePrompt() {
        System.out.print("What is your balance? ");
        return in.nextDouble();
    }

    private static double aprPrompt() {
        System.out.print("What is the APR on the card (as a percent)? ");
        return in.nextDouble();
    }

    private static double monthlyPrompt() {
        System.out.print("What is the monthly payment you can make? ");
        return in.nextDouble();
    }
}
