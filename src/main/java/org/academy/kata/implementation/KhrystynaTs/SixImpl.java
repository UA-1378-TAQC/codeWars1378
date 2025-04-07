package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return "";
    }

    @Override
    public double f(double x) {
        double A = x;
        double B = -(2 * x + 1);
        double C = x;

        double discriminant = B * B - 4 * A * C;

        double sqrtDiscriminant = Math.sqrt(discriminant);

        double x1 = (-B + sqrtDiscriminant) / (2 * A);
        double x2 = (-B - sqrtDiscriminant) / (2 * A);

        if (x1 > 0 && x1 < 1) {
            return x1;
        } else {
            return x2;
        }
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
