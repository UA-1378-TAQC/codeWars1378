package org.academy.kata.implementation.roman50021;

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
        BigInteger a = BigInteger.ZERO; // F(0)
        BigInteger b = BigInteger.ONE; // F(1)
        BigInteger sum = BigInteger.ONE; // Start F(1)

        for(BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)){
            BigInteger next = a.add(b); // F(k) = F(k-2) + F(k-1)
            sum = sum.add(next);
            a = b; // move next to Fibonacci
            b = next;
        }
        return sum.multiply(BigInteger.valueOf(4));
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
