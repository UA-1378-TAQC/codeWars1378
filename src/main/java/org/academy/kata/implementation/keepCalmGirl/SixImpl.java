package org.academy.kata.implementation.keepCalmGirl;

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
        if (Math.abs(x) < 1) {
            return (x / 2) - (Math.pow(x, 2) / 8) + (Math.pow(x, 3) / 16) - (Math.pow(x, 4) / 128) + (Math.pow(x, 5) / 1024) - (Math.pow(x, 6) / 8192) + (Math.pow(x, 7) / 65536);
        } else {
            return Math.sqrt(1 + x) - 1;
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
