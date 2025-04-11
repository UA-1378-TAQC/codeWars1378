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

    @Override
    public double solve(double m) {
        return 0;
    }

    private static String moveCharacter(String str, int fromIndex, int toIndex) {
        char charToMove = str.charAt(fromIndex);
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(fromIndex);

        sb.insert(toIndex, charToMove);

        return sb.toString();
    }

    @Override
    public long[] smallest(long n) {
        int count = String.valueOf(n).length();

        long min = n;
        int r1 = -1,r2 = -1;

        for(int i = 0 ; i < count; i++){
            for(int j = 0 ; j < count; j++){
                if(i==j) continue;

                String string = String.valueOf(n);
                string = moveCharacter(string,i,j);

                long new_num = Long.parseLong(string);

                if(new_num < min){
                    min = new_num;
                    r1 = i;
                    r2 = j;
                }
            }
        }

        return new long[] {min,(long)r1,(long)r2};
    }
}
