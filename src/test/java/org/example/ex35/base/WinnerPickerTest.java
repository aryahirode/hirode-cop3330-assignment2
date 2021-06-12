/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex35.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerPickerTest {

    @Test
    void pickWinner_returns_a_given_name() {
        WinnerPicker wp = new WinnerPicker();
        String[] testArray = {"Sam", "Bob", "Billy"};
        String result = wp.pickWinner(testArray);
        boolean correct = result.equals("Sam") || result.equals("Bob") || result.equals("Billy");
        assertTrue(correct);
    }
}