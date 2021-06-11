/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex30.base;

public class MultiplicationTable {
    public void generateTable() {
        for (int i = 1; i <= 12; i++) {
            for (int n = 1; n <= 12; n++) {
                System.out.printf("%5d", n * i);
            }
            System.out.print("\n");
        }
    }

}
