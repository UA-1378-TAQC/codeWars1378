package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum+=1.0/(3*i+1);
        }
        return String.format("%.2f",sum);
    }
}
