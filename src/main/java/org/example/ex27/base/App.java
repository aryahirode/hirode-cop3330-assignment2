/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex27.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName = firstNamePrompt();
        String lastName = lastNamePrompt();
        String zipCode = zipCodePrompt();
        String employeeID = employeeIDPrompt();

        InputValidator iv = new InputValidator();
        System.out.println(iv.validateInput(firstName, lastName, zipCode, employeeID));
    }

    private static String firstNamePrompt() {
        System.out.print("Enter the first name: ");
        return in.nextLine();
    }

    private static String lastNamePrompt() {
        System.out.print("Enter the last name: ");
        return in.nextLine();
    }

    private static String zipCodePrompt() {
        System.out.print("Enter the ZIP code: ");
        return in.nextLine();
    }

    private static String employeeIDPrompt() {
        System.out.print("Enter an employee ID: ");
        return in.nextLine();
    }

}
