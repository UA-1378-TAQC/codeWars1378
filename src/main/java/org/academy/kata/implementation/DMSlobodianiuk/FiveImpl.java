package org.academy.kata.implementation.DMSlobodianiuk;

import java.math.BigInteger;

import org.academy.kata.Base;
import org.academy.kata.IFive;

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
        
        double x = ((2*m + 1) - Math.sqrt( Math.pow((2*m + 1),2) - 4*m*m))/(2*m);

        return x;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
