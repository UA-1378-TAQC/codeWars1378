package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.IEight;
import java.math.BigInteger;

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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public boolean am_i_wilson(long n) {
        if (n==0 || n==1) return false;
        BigInteger fact = this.factorial(BigInteger.valueOf(n-1));
        BigInteger nSquared = BigInteger.valueOf(n).pow(2);
        return fact.add(BigInteger.ONE).mod(nSquared).equals(BigInteger.ZERO);
    }

    private BigInteger factorial(BigInteger n){
        return (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE) ) ? BigInteger.ONE : this.factorial(n.subtract(BigInteger.ONE)).multiply(n);
    }
}
