package org.academy.kata.implementation.RomanKmet;

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
        double low = 0.0, high = 1.0, mid;
        double epsilon = 1e-14;
        while (high - low > epsilon) {
            mid = (low + high) / 2;
            double sum = 0, term = mid;
            for (int n = 1; n <= 100000; n++) {
                sum += n * term;
                term *= mid;
                if (term < 1e-14) break;
            }
            if (sum < m) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return (low + high) / 2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
