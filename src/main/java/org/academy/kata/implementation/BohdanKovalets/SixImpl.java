package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sum = 0;
        long n = 0;
        while (sum < m) {
            n++;
            sum += n * n * n;
        }

        return sum == m ? n : -1;
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
        String[] towns=strng.split("\n");

        for (String t : towns) {
            if (t.startsWith(town + ":")) {
                String[] monthData = t.substring(town.length()+1).split(",");
                double sum=0.0;

                for (int i=0; i<12; i++) {
                    sum += Double.parseDouble(monthData[i].split(" ")[1]);
                }
                return sum/12;
            }
        }
        return -1;
    }

    @Override
    public double variance(String town, String strng) {
        String[] towns=strng.split("\n");

        for (String t : towns) {
            if (t.startsWith(town + ":")) {
                String[] monthData = t.substring(town.length()+1).split(",");
                double[] values =new double[12];
                for (int i=0; i<12; i++) {
                    values[i] = Double.parseDouble(monthData[i].split(" ")[1]);
                }

                double mean=0.0;
                for (double value : values) {
                    mean += value;
                }
                mean /= 12;

                double variance = 0.0;
                for (double value : values) {
                    variance += Math.pow(value-mean, 2);
                }
                return variance/12;
            }
        }
        return -1;
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
