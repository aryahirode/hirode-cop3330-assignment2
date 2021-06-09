/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

    @Test
    void passwordValidator_returns_1_for_very_weak_passwords() {
        PasswordStrength pw = new PasswordStrength();
        int expected = 1;
        int actual = pw.passwordValidator("1234567");
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_returns_2_for_weak_passwords() {
        PasswordStrength pw = new PasswordStrength();
        int expected = 2;
        int actual = pw.passwordValidator("abcdefg");
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_returns_3_for_strong_passwords() {
        PasswordStrength pw = new PasswordStrength();
        int expected = 3;
        int actual = pw.passwordValidator("abcdefg1");
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_returns_4_for_very_strong_passwords() {
        PasswordStrength pw = new PasswordStrength();
        int expected = 4;
        int actual = pw.passwordValidator("1337h@xor!");
        assertEquals(expected, actual);
    }
}
