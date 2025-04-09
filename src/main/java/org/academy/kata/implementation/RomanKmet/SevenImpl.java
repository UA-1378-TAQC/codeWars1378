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
        return "";
    }
}
