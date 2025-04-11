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
        return null;
    }

    @Override
    public double solve(double m) {
        return 0;
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
