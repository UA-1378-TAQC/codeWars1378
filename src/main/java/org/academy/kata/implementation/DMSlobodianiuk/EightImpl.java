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
        if(input == null || input.length == 0){
            int empty[] = {};
            return empty;
        }

        int pos_count = 0;
        int neg_sum = 0;

        for(int i = 0;i<input.length;i++)
        {
            if(input[i] > 0){
                pos_count += 1;
            }
            else{
                neg_sum += input[i];
            }
        }

        int res[] = {pos_count,neg_sum};

        return res;
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
