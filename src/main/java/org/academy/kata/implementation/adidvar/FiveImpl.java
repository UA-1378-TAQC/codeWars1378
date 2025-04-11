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
                if(prev != i && i - prev == g) {
                    return new long[]{prev, i};
                }
                prev = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        return 0;
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

        for(int i = 0 ; i < 100 ; i++){

            double range_middle = (range_begin + range_end)/2.0;
            double range_middle_value = calcFunction(range_middle);

            if(m > range_middle_value){
                range_begin = range_middle;
            } else {
                range_end = range_middle;
            }

        }
        return (range_begin + range_end)/2.0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
