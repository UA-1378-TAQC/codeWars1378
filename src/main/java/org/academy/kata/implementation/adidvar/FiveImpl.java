package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    private static int countDiv(int n, int d){
        int step = d;
        int counter = 0;
        while (step <= n){
            counter += (n / step);
            step *= d;
        }
        return counter;
    }

    @Override
    public int zeros(int n) {
        if(n==0)
            return 0;
        return countDiv(n,5);
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
