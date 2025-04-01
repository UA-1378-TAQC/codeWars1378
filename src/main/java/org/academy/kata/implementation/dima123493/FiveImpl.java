package org.academy.kata.implementation.dima123493;

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
        BigInteger firstFibonacci = BigInteger.ONE;
        BigInteger secondFibonacci = BigInteger.ONE;
        BigInteger totalSideLength = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            totalSideLength = totalSideLength.add(firstFibonacci);

            BigInteger next = firstFibonacci.add(secondFibonacci);
            firstFibonacci = secondFibonacci;
            secondFibonacci = next;
        }

        return totalSideLength.multiply(BigInteger.valueOf(4));
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
