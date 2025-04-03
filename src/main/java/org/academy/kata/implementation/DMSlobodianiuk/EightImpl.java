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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public static boolean amIWilson(long n){

        if(n == 0 || n == 1){
            return false;
        }
        long p = n;        
        double t = ((factorial(p-1) + 1)%(Math.pow(p,2)));
        

        if(t == 0){
            return true;
        }
        else{
            return false;
        }
    }


    public static long factorial(long p){
        int k = 1;

        for(int i = 1;i<=p;i++){
            k *= i;
        }

        return k;
    }
}
