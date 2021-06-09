/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        AnagramDetector ad = new AnagramDetector();
        boolean actual = ad.isAnagram("note", "tone");
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_non_anagrams() {
        AnagramDetector ad = new AnagramDetector();
        boolean actual = ad.isAnagram("bons", "bone");
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_strings_of_diff_length() {
        AnagramDetector ad = new AnagramDetector();
        boolean actual = ad.isAnagram("note", "noted");
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_true_despite_capital_letters_involved() {
        AnagramDetector ad = new AnagramDetector();
        boolean actual = ad.isAnagram("Pam", "map");
        assertTrue(actual);
    }
}