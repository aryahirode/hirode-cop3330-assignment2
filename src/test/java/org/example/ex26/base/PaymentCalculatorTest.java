/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_returns_correct_value_according_to_formula() {
        PaymentCalculator pc = new PaymentCalculator();
        double expected = 70;
        double actual = pc.calculateMonthsUntilPaidOff(5000, 12, 100);
        double delta = .001;
        assertEquals(expected, actual, delta);
    }

}