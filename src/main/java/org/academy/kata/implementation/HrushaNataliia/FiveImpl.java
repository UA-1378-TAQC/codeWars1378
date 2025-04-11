package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {

    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrime = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (previousPrime != 0 && i - previousPrime == g) {
                    return new long[]{previousPrime, i};
                }
                previousPrime = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
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
