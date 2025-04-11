package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.math.BigInteger;
public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
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
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n% i == 0) {
                return false;
            }
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial.mod(BigInteger.valueOf(n)).equals(BigInteger.valueOf(n - 1));
    }
}



