package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.util.Arrays;
import java.util.List;

public class EightImpl extends Base implements IEight {
    @Override
    public List<String> getTasks() {
        return Arrays.asList(
                "liters(double time)",
                "getVolumeOfCuboid(double length, double width, double height)",
                "mpgToKPM(float mpg)",
                "squareOrSquareRoot(int[] array)",
                "countPositivesSumNegatives(int[] input)",
                "stringToNumber(String str)",
                "TwoDecimalPlaces(double number)",
                "divisibleBy(int[] numbers, int divider)",
                "am_i_wilson(long n)"
        );
    }
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
