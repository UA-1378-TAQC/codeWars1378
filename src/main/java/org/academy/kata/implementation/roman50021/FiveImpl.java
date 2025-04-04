package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solve(double m) {
        double left = 0.0;
        double right = 1.0;
        double mid = 0.0;

        while (right - left > 1e-13){
            mid = (left + right) / 2;
            double current = mid / Math.pow(1 - mid, 2);

            if(current < m){
                left = mid;
            }else {
                right = mid;
            }
        }

        return mid;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
