package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.IEight;
import java.util.Arrays;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int)Math.floor(time*0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return Float.parseFloat(String.format("%.2f",mpg*(1.609344/4.54609188)));
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return this.isIntArrayEmptyOrNull(input)?new int[]{} : new int[] {(int)Arrays.stream(input).filter(el -> el>0).count(), Arrays.stream(input).filter(el -> el<0).sum()};
    }

    private boolean isIntArrayEmptyOrNull(int[] input){
        return input == null || input.length == 0;
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return (double)Math.round(number*100)/100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(el->el%divider==0).toArray();
    }

    @Override
    public boolean am_i_wilson(long n) {
        return false;
    }
}
