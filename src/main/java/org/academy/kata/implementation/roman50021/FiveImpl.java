package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        Long previousPrime = null;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (previousPrime != null && i - previousPrime == g) {
                    return new long[]{previousPrime, i};
                }
                previousPrime = i;
            }
        }

        return null;
    }

    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }

        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solve(double m) {
        double left = 0.0;
        double right = 1.0;
        double mid = 0.0;

        while (right - left > 1e-13){
            mid = (left + right) / 2;
            double current = mid / Math.pow(1 - mid, 2);

            if(current < m){
                left = mid;
            }else {
                right = mid;
            }
        }

        return mid;
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
