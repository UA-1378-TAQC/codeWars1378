package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if(n==0)
            return "0.00";
        double number = 1;
        for(int i = 1 ; i < n ; i++){
            number += 1.0/(3*i+1);
        }
        return String.format("%.02f", number);
    }
}
