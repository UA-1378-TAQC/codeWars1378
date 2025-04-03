package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum =0.0;
        for(int i = 1, j = 1; i<=n; i++, j+=3){
            sum = sum+(double)1/j;
        }
        return String.format("%.2f",sum);
    }
}
