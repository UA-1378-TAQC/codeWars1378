package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        long lastPrime = 0;

        for (long current = m; current <= n; current++) {
            boolean isPrime = true;
            if (current < 2 || (current > 2 && current % 2 == 0)) {
                isPrime = false;
            } else {
                for (long i = 3; i * i <= current; i += 2) {
                    if (current % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                if (lastPrime != 0 && current - lastPrime == g) {
                    return new long[]{lastPrime, current};
                }
                lastPrime = current;
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
