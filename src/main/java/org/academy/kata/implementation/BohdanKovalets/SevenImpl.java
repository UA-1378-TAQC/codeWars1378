package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double currentSum = 0;
        for (double donation : arr) {
            currentSum += donation;
        }

        int n = arr.length;
        double targetTotal = navg * (n + 1);
        double requiredDonation = targetTotal - currentSum;

        if (requiredDonation <= 0) {
            throw new IllegalArgumentException("The required donation must be greater than 0");
        }

        return (long) Math.ceil(requiredDonation);
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        double denominator = 1.0;

        for (int i = 0; i < n; i++) {
            sum += 1 / denominator;
            denominator += 3;
        }

        return String.format("%.2f", sum);
    }
}
