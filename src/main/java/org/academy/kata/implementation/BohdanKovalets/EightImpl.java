package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.IEight;

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
        return Integer.parseInt(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {

        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]%divider==0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]%divider == 0) {
                result[index] = numbers[i];
                index++;
            }
        }

        return result;
    }

    @Override
    public boolean am_i_wilson(long n) {

        return n == 5 || n == 13 || n == 563;
    }
}
