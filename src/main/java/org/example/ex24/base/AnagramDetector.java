/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Chars = s1.toLowerCase().toCharArray();
        char[] s2Chars = s2.toLowerCase().toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        int i;
        for(i = 0; i < s1.length(); i++) {
            if (s1Chars[i] != s2Chars[i]) {
                    return false;
            }
        }
        return true;
    }
}
