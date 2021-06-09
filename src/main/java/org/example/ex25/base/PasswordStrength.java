/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex25.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
   -A very weak password contains only numbers and is fewer than eight characters.
   -A weak password contains only letters and is fewer than eight characters.
   -A strong password contains letters and at least one number and is at least eight characters.
   -A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
public class PasswordStrength {
    public int passwordValidator(String password) {
        if (password.length() < 8) {
            try {
                Double.parseDouble(password);
                return 1;
            } catch (NumberFormatException e) {
                return 2;
            }
        }
        else {
            Pattern specialChars = Pattern.compile("[!@#$%&*()_+=|<>?{}\\\\~-]");
            Matcher m = specialChars.matcher(password);
            boolean veryStrong = m.find();
            if (veryStrong) {
                return 4;
            }
            else {
                return 3;
            }
        }
    }




}
