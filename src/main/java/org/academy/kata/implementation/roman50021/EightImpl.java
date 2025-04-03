package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.IEight;
import java.util.Arrays;

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
        int [] result = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0){
                result[index] = numbers[i];
                index++;
            }

        }

        return Arrays.copyOf(result, index);
    }

    @Override
    public boolean am_i_wilson(long n) {
        return false;
    }
}
