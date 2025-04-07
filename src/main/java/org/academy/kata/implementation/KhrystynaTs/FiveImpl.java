package org.academy.kata.implementation.KhrystynaTs;

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
        long minNumber = n;
        int indexI = -1;
        int indexJ = -1;

        for (int i = 0; i < numStr.length(); i++) {
            char removedDigit = numStr.charAt(i);

            for (int j = 0; j < numStr.length(); j++) {
                if (j != i) {
                    StringBuilder newNumberBuilder = new StringBuilder();
                    newNumberBuilder.append(numStr.substring(0, i));
                    newNumberBuilder.append(removedDigit);
                    newNumberBuilder.append(numStr.substring(i + 1, j));
                    newNumberBuilder.append(numStr.substring(j));
                    long newNumber = Long.parseLong(newNumberBuilder.toString());
                    if (newNumber < minNumber) {
                        minNumber = newNumber;
                        indexI = i;
                        indexJ = j;
                    }
                }
            }
        }
        return new long[]{minNumber, indexI, indexJ};
    }
}
