package org.academy.kata.implementation.novitskiiy;

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

        return new long[] {min, from, to};
    }
}
