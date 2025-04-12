package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0.0;
        for (double number : arr) {
            sum += number;
        }
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if(result <= 0){
            throw new IllegalArgumentException("Expected value is too low");
        }else
            return result;

    }

    @Override
    public String seriesSum(int n) {return null;}
}
