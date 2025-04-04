package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double result = 0.0;
        int accuracy = 2;
        if(n <= 1){
            return Integer.toString(n);
        }
        else{
            for(int i = 0; i < n; i++){
                result += 1.0 / (1 + 3 * i);
                System.out.println(1 + 3 * i);
            }
        }
        double rounded = (Math.round(result * Math.pow(10, accuracy)) / Math.pow(10, accuracy));
        return String.format("%.2f", rounded);
    }
}
