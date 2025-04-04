package org.academy.kata.implementation.Anat0li1;

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
        double b = 1 / m + 2;
        double D = Math.pow(b, 2) - 4.0;
        return (b - Math.sqrt(D)) / 2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
