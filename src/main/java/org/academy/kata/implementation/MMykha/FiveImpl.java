package org.academy.kata.implementation.MMykha;

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
        int nInt = n.intValue();
        BigInteger [] arraySides = new BigInteger [nInt+2];
        arraySides[0]=BigInteger.ZERO;
        arraySides[1]=BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;
        for(int i = 2; i<arraySides.length; i++){
            arraySides[i] = (arraySides[i-1]).add(arraySides[i-2]);
            sum = sum.add(arraySides[i]);
        }
        return sum.multiply(BigInteger.valueOf(4));
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
