package org.academy.kata.implementation.novitskiiy;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        long prevPrime = 0;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (prevPrime != 0 && (i - prevPrime) == g) {
                    return new long[]{prevPrime, i};
                }
                prevPrime = i;
            }
        }
        return null;
    }

    private boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
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
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = a.add(b);

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger next = a.add(b);
            sum = sum.add(next);
            a = b;
            b = next;
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double low = 0.0;
        double high = 1.0;
        double mid = 0.0;

        while (high - low > 1e-14) {
            mid = (low + high) / 2.0;
            double value = mid / Math.pow(1 - mid, 2);

            if (value < m) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return (low + high) / 2.0;
    }

    @Override
    public long[] smallest(long n) {
        String numStr = String.valueOf(n);
        long min = n;
        int from = 0;
        int to = 0;

        for (int i = 0; i < numStr.length(); i++) {
            char removed = numStr.charAt(i);
            StringBuilder sb = new StringBuilder(numStr);
            sb.deleteCharAt(i);

            for (int j = 0; j <= sb.length(); j++) {
                StringBuilder temp = new StringBuilder(sb);
                temp.insert(j, removed);
                long newVal = Long.parseLong(temp.toString());

                if (newVal < min) {
                    min = newVal;
                    from = i;
                    to = j;
                }
            }
        }

        return new long[]{min, from, to};
    }
}
