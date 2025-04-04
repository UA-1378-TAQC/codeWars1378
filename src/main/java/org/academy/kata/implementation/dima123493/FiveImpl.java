package org.academy.kata.implementation.dima123493;

import java.math.BigInteger;

import org.academy.kata.Base;
import org.academy.kata.IFive;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        long num_1 = 0;
        long num_2 = 1;

        for(long i = m;i<=n;i++){

            if(is_prime(i)){
                num_1 = num_2;
                num_2 = i;
                if((num_2 - num_1) == g){
                    return new long[]{num_1,num_2};
                }
            }
        }

        return null;
    }

    public static boolean is_prime(long num){
        for(long i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true; 
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
        return ((2 * m + 1) - Math.sqrt(4 * m + 1)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
