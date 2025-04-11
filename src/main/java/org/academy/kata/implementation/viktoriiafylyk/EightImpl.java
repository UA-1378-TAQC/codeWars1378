package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.IEight;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int)Math.floor (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float MILES_TO_KILOMETERS = 1.609344F;
        float GALLONS_TO_LITERS = 4.54609188F;
        double kpl = (mpg * MILES_TO_KILOMETERS) / GALLONS_TO_LITERS;
        return (float) (Math.round(kpl * 100.0) / 100.0);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++ ){
            int sqrt = (int) Math.sqrt(array[i]);
            if (sqrt * sqrt == array[i]) {
                array[i] = sqrt;
            } else {
                array[i]*= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                posSum++;
            } else if (input[i] < 0) {
                negSum += input[i];
            }
        }

        return new int[]{posSum, negSum};
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
        return false;
    }
}
