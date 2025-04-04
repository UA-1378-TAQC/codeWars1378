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
        
        int z = 0;

        while(n >= 5){
            n /= 5;
            z += n;
        }

        return z;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solve(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
