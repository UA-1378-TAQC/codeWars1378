package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    public boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long lastPrime = -1;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (lastPrime != -1 && i - lastPrime == g) {
                    return new long[]{lastPrime, i};  // Return the pair
                }
                lastPrime = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {

        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;

    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = a.add(b);

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger next = a.add(b);
            sum = sum.add(next);
            a = b;
            b = next;
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        String numStr = String.valueOf(n);
        long minNumber = n;
        int indexI = -1;
        int indexJ = -1;

        for (int i = 0; i < numStr.length(); i++) {
            char removedDigit = numStr.charAt(i);
            StringBuilder temp = new StringBuilder(numStr);
            temp.deleteCharAt(i);

            for (int j = 0; j <= temp.length(); j++) {
                StringBuilder newNumberBuilder = new StringBuilder(temp);
                newNumberBuilder.insert(j, removedDigit);

                long newNumber = Long.parseLong(newNumberBuilder.toString());

                if (newNumber < minNumber ||
                        (newNumber == minNumber && i < indexI) ||
                        (newNumber == minNumber && i == indexI && j < indexJ)) {

                    minNumber = newNumber;
                    indexI = i;  // початковий індекс цифри
                    indexJ = j;  // новий індекс для цифри
                }
            }
        }
        return new long[]{minNumber, indexI, indexJ};
    }
}
