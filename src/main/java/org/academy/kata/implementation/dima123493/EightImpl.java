package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) (0.5 * time);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(number -> {
                    int sqrt = (int) Math.sqrt(number);
                    return (sqrt * sqrt == number) ? sqrt : number * number;
                })
                .toArray();
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] result = new int[2];

        for (int number : input) {
            if (number > 0) {
                result[0]++;
            } else if (number < 0) {
                result[1] += number;
            }
        }

        return result;
    }

    @Override
    public int stringToNumber(String str) {
        char[] values = str.toCharArray();

        int result = 0;
        boolean isNegative = values[0] == '-';

        for (int i = isNegative ? 1 : 0; i < values.length; i++) {
            char character = values[i];

            int digit = character - '0';
            result = result * 10 + digit;
        }
        return isNegative ? -result : result;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> resultList = Arrays.stream(numbers)
                .filter(number -> number % divider == 0)
                .boxed()
                .toList();

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
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
