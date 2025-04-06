package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sqrtM = (long) Math.sqrt(m);
        if (sqrtM * sqrtM != m) {
            return -1;
        }
        long discriminant = 1 + 8 * sqrtM;
        long sqrtDiscriminant = (long) Math.sqrt(discriminant);
        if (sqrtDiscriminant * sqrtDiscriminant != discriminant) {
            return -1;
        }
        long n = (sqrtDiscriminant - 1) / 2;
        if (n * (n + 1) / 2 * (n * (n + 1) / 2) == m) {
            return n;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        return "";
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
