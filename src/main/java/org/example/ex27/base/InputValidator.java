/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex27.base;


public class InputValidator {
    public String validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        String firstError = "";
        String lastError = "";
        String zipError = "";
        String idError = "";
        String noError = "There were no errors found.\n";
        if (validateFirstName(firstName) == 2) {
            firstError = "The first name must be filled in.\n";
            noError = "";
        }
        else if (validateFirstName(firstName) == 1) {
            firstError = String.format("\"%s\" is not a valid first name. It is too short.\n", firstName);
            noError = "";
        }
        if (validateLastName(lastName) == 2) {
            lastError = "The last name must be filled in.\n";
            noError = "";
        }
        else if (validateLastName(lastName) == 1) {
            lastError = String.format("\"%s\" is not a valid last name. It is too short.\n", lastName);
            noError = "";
        }
        if (!validateZipCode(zipCode)) {
            zipError = "The ZIP code must be numeric.\n";
            noError = "";
        }
        if (!validateID(employeeID)) {
            idError = String.format("%s is not a valid ID.\n", employeeID);
            noError = "";
        }
        return String.format("%s%s%s%s%s", firstError, lastError, zipError, idError, noError);
    }

    public boolean validateID(String employeeID) {
        return employeeID.matches("\\w\\w-\\d\\d\\d\\d");
    }

    public int validateLastName(String lastName) {
        if(lastName.equals("")) {
            return 2;
        }
        else if(lastName.length() < 2) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int validateFirstName(String firstName) {
        if(firstName.equals("")) {
            return 2;
        }
        else if(firstName.length() < 2) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean validateZipCode(String zip) {
        try {
            Long.parseLong(zip);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
