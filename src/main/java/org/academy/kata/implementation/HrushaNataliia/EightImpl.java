package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        double kilometersPerMile = 1.609344;
        double litersPerGallon = 4.54609188;
        double kpl = (mpg * kilometersPerMile) / litersPerGallon;
        return (float) (Math.round(kpl * 100) / 100.0);
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
        return Math.round(number * 100) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                divisibleNumbers.add(number);
            }
        }
        int[] result = new int[divisibleNumbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = divisibleNumbers.get(i);
        }
        return result;
    }

    @Override
    public boolean am_i_wilson(long n) {
        return n == 5 || n == 13 || n == 563;
    }
}
