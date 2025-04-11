package org.academy.kata.implementation.DMSlobodianiuk;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        if(m > Math.pow(2,63)-1)
        {
            return -1;
        }

        long k = 0;
        long n = 0;

        while(k < m){
            k += n * n * n;

            if(k == m){
                return n;
            }
            n += 1;
        }

        return -1;
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
