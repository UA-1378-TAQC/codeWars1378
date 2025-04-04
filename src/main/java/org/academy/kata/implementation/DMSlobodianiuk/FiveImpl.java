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
        BigInteger fibo_1 = BigInteger.ONE;
        BigInteger fibo_2 = BigInteger.ONE;
        

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            
            BigInteger t = fibo_2;


            fibo_2 = fibo_2.add(fibo_1);
            fibo_1 = t;
        }

        fibo_2 = fibo_2.add(BigInteger.valueOf(-1));

        return fibo_2.multiply(BigInteger.valueOf(4));
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
