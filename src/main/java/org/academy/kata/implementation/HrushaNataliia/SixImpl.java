package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.ArrayList;
import java.util.List;

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
        List<Double> rainfalls = getRainfalls(town, strng);
        if (rainfalls.isEmpty()) {
            return -1.0;
        }
        double sum = 0.0;
        for (double d : rainfalls) {
            sum += d;
        }
        return sum / rainfalls.size();
    }

    public double variance(String town, String strng) {
        List<Double> rainfalls = getRainfalls(town, strng);
        if (rainfalls.isEmpty()) {
            return -1.0;
        }
        double mean = mean(town, strng);
        double sumSq = 0.0;
        for (double d : rainfalls) {
            sumSq += Math.pow(d - mean, 2);
        }
        return sumSq / rainfalls.size();
    }

    private static List<Double> getRainfalls(String town, String strng) {
        List<Double> result = new ArrayList<>();
        String[] lines = strng.split("\n");
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts[0].equals(town)) {
                String[] entries = parts[1].split(",");
                for (String entry : entries) {
                    String[] monthRain = entry.trim().split(" ");
                    result.add(Double.parseDouble(monthRain[1]));
                }
                break;
            }
        }
        return result;
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
