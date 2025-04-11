package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.IEight;

import java.math.BigInteger;

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
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                if(Math.sqrt(array[i]) == Math.floor(Math.sqrt(array[i]))){
                    array[i] = (int)Math.sqrt(array[i]);
                }
                else{
                    array[i] = (int)Math.pow(array[i], 2);
                }
            }
        }
        return array;
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
        try{
            return Integer.parseInt(str);
        }
        catch(Exception e){
            return 0;
        }
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
        return isPrime(n) && factorial(BigInteger.valueOf(n - 1)).add(BigInteger.ONE).mod(BigInteger.valueOf(n).multiply(BigInteger.valueOf(n))).equals(BigInteger.ZERO);
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    private static boolean isPrime(long n){
        if(n <= 1){
            return false;
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
