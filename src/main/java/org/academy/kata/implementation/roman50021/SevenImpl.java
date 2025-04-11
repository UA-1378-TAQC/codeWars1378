package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

import java.util.Arrays;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (navg <= 0) {
            throw new IllegalArgumentException("Desired average must be positive");
        }

        double sum = Arrays.stream(arr).sum();
        // S + x / n + 1 = navg
        double x = navg * (arr.length + 1) - sum;
        long result = (long) Math.ceil(x);

        if(result <= 0){
            throw new IllegalArgumentException("result <= 0");
        }

        return result;
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
