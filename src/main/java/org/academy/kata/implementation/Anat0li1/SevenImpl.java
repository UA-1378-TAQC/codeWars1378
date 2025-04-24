package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (var elem : arr) {
            sum += elem;
        }
        double goal = navg * (arr.length + 1);
        long result = (long) Math.ceil(goal - sum);
        if (result <= 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double result = 0.0;
        int accuracy = 2;
        if (n <= 1) {
            return Integer.toString(n);
        } else {
            for (int i = 0; i < n; i++) {
                result += 1.0 / (1 + 3 * i);
            }
        }
        double rounded = (Math.round(result * Math.pow(10, accuracy)) / Math.pow(10, accuracy));
        return String.format("%.2f", rounded);
    }
}
