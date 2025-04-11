package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> primes = new ArrayList<>();

        // Перебираємо всі числа від m до n
        for (long i = m; i <= n; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }

        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == g) {
                return new long[]{primes.get(i), primes.get(i + 1)};
            }
        }

        return null;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int powerOfFive = 5; n / powerOfFive >= 1; powerOfFive *= 5) {
            count += n / powerOfFive;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solve(double m) {
        double A = m;
        double B = -(2 * m + 1);
        double C = m;

        // Обчислюємо дискримінант
        double discriminant = B * B - 4 * A * C;

        // Перевіряємо, чи є дійсні корені
        if (discriminant < 0) {
            throw new IllegalArgumentException("Немає дійсних коренів для заданого m.");
        }

        // Обчислюємо корені
        double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
        double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);

        // Повертаємо корінь в діапазоні (0, 1)
        if (root1 > 0 && root1 < 1) {
            return root1;
        } else if (root2 > 0 && root2 < 1) {
            return root2;
        } else {
            throw new IllegalArgumentException("Немає коренів в діапазоні (0, 1) для заданого m.");
        }
    }

    @Override
    public long[] smallest(long n) {
        String numStr = Long.toString(n);
        long minNumber = n;
        int minI = -1, minJ = -1;

        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 0; j < numStr.length(); j++) {
                if (i != j) {
                    StringBuilder sb = new StringBuilder(numStr);
                    char digit = sb.charAt(i);
                    sb.deleteCharAt(i);
                    sb.insert(j, digit);

                    long newNumber = Long.parseLong(sb.toString());

                    if (newNumber < minNumber) {
                        minNumber = newNumber;
                        minI = i;
                        minJ = j;
                    }
                }
            }
        }

        return new long[] { minNumber, minI, minJ };
    }
}
