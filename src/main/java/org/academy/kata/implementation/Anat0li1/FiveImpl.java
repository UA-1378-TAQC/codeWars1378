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
        int zeros = 0;
        for (int i = 5; i <= n; i *= 5) {
            zeros += n / i;
        }
        return zeros;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return BigInteger.valueOf(4).multiply(returnFibonacciSumOfNMembers(n));
    }

    private static BigInteger returnFibonacciSumOfNMembers(BigInteger n){
        BigInteger firstPart = BigInteger.ZERO;
        BigInteger secondPart = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger temp = firstPart;
            firstPart = secondPart;
            secondPart = secondPart.add(temp);
            sum = sum.add(secondPart);
        }
        return sum;
    }

    @Override
    public double solve(double m) {
        double b = 1 / m + 2;
        double D = Math.pow(b, 2) - 4.0;
        return (b - Math.sqrt(D)) / 2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
