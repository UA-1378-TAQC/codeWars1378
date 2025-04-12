package org.academy.kata.implementation.RomanKmet;

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
        String number = Long.toString(n);
        long smallest = n;
        int fromIndex = 0, toIndex = 0;
        for (int i = 0; i < number.length(); i++) {
            char removed = number.charAt(i);
            String remaining = number.substring(0, i) + number.substring(i + 1);
            for (int j = 0; j <= remaining.length(); j++) {
                String newNumber = remaining.substring(0, j) + removed + remaining.substring(j);
                long value = Long.parseLong(newNumber);
                if (value < smallest) {
                    smallest = value;
                    fromIndex = i;
                    toIndex = j;
                }
            }
        }
        return new long[]{smallest, fromIndex, toIndex};
    }
}
