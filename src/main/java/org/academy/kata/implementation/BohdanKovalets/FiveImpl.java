package org.academy.kata.implementation.BohdanKovalets;

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
        double left = 0;
        double right = 1;

        for (int i=0; i<100; i++) {
            double x = (left+right) / 2;
            double result = x / ((1-x) * (1-x));

            if (Math.abs(result-m) < 1e-12) {
                return x;
            }

            if (result<m) {
                left = x;
            } else {
                right = x;
            }
        }

        return (left + right)/2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
