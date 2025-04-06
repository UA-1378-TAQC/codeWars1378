package org.academy.kata.implementation.viktoriiafylyk;

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
        return new long[0];
    }
}
