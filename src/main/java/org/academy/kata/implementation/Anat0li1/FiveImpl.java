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
        return 0;
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
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
