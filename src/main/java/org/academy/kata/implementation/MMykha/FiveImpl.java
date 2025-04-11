package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        for(long i = m; i <= n-g; i++){
            if(isPrime(i)){
                for(long j = i+1; j<=n; j++){
                    if(isPrime(j)&&j-i==g) return new long[]{i,j};
                    else if(isPrime(j)) break;
                }
            }
        }
        return null;
    }

    private boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
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
        String minNumberString = Long.toString(n);
        long min = n;
        int indexI = -1;
        int indexJ = -1;
        for(int i = 0; i<minNumberString.length(); i++){
            char removedDigit = minNumberString.charAt(i);
            StringBuilder t = new StringBuilder(minNumberString);
            t.deleteCharAt(i);
            for(int j = 0; j<minNumberString.length(); j++){
                if(i==j) continue;
                StringBuilder newT = new StringBuilder(t);
                newT.insert(j, removedDigit);
                long check = Long.parseLong(newT.toString());
                if(check<min){
                    min = check;
                    indexI=i;
                    indexJ=j;
                }
            }
        }
        return new long [] {min,indexI,indexJ};
    }
}
