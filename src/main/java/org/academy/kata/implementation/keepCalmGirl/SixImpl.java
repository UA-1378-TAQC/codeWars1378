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
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        String[] lines = strng.split("\\n");

        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                String[] values = line.split(":")[1].split(",");
                double sum = 0;
                double count = 0;

                for (String value : values) {
                    sum += Double.parseDouble(value.trim().split(" ")[1]);
                    count++;
                }
                return count > 0 ? sum / count : -1.0;
            }
        }
        return -1.0;
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        if (mean == -1.0) return -1.0;

        String[] lines = strng.split("\\n");

        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                String[] values = line.split(":")[1].split(",");
                double sumSquaredDiff = 0;
                double count = 0;

                for (String value : values) {
                    double num = Double.parseDouble(value.trim().split(" ")[1]);
                    sumSquaredDiff += Math.pow(num - mean, 2);
                    count++;
                }
                return count > 0 ? sumSquaredDiff / count : -1.0;
            }
        }
        return -1.0;
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
