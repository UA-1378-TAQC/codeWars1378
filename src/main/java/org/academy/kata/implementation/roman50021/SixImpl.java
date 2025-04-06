package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.List;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        if (m < 1) {
            return -1;
        }

        long n = 0;
        long sum = 0;

        while (sum < m) {
            n++;
            sum = sum + n * n * n;
        }

        if (sum == m) {
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

    @Override
    public List<String> getTasks() {
        return List.of();
    }
}
