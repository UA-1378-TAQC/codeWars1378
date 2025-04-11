package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.IEight;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double miles_per_imperial_gallon = 1.609344;
        double kilometers_per_liter = 4.54609188;
        double kpl = mpg * (miles_per_imperial_gallon/kilometers_per_liter);
        return (float) Math.round(kpl * 100.0) / 100f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        for (int i = 0; i < array.length; i++ ){
            double sqrt = Math.sqrt(array[i]);

            if (sqrt == Math.floor(sqrt)){
                array[i] = (int) sqrt;
            }else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int positiveCount = 0;
        int negativeSum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positiveCount++;
            } else if (input[i] < 0) {
                negativeSum += input[i];
            }
        }
        return new int[] {positiveCount, negativeSum};
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
