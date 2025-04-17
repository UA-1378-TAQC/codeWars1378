package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

import java.text.DecimalFormat;
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
        final int INITIAL_DENOMINATOR = 1;
        final int DENOMINATOR_STEP = 3;
        final String DECIMAL_FORMAT = "0.00";
        if (n == 0) {
            return "0.00";
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int denominator = INITIAL_DENOMINATOR + i * DENOMINATOR_STEP;
            sum += 1.0 / denominator;
        }

        DecimalFormat df = new DecimalFormat(DECIMAL_FORMAT);
        return df.format(sum);
    }
}
