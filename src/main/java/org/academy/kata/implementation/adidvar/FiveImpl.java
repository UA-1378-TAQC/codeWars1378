package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long prev = -1;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if(prev != i && i - prev == g) {
                    return new long[]{prev, i};
                }
                prev = i;
            }
        }
        return null;
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
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
