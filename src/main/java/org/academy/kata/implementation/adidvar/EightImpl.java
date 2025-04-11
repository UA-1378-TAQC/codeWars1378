package org.academy.kata.implementation.adidvar;

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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
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
