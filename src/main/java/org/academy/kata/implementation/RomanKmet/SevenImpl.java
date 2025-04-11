package org.academy.kata.implementation.RomanKmet;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double currentSum = 0;
        for (double donation : arr) {
            currentSum += donation;
        }
        long nextDonation = (long) Math.ceil(navg * (arr.length + 1) - currentSum);
        if (nextDonation <= 0) {
            throw new IllegalArgumentException("Expected donation must be greater than 0");
        }
        return nextDonation;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);
    }
}
