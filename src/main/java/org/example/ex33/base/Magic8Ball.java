/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex33.base;

import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {
    public String fortune() {
        String[] fortunes = {"Yes.", "No.", "Maybe.", "Ask again later."};
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 4);
        return fortunes[randomIndex];
    }
}
