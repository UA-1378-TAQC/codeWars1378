package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    private static double calcFunction(double x) {
        double index = 1.0;
        double power = x;
        double result = 0;

        double element = 1.0;
        while (element > 1e-14) {
            element = index * power;
            result += element;

            index += 1.0;
            power *= x;
        }

        return result;
    }

    @Override
    public double solve(double m) {
        double range_begin = 1e-12;
        double range_end = 1.0 - range_begin;

        for(int i = 0 ; i < 100 ; i++){

            double range_middle = (range_begin + range_end)/2.0;
            double range_middle_value = calcFunction(range_middle);

            if(m > range_middle_value){
                range_begin = range_middle;
            } else {
                range_end = range_middle;
            }

        }
        return (range_begin + range_end)/2.0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
