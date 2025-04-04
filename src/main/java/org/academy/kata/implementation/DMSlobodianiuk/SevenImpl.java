package org.academy.kata.implementation.DMSlobodianiuk;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if(n == 0)
        {
            return "0.00";
        }

        double k = 1;
        double p = 1;
        for(double i = 1;i<n;i++)
        {
            k += Math.pow(p+3,-1);
            p += 3;
        }

        if(Double.toString(Math.round(k*100.0)/100.0).length() == 3){
            return Double.toString(Math.round(k*100.0)/100.0) + "0";
        }
        else{
            return Double.toString(Math.round(k*100.0)/100.0);
        }
    }
}
