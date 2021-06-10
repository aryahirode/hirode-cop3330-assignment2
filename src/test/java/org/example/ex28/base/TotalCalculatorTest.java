/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalCalculatorTest {

    @Test
    void total_returns_correct_sum1() {
        TotalCalculator tc = new TotalCalculator();
        double[] inputs = {1, 2, 3, 4, 5};
        double expected = 15;
        double actual = tc.total(inputs);
        assertEquals(expected, actual);
    }

    @Test
    void total_returns_correct_sum2() {
        TotalCalculator tc = new TotalCalculator();
        double[] inputs = {Double.MAX_VALUE, 2, 3, 4, 5};
        double expected = 1.7976931348623157E308;
        double actual = tc.total(inputs);
        assertEquals(expected, actual);
    }

    @Test
    void total_returns_correct_sum3() {
        TotalCalculator tc = new TotalCalculator();
        double[] inputs = {-1, 2, 3, 4, 5};
        double expected = 13;
        double actual = tc.total(inputs);
        assertEquals(expected, actual);
    }

    @Test
    void total_returns_correct_sum4() {
        TotalCalculator tc = new TotalCalculator();
        double[] inputs = {1, 2.2, 3.5, 4, 5};
        double expected = 15.7;
        double actual = tc.total(inputs);
        assertEquals(expected, actual);
    }
}