/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitnessCalculatorTest {

    @Test
    void targetHeartRate_returns_correct_targetHRs1() {
        FitnessCalculator fc = new FitnessCalculator();
        double[] actual = fc.targetHeartRate(22, 65);
        assertEquals(191, Math.round(actual[8]));
    }

    @Test
    void targetHeartRate_returns_correct_targetHRs2() {
        FitnessCalculator fc = new FitnessCalculator();
        double[] actual = fc.targetHeartRate(22, 65);
        assertEquals(145, Math.round(actual[1]));
    }

    @Test
    void targetHeartRate_returns_correct_targetHRs3() {
        FitnessCalculator fc = new FitnessCalculator();
        double[] actual = fc.targetHeartRate(22, 65);
        assertEquals(138, Math.round(actual[0]));
    }

    @Test
    void targetHeartRate_returns_correct_targetHRs4() {
        FitnessCalculator fc = new FitnessCalculator();
        double[] actual = fc.targetHeartRate(22, 65);
        assertEquals(185, Math.round(actual[7]));
    }
}