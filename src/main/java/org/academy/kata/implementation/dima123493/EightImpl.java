package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.math.BigInteger;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(long n) {
        if (!isPrime(n)) {
            return false;
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n - 1; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        factorial = factorial.add(BigInteger.ONE);

        BigInteger pSquared = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n));
        return factorial.mod(pSquared).equals(BigInteger.ZERO);
    }

    private static boolean isPrime(long p) {
        if (p <= 1) return false;
        for (int i = 2; (long) i * i <= p; i++) {
            if (p % i == 0) return false;
        }
        return true;
    }
}
