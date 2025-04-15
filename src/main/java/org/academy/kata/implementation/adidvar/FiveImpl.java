package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long prev = -1;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (prev != i && i - prev == g) {
                    return new long[]{prev, i};
                }
                prev = i;
            }
        }
        return null;
    }

    private static int countDiv(int n) {
        int step = 5;
        int counter = 0;
        while (step <= n) {
            counter += (n / step);
            step *= 5;
        }
        return counter;
    }

    @Override
    public int zeros(int n) {
        if (n == 0)
            return 0;
        return countDiv(n);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.ONE;

        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;

        for (BigInteger i = BigInteger.TWO; i.compareTo(n.add(BigInteger.ONE)) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger temp = curr;
            curr = curr.add(prev);
            prev = temp;

            sum = sum.add(curr);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    private static double calcFunction(double x) {
        double index = 1.0;
        double power = x;
        double result = 0;

        double element = 1.0;
        while (element > 1e-14) {
            element = index * power;
            result += element;

            index += 1.0;
            power *= x;
        }

        return result;
    }

    @Override
    public double solve(double m) {
        double range_begin = 1e-12;
        double range_end = 1.0 - range_begin;

        for (int i = 0; i < 100; i++) {

            double range_middle = (range_begin + range_end) / 2.0;
            double range_middle_value = calcFunction(range_middle);

            if (m > range_middle_value) {
                range_begin = range_middle;
            } else {
                range_end = range_middle;
            }

        }
        return (range_begin + range_end) / 2.0;
    }

    private static String moveCharacter(String str, int fromIndex, int toIndex) {
        char charToMove = str.charAt(fromIndex);
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(fromIndex);

        sb.insert(toIndex, charToMove);

        return sb.toString();
    }

    @Override
    public long[] smallest(long n) {
        int count = String.valueOf(n).length();

        long min = n;
        int r1 = -1, r2 = -1;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) continue;

                String string = String.valueOf(n);
                string = moveCharacter(string, i, j);

                long new_num = Long.parseLong(string);

                if (new_num < min) {
                    min = new_num;
                    r1 = i;
                    r2 = j;
                }
            }
        }

        return new long[]{min, (long) r1, (long) r2};
    }
}
