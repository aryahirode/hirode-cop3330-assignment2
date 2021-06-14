package org.example.ex36.base;

import java.util.Arrays;
import java.util.Collections;

public class StatsCalculator {
    public double average(String[] data) {
        double sum = 0;
        for (String num : data) {
            sum += Double.parseDouble(num);
        }
        return sum/data.length;
    }

    public double min(String[] data) {
        return Double.parseDouble(Collections.min(Arrays.asList(data)));
    }

    public double max(String[] data) {
        return Double.parseDouble(Collections.max(Arrays.asList(data)));
    }

    public double std(String[] data) {
        double numerator = 0;
        for (String num : data) {
            //sigma |x - average|^2
            numerator += Math.pow(Math.abs(Double.parseDouble(num) - average(data)), 2);
        }
        return Math.sqrt(numerator / data.length);
    }
}
