/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex31.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int age = Integer.parseInt(genAgeInput());
        int restingPulse = Integer.parseInt(genHRInput());
        FitnessCalculator fc = new FitnessCalculator();
        System.out.printf("Resting Pulse: %d        Age: %d\n", restingPulse, age);
        fc.generateTable(fc.targetHeartRate(age, restingPulse));
    }

    private static String genAgeInput() {
        String input;
        while(true) {
            input = agePrompt();
            if (isNumber(input)) {
                break;
            }
            System.out.println("Sorry. That's not a valid input.");
        }
        return input;
    }

    private static String genHRInput() {
        String input;
        while(true) {
            input = restingHRPrompt();
            if (isNumber(input)) {
                break;
            }
            System.out.println("Sorry. That's not a valid input.");
        }
        return input;
    }

    private static String agePrompt() {
        System.out.print("What is your age? ");
        return in.nextLine();
    }

    private static String restingHRPrompt() {
        System.out.print("What is your resting heart rate? ");
        return in.nextLine();
    }

    private static boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
