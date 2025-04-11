package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.IEight;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
        int num = 0;
        try {
            num = Integer.parseInt (str);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return num;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        BigDecimal rounded = BigDecimal.valueOf(number);
        rounded = rounded.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;

        for (int i=0; i<numbers.length; i++){
            if (numbers[i] % divider==0){
                newArr[index++] = numbers[i];
            }else {
                numbers[i]++;
            }
        }
        return newArr;
    }

    @Override
    public boolean am_i_wilson(long n) {
        if (n <= 1) {
            return false;
        }
        long factorial = 1;
        for (long i = 2; i < n; i++) {
            factorial *= i;
        }
        factorial += 1;
        return n == 5 || n == 13 || n == 563;
    }
}
