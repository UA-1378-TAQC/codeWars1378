package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    public  boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    @Override
    public long[] gap(int g, long m, long n) {
        long lastPrime = -1;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (lastPrime != -1 && i - lastPrime == g) {
                    return new long[]{lastPrime, i};  // Return the pair
                }
                lastPrime = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {

        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
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
