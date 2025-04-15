package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.math.BigInteger;
import java.util.Arrays;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kilometersPerLitre = Math.round((mpg * (1.609344 / 4.54609188)) * 100);
        kilometersPerLitre /= 100;//for 2 decimals
        return kilometersPerLitre;

    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else array[i] = array[i] * array[i];
        }
        return array;
    }


    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int[] array = {0, 0};
        for (int j : input) {
            if (j > 0) {
                array[0]++;
            }
            if (j <= 0) {
                array[1] += j;
            }
        }
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        int number = 0;
        try {
            number = Integer.parseInt(str);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }
        return number;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(number -> number % divider == 0)
                .toArray();
    }

    @Override
    public boolean am_i_wilson(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial.mod(BigInteger.valueOf(n)).equals(BigInteger.valueOf(n - 1));
    }
}



