package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrime = 0;

        for (long num = m; num <= n; num++) {
            if (isPrime(num)) {
                if (previousPrime != 0 && num - previousPrime == g) {
                    return new long[]{previousPrime, num};
                }
                previousPrime = num;
            }
        }
        return null;
    }

    private static boolean isPrime(long num) {
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
        final int FACTOR_FOR_TRAILING_ZERO = 5;
        int count = 0;
        while (n > 0) {
            n /= FACTOR_FOR_TRAILING_ZERO;
            count += n;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger firstFibonacci = BigInteger.ONE;
        BigInteger secondFibonacci = BigInteger.ONE;
        BigInteger totalSideLength = BigInteger.ZERO;
        final BigInteger SIDES_PER_SQUARE = BigInteger.valueOf(4);

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            totalSideLength = totalSideLength.add(firstFibonacci);

            BigInteger next = firstFibonacci.add(secondFibonacci);
            firstFibonacci = secondFibonacci;
            secondFibonacci = next;
        }

        return totalSideLength.multiply(SIDES_PER_SQUARE);
    }

    @Override
    public double solve(double m) {
        final double COEFFICIENT_A = 2.0;
        final double COEFFICIENT_B = 1.0;
        final double UNDER_ROOT_MULTIPLIER = 4.0;

        double numerator = (COEFFICIENT_A * m + COEFFICIENT_B) - Math.sqrt(UNDER_ROOT_MULTIPLIER * m + COEFFICIENT_B);
        double denominator = COEFFICIENT_A * m;

        return numerator / denominator;
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
