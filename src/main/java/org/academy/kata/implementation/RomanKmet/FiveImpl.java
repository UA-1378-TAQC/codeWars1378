package org.academy.kata.implementation.RomanKmet;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrime = -1;
        for (long i = m; i <= n; i++) {
            boolean isPrime = true;
            if (i < 2) isPrime = false;
            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (previousPrime != -1 && i - previousPrime == g) {
                    return new long[]{previousPrime, i};
                }
                previousPrime = i;
            }
        }
        return null;
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
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = BigInteger.TWO;
        for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger next = a.add(b);
            sum = sum.add(next);
            a = b;
            b = next;
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double low = 0.0, high = 1.0, mid;
        double epsilon = 1e-14;
        while (high - low > epsilon) {
            mid = (low + high) / 2;
            double sum = 0, term = mid;
            for (int n = 1; n <= 100000; n++) {
                sum += n * term;
                term *= mid;
                if (term < 1e-14) break;
            }
            if (sum < m) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return (low + high) / 2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
