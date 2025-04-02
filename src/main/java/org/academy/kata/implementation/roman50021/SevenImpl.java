package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

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

        for(int i = 0; i < n; i++){
            sum = sum + 1.0 / (1 + 3 * i);
        }

        return String.format("%.2f", sum);
    }
}
