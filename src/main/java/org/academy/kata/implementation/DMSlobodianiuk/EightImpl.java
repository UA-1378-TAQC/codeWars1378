package org.academy.kata.implementation.DMSlobodianiuk;

import org.academy.kata.Base;
import org.academy.kata.IEight;

public class EightImpl extends Base implements IEight {
    @Override
    public int liters(double time) {
        return (int) Math.floor(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double Imperial_Gallon = 4.54609188;
        double Mile = 1.609344;
        return (float) (Math.round(mpg/Imperial_Gallon*Mile*100.0) / 100.0);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for(int i = 0;i<array.length;i++){
            if(Math.sqrt(array[i])%1 == 0){
                array[i] = (int) Math.sqrt(array[i]);
            }
            else{
                array[i] = (int) Math.pow(array[i],2);
            }
        }


        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0){
            int empty[] = {};
            return empty;
        }

        int pos_count = 0;
        int neg_sum = 0;

        for(int i = 0;i<input.length;i++)
        {
            if(input[i] > 0){
                pos_count += 1;
            }
            else{
                neg_sum += input[i];
            }
        }

        int res[] = {pos_count,neg_sum};

        return res;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number*100.0)/100.;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int k = 0;
        for(int i = 0;i<numbers.length;i++)
        {
            if(numbers[i]%divider == 0){
                k += 1;
            }
        }

        int new_numbers[] = new int[k];

        int p = 0;
        for(int i = 0;i<numbers.length;i++)
        {
            if(numbers[i]%divider == 0){
                new_numbers[p] = numbers[i];
                p += 1;
            }
        }
        
        return new_numbers;
    }

    @Override
    public boolean am_i_wilson(long n){

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
