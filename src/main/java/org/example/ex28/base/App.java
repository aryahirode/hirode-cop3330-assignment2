/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex28.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        TotalCalculator tc = new TotalCalculator();
        double total = tc.total(repeatedInput());
        System.out.printf("The total is %.1f.\n", total);
    }

    private static double[] repeatedInput() {
        double[] inputs = new double[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            inputs[i] = Double.parseDouble(in.nextLine());
        }
        return inputs;
    }
}
