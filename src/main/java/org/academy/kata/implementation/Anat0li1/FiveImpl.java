package org.academy.kata.implementation.Anat0li1;

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

    @Override
    public double solve(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        long num = n;
        if(n < 10){
            return new long[]{};
        }
        int N = Long.toString(n).length();
        int[] digits = new int[N];
        for(int i = N - 1; i >= 0; i--){
            digits[N - i - 1] = (int)Math.floor(n / Math.pow(10, i));
            n %= (long) Math.pow(10, i);
        }
        int indexTo = 0;
        int indexFrom = 0;
        int[] newNumDigits;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i != j){
                    newNumDigits = shiftOneMember(digits, i, j);
                    long tempNum = arrayToNumber(newNumDigits);
                    if(tempNum < num || (tempNum == num && i < indexFrom)){
                        num = tempNum;
                        indexFrom = i;
                        indexTo = j;
                    }
                }
            }
        }
        return new long[]{num, indexFrom, indexTo};
    }

    private static int[] shiftOneMember(int[] array, int indexFrom, int indexTo) {
        int[] result = new int[array.length];
        int movedDigit = array[indexFrom];
        int k = 0;
        for(int i = 0; i < array.length; i++) {
            if(i != indexFrom) {
                result[k++] = array[i];
            }
        }
        for(int i = result.length - 1; i > indexTo; i--) {
            result[i] = result[i - 1];
        }
        result[indexTo] = movedDigit;
        return result;
    }

    private static long arrayToNumber(int[] array){
        int index = 0;
        int n = array.length;
        long result = 0;
        while(array[index] == 0){
            index++;
        }
        for(int j = index; j < n; j++){
            result += (long)Math.pow(10, n - j - 1) * array[j];
        }
        return result;
    }
}
