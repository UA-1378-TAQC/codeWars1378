package org.academy.kata.implementation.DMSlobodianiuk;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        long num_1 = 0;
        long num_2 = 1;

        for (long i = m; i <= n; i++) {

            if (is_prime(i)) {
                num_1 = num_2;
                num_2 = i;
                if ((num_2 - num_1) == g) {
                    return new long[]{num_1, num_2};
                }
            }
        }

        return null;
    }

    public static boolean is_prime(long num) {
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public int zeros(int n) {

        int z = 0;

        while (n >= 5) {
            n /= 5;
            z += n;
        }

        return z;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger fibo_1 = BigInteger.ONE;
        BigInteger fibo_2 = BigInteger.ONE;


        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {

            BigInteger t = fibo_2;


            fibo_2 = fibo_2.add(fibo_1);
            fibo_1 = t;
        }

        fibo_2 = fibo_2.add(BigInteger.valueOf(-1));

        return fibo_2.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {

        double x = ((2 * m + 1) - Math.sqrt(Math.pow((2 * m + 1), 2) - 4 * m * m)) / (2 * m);

        return x;
    }

    @Override
    public long[] smallest(long n) {
        int len = Long.toString(n).length();
        long k[] = new long[3];

        long min = n;
        long min_i = 0;
        long min_j = 0;

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {
                StringBuilder sb = new StringBuilder(Long.toString(n));
                char ch = sb.charAt(i);

                if (i == j) continue;

                sb.deleteCharAt(i);
                sb.insert(j, ch);

                long num = Long.parseLong(sb.toString());

                if (min > num) {
                    min = num;
                    min_i = i;
                    min_j = j;
                }
            }
        }

        k[0] = min;
        k[1] = min_i;
        k[2] = min_j;

        return k;
    }
}
