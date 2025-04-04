package org.academy.kata.implementation.dima123493;

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
        return ((2 * m + 1) - Math.sqrt(4 * m + 1)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        String numStr = Long.toString(n);
        long minValue = n;
        int fromIndex = 0;
        int toIndex = 0;

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            StringBuilder sb = new StringBuilder(numStr);
            sb.deleteCharAt(i);

            for (int j = 0; j <= sb.length(); j++) {
                StringBuilder temp = new StringBuilder(sb);
                temp.insert(j, digit);

                long candidate = Long.parseLong(temp.toString());

                if (candidate < minValue) {
                    minValue = candidate;
                    fromIndex = i;
                    toIndex = j;
                }
            }
        }

        return new long[]{minValue, fromIndex, toIndex};
    }
}
