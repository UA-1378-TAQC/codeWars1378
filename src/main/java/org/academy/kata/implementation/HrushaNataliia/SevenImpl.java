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
        return "";
    }
}
