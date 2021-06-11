/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Arya Hirode
 */
package org.example.ex31.base;

public class FitnessCalculator {
    public double[] targetHeartRate(int age, int restingHR) {
        double i = .55;
        int n = 0;
        double[] TargetHRArray = new double[9];
        while (i <= .96) {
            TargetHRArray[n] = (((220 - age) - restingHR) * i) + restingHR;
            i+=.05;
            n++;
        }
        return TargetHRArray;
    }

    public void generateTable(double[] TargetHRArray) {
        System.out.println("Intensity   | Rate");
        System.out.println("------------|--------");
        int n = 0;
        for (int i = 55; i <= 95; i+=5) {
            System.out.printf("%d%%         |%4.0f bpm\n", i, TargetHRArray[n]);
            n++;
        }
    }
}
