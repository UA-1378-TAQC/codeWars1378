package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

import java.util.Arrays;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        double sum = Arrays.stream(arr).sum();
        int numberOfDonations = arr.length;
        double requiredDonation = navg * (numberOfDonations + 1) - sum;

        if (requiredDonation <= 0) {
            throw new IllegalArgumentException("Donation cannot be less or equal to 0");
        }

        return (long) Math.ceil(requiredDonation);
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }
}
