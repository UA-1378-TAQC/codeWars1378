package org.academy.kata.implementation.Anat0li1;

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
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                if(Math.sqrt(input[i]) == Math.floor(Math.sqrt(input[i]))){
                    input[i] = (int)Math.sqrt(input[i]);
                }
                else{
                    input[i] = (int)Math.pow(input[i], 2);
                }
            }
        }
        return input;
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
