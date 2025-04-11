package org.academy.kata.implementation.Anat0li1;

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
        int zeros = 0;
        for (int i = 5; i <= n; i *= 5) {
            zeros += n / i;
        }
        return zeros;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return BigInteger.valueOf(4).multiply(returnFibonacciSumOfNMembers(n));
    }

    private static BigInteger returnFibonacciSumOfNMembers(BigInteger n){
        BigInteger firstPart = BigInteger.ZERO;
        BigInteger secondPart = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger temp = firstPart;
            firstPart = secondPart;
            secondPart = secondPart.add(temp);
            sum = sum.add(secondPart);
        }
        return sum;
    }

    @Override
    public double solve(double m) {
        double b = 1 / m + 2;
        double D = Math.pow(b, 2) - 4.0;
        return (b - Math.sqrt(D)) / 2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
