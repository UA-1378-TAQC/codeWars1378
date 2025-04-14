package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.IEight;
import java.util.Arrays;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int)Math.floor(time/2.0);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    final static float MPG_TO_KPM = 1.0f / 4.54609188f * 1.609344f;
    final static float ROUND_TO = 100.0f;

    @Override
    public float mpgToKPM(float mpg) {
        return Math.round(ROUND_TO * (float)mpg * MPG_TO_KPM) / ROUND_TO;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0)
                result[i] = (int) Math.sqrt(array[i]);
            else
                result[i] = array[i] * array[i];
        }

        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int pcount = 0;
        int ncount = 0;

        if(input == null || input.length == 0){
            return new int[0];
        }

        for(int i = 0 ; i < input.length; i++){
            if(input[i] > 0)
                pcount ++;
            else
                ncount += input[i];

        }

        int[] array = new int[2];
        array[0] = pcount;
        array[1] = ncount;
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        int number = 0;
        int index = 0;
        int sign = 1;

        if(str.charAt(index) == '-')
        {
            sign = -1;
            index++;
        }

        while(index < str.length()){
            number = number * 10 + (str.charAt(index) - '0');
            index++;
        }

        return sign * number;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(100.0*number) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] array = new int[numbers.length];

        int index = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] % divider == 0){
                array[index++] = numbers[i];
            }
        }

        return Arrays.copyOf(array,index);
    }

    @Override
    public boolean am_i_wilson(long n) {
        if(n==5)
            return true;
        else if(n==13)
            return true;
        else if(n==563)
            return true;
        return false;
    }
}
