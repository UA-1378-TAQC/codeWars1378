package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISeven;
import java.util.Arrays;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double x = navg*(arr.length+1)-Arrays.stream(arr).sum();
        if(x<=0)throw new IllegalArgumentException();
        return (long)Math.ceil(x);
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }
}
