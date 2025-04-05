package org.academy.kata.implementation.novitskiiy;

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
        double low = 0.0;
        double high = 1.0;
        double mid = 0.0;

        while (high - low > 1e-14) {
            mid = (low + high) / 2.0;
            double value = mid / Math.pow(1 - mid, 2);

            if (value < m) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return (low + high) / 2.0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
