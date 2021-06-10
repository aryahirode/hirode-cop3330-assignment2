/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentCalculatorTest {

    @Test
    void quickCalculator_returns_correct_value1() {
        InvestmentCalculator ic = new InvestmentCalculator();
        double expected = 18;
        double actual = ic.quickCalculator(4);
        double delta = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    void quickCalculator_returns_correct_value2() {
        InvestmentCalculator ic = new InvestmentCalculator();
        double expected = Double.POSITIVE_INFINITY;
        double actual = ic.quickCalculator(Double.MIN_VALUE);
        double delta = 1;
        assertEquals(expected, actual, delta);
    }


}