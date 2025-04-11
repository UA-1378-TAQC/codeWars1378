package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {

    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrime = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (previousPrime != 0 && i - previousPrime == g) {
                    return new long[]{previousPrime, i};
                }
                previousPrime = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double a = m;
        double b = -(2 * m + 1);
        double c = m;

        double discriminant = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (x1 > 0 && x1 < 1) {
            return x1;
        } else {
            return x2;
        }
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
