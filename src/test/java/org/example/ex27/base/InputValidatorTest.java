/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void validateFirstName_is_0_for_valid_name() {
        InputValidator iv = new InputValidator();
        int expected = 0;
        int actual = iv.validateFirstName("Jimbo");
        assertEquals(expected, actual);
    }

    @Test
    void validateFirstName_is_1_for_short_name() {
        InputValidator iv = new InputValidator();
        int expected = 1;
        int actual = iv.validateFirstName("J");
        assertEquals(expected, actual);
    }

    @Test
    void validateFirstName_is_2_for_empty_name() {
        InputValidator iv = new InputValidator();
        int expected = 2;
        int actual = iv.validateFirstName("");
        assertEquals(expected, actual);
    }

    @Test
    void validateZipCode_is_true_for_valid_zip() {
        InputValidator iv = new InputValidator();
        boolean actual = iv.validateZipCode("55555");
        assertTrue(actual);
    }

    @Test
    void validateZipCode_is_false_for_invalid_zip() {
        InputValidator iv = new InputValidator();
        boolean actual = iv.validateZipCode("ABCDE");
        assertFalse(actual);
    }

    @Test
    void validateID_is_true_for_valid_ID() {
        InputValidator iv = new InputValidator();
        boolean actual = iv.validateID("TK-1234");
        assertTrue(actual);
    }

    @Test
    void validateID_is_false_for_invalid_ID() {
        InputValidator iv = new InputValidator();
        boolean actual = iv.validateID("A12-ADDW");
        assertFalse(actual);
    }
}