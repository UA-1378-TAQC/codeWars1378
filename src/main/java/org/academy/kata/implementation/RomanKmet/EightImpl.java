package org.academy.kata.implementation.RomanKmet;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;


public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        final double kilometersPerMile = 1.609344;
        final double litersPerGallon = 4.54609188;
        double kpl = (mpg * kilometersPerMile) / litersPerGallon;
        BigDecimal kplRounded = new BigDecimal(kpl).setScale(2, RoundingMode.HALF_UP);
        return (float) kplRounded.doubleValue();
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt == (int) sqrt) {
                result[i] = (int) sqrt;
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int positiveCount = 0;
        int negativeSum = 0;
        for (int num : input) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
            }
        }
        return new int[]{positiveCount, negativeSum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(number -> number % divider == 0)
                .toArray();
    }

    @Override
    public boolean am_i_wilson(long n) {
        if (n < 2 || !isPrime(n)) {
            return false;
        }
        BigInteger factorial = factorial(n - 1).add(BigInteger.ONE);
        BigInteger divisor = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n));
        return factorial.mod(divisor).equals(BigInteger.ZERO);
    }

    private static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
