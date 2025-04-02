package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum =0;
        for (double donation : arr){
            sum += donation;
        }

        long nextDonation = (long) Math.ceil(navg * (arr.length + 1) - sum);

        if (nextDonation <= 0) {
            throw new IllegalArgumentException("Expected donation should be positive");
        }
        return nextDonation;
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }
}
