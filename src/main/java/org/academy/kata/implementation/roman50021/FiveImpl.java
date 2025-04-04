package org.academy.kata.implementation.roman50021;

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
        String s = Long.toString(n);

        long[] array = new long[s.length()];

        for(int i = 0; i < s.length(); i++){
            array[i] = s.charAt(i) - '0';
        }

        long minNumber  = n;
        int from = 0;
        int to = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if (i == j) continue;

                long[] copy = array.clone();

                long digitToMove = copy[i];

                if (i < j){
                    for (int k = i; k < j; k++){
                        copy[k] = copy[k + 1];
                    }
                    copy[j] = digitToMove;
                } else {
                    for (int k = i; k > j; k--){
                        copy[k] = copy[k - 1];
                    }
                    copy[j] = digitToMove;
                }

                StringBuilder sb = new StringBuilder();
                for (long digit : copy){
                    sb.append(digit);
                }

                long candidate = Long.parseLong(sb.toString());

                if(candidate < minNumber){
                    minNumber = candidate;
                    from = i;
                    to = j;
                }
            }
        }

        return new long[]{minNumber, from, to};
    }
}
