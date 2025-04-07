package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;
import java.util.List;

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
        return new long[0];
    }

    @Override
    public List<String> getTasks() {
        return List.of(
                "gap (Find a gap between two prime numbers with a given difference)",
                "zeros (Count the number of trailing zeros in n!)",
                "perimeter (Calculate the perimeter of a polygon, e.g., square with side length n)",
                "solve (Perform a calculation on m, such as m^2)",
                "smallest (Find the smallest factor of a given number n)"
        );
    }
}
