package org.academy.kata.implementation.HrushaNataliia;

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
        int count = 0;
        for (int i = 5; m / i >= 1; i *= 5) {
            count += (int) (m / i);
        }
        return count;
    }


    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
