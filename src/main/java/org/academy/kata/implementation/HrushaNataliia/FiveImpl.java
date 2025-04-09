package org.academy.kata.implementation.HrushaNataliia;

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
        String s = Long.toString(n);
        long minNum = n;
        int bestI = 0;
        int bestJ = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String temp = s.substring(0, i) + s.substring(i + 1);

            for (int j = 0; j <= temp.length(); j++) {
                String newStr = temp.substring(0, j) + c + temp.substring(j);
                long newNum = Long.parseLong(newStr);

                if (newNum < minNum) {
                    minNum = newNum;
                    bestI = i;
                    bestJ = j;
                } else if (newNum == minNum) {
                    if (i < bestI || (i == bestI && j < bestJ)) {
                        bestI = i;
                        bestJ = j;
                    }
                }
            }
        }

        return new long[]{minNum, bestI, bestJ};
    }
}
