package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

import java.text.DecimalFormat;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int denominator = 1 + i * 3;
            sum += 1.0 / denominator;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(sum);
    }
}
