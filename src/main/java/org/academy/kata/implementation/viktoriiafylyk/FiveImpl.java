package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> primes = new ArrayList<>();

        // Перебираємо всі числа від m до n
        for (long i = m; i <= n; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }

        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == g) {
                return new long[]{primes.get(i), primes.get(i + 1)};
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
