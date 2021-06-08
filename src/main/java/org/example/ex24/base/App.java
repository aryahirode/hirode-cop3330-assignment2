/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex24.base;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String s1 = string1Prompt();
        String s2 = string2Prompt();
        AnagramDetector ad = new AnagramDetector();
        System.out.println(output(ad.isAnagram(s1, s2), s1, s2));
    }

    private static String output(boolean anagram, String s1, String s2) {
        if(anagram) {
            return "\"" + s1 + "\" and \"" + s2 + "\" are anagrams.";
        }
        else {
            return "\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.";
        }
    }

    private static String string1Prompt() {
        System.out.print("Enter the first string: ");
        return in.next();
    }

    private static String string2Prompt() {
        System.out.print("Enter the second string: ");
        return in.next();
    }


}
