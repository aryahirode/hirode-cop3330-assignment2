/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex25.base;

import java.util.Scanner;
/*
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:
   -A very weak password contains only numbers and is fewer than eight characters.
   -A weak password contains only letters and is fewer than eight characters.
   -A strong password contains letters and at least one number and is at least eight characters.
   -A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
    The password '12345' is a very weak password.
    The password 'abcdef' is a weak password.
    The password 'abc123xyz' is a strong password.
    The password '1337h@xor!' is a very strong password.
Constraints
   -Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
   -Use a single output statement.
 */
public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String password = readPassword();
        PasswordStrength pw = new PasswordStrength();
        int passwordScore = pw.passwordValidator(password);
        System.out.printf(genOutput(passwordScore), password);
    }

    private static String genOutput(int passwordScore) {
        return switch (passwordScore) {
            case 1 -> "The password '%s' is a very weak password.";
            case 2 -> "The password '%s' is a weak password.";
            case 3 -> "The password '%s' is a strong password.";
            case 4 -> "The password '%s' is a very strong password.";
            default -> "This should never happen.";
        };
    }

    private static String readPassword() {
        System.out.print("Enter a password: ");
        return in.next();
    }

}
