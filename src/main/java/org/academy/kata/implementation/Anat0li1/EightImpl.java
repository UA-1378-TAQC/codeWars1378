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
        float galInLiter = 4.54609188f;
        float milInKm = 1.609344f;
        int accuracy = 2;
        if(mpg <= 0){
            return 0.0f;
        }
        return (float) ((float)Math.round(Math.pow(10, accuracy) * mpg / (galInLiter / milInKm)) / Math.pow(10, accuracy));
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
