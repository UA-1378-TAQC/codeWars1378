package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISeven;
import java.util.Arrays;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();

        double value = navg*(arr.length+1) - sum;

        if(value > 0)
            return (long)Math.ceil(value);
        else
            throw new IllegalArgumentException("Negative");
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }
}
