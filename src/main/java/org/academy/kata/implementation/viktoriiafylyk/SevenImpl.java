package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if (n==0){
            return "0.00";
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++){
            sum += 1.0 /(3.0 * i - 2.0);

        }
        return String.format("%.2f", sum);
    }
}
