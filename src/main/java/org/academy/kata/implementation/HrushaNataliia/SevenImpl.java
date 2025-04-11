package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        int n = arr.length;
        double x = navg * (n + 1) - sum;

        if (x <= 0) {
            throw new IllegalArgumentException();
        }
        long result = (long) Math.ceil(x);
        return result;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double denominator = 1 + 3 * i;
            sum += 1.0 / denominator;
        }
        double roundedSum = Math.round(sum * 100) / 100.0;
        return String.format("%.2f", roundedSum);
    }
}
