package org.academy.kata.implementation.viktoriiafylyk;

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
        String numStr = Long.toString(n);
        long minNumber = n;
        int minI = -1, minJ = -1;

        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 0; j < numStr.length(); j++) {
                if (i != j) {
                    StringBuilder sb = new StringBuilder(numStr);
                    char digit = sb.charAt(i);
                    sb.deleteCharAt(i);
                    sb.insert(j, digit);

                    long newNumber = Long.parseLong(sb.toString());

                    if (newNumber < minNumber) {
                        minNumber = newNumber;
                        minI = i;
                        minJ = j;
                    }
                }
            }
        }

        return new long[] { minNumber, minI, minJ };
    }
}
