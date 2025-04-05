package org.academy.kata.implementation.DMSlobodianiuk;

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
        return 0;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number*100.0)/100.;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int k = 0;
        for(int i = 0;i<numbers.length;i++)
        {
            if(numbers[i]%divider == 0){
                k += 1;
            }
        }

        int new_numbers[] = new int[k];

        int p = 0;
        for(int i = 0;i<numbers.length;i++)
        {
            if(numbers[i]%divider == 0){
                new_numbers[p] = numbers[i];
                p += 1;
            }
        }
        
        return new_numbers;
    }

    @Override
    public boolean am_i_wilson(long n) {
        return false;
    }
}
