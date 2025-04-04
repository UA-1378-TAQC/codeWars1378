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
        if(numbers == null || numbers.length == 0){
            return new int[]{};
        }
        int[] result = new int[numbers.length];
        int resultIndex = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                result[resultIndex] = numbers[i];
                resultIndex++;
            }
        }
        for(int j = result.length - 1; j >= resultIndex; j--){
            result = removeAt(result, j);
        }
        return result;
    }

    private static int[] removeAt(int [] array, int index){
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index){
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }

    @Override
    public boolean am_i_wilson(long n) {
        return false;
    }
}
