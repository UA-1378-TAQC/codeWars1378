package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.util.Arrays;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) Math.floor(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double kpl = mpg * (1.609344 / 4.54609188);
        return (float) (Math.round(kpl * 100.0) / 100.0);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);

            if (sqrt % 1 == 0) {
                array[i] = (int) sqrt;
            } else {
                array[i] = array[i] * array[i];
            }
        }

        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        {
            if (input == null || input.length == 0) {
                return new int[]{};
            }

            int psum = 0;
            int msum = 0;

            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    psum++;
                } else {
                    msum = msum + input[i];
                }
            }

            return new int[]{psum, msum};
        }
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
        int[] result = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                result[index] = numbers[i];
                index++;
            }

        }

        return Arrays.copyOf(result, index);
    }

    @Override
    public boolean am_i_wilson(long n) {
        return n == 5 || n == 13 || n == 563;
    }
}
