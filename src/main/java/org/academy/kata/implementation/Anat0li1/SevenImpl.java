package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if(arr == null){
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for(var elem: arr){
            sum += elem;
        }
        double goal = navg * (arr.length + 1);
        long result = (long)Math.ceil(goal - sum);
        if(result <= 0){
            throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }
}
