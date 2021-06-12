/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex35.base;

import java.util.concurrent.ThreadLocalRandom;

public class WinnerPicker {
    public String pickWinner(String[] nameArray) {
        int randNum = ThreadLocalRandom.current().nextInt(0, nameArray.length + 1);
        return nameArray[randNum];
    }

}
