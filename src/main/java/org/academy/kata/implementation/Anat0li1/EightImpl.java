package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.IEight;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        if(time <= 0){
            return 0;
        }
        double litresPerHour = 0.5;
        return (int)Math.floor(time * litresPerHour);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if(length < 0 || width < 0 || height < 0){
            return -1;
        }
        return length * width * height;
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
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(long n) {
        return false;
    }
}
