/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex35.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        WinnerPicker wp = new WinnerPicker();
        String[] nameList = makeList();
        System.out.printf("The winner is... %s.\n", wp.pickWinner(nameList));
    }

    private static String namePrompt() {
        System.out.print("Enter a name: ");
        return in.nextLine();
    }

    private static String[] makeList() {
        List<String> nameList = new ArrayList<>();
        String name;
        while(true) {
            name = namePrompt();
            if(name.equals("")) {
                break;
            }
            nameList.add(name);
        }
        String[] nameArray = new String[nameList.size()];
        return nameList.toArray(nameArray);
    }
}
