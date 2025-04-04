package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISeven;

public class SevenImpl extends Base implements ISeven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
          for(double a: arr) sum += a;
          
          double n = arr.length + 1;
    
          long res = (long)  Math.ceil(n*navg - sum);
    
          if (res <= 0) {
            throw new IllegalArgumentException("Required donation is non-positive: " + res);
          }
          else{
            return res;  
          }
    }

    @Override
    public String seriesSum(int n) {
        return "";
    }
}
