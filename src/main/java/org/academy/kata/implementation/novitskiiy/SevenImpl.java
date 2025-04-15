package org.academy.kata.implementation.novitskiiy;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (navg <= 0) {
            throw new IllegalArgumentException("The expected average must be greater than 0.");
        }

        double sum = 0;
        for (double donation : arr) {
            sum += donation;
        }

        double requiredSum = navg * (arr.length + 1);
        double nextDonation = requiredSum - sum;

        if (nextDonation <= 0) {
            throw new IllegalArgumentException("Next donation should be greater than 0.");
        }

        return (long) Math.ceil(nextDonation);
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0)
            return "0.00";
        double sum = 0.0;
        n = n * 3;
        for (double i = 1.0; i <= n; i += 3.0) {
            if (i == 1.0)
                sum += 1.0;
            else
                sum += 1.0 / i;
        }
        return String.format("%.2f", sum);
    }
}
