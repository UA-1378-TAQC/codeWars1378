package org.academy.kata.implementation.BohdanKovalets;

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
        int num = n.intValue();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = a;

        for (int i=1; i<=num; i++) {
            sum = sum.add(b);
            BigInteger temp = b;
            b = a.add(b);
            a = temp;
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double left = 0;
        double right = 1;

        for (int i=0; i<100; i++) {
            double x = (left+right) / 2;
            double result = x / ((1-x) * (1-x));

            if (Math.abs(result-m) < 1e-12) {
                return x;
            }

            if (result<m) {
                left = x;
            } else {
                right = x;
            }
        }

        return (left + right)/2;
    }

    @Override
    public long[] smallest(long n) {
        String numberStr = Long.toString(n);
        int length = numberStr.length();

        long minResult = n;
        int from = 0;
        int to = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                StringBuilder temp = new StringBuilder(numberStr);
                char currentDigit = temp.charAt(i);
                temp.deleteCharAt(i);
                temp.insert(j, currentDigit);

                long candidate = Long.parseLong(temp.toString());

                boolean better = candidate < minResult;
                boolean sameButEarlier = candidate == minResult && (i < from || (i == from && j < to));

                if (better || sameButEarlier) {
                    minResult = candidate;
                    from = i;
                    to = j;
                }
            }
        }

        return new long[] { minResult, from, to };
    }
}
