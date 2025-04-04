package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        if(g < 2 || m <= 2 || n < m){
            return null;
        }
        long[] result = new long[2];
        ArrayList<Long> primesTillN = returnArrayWithPrimesFromMTillN(m, n);
        for(int i = 0; i < primesTillN.size() - 1; i++){
            if(primesTillN.get(i + 1) - primesTillN.get(i) == g){
                result[0] = primesTillN.get(i);
                result[1] = primesTillN.get(i + 1);
                return result;
            }
        }
        return null;
    }
    private static ArrayList<Long> returnArrayWithPrimesFromMTillN(long m, long n){
        ArrayList<Long> array = new ArrayList<>();
        for(long i = m; i <=n; i++){
            if(isPrime(i)){
                array.add(i);
            }
        }
        return array;
    }

    private static boolean isPrime(long n){
        if(n <= 1){
            return false;
        }
        if(n % 2 == 0 && n != 2){
            return false;
        }
        for(int i = 3; i <= (long)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
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
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
