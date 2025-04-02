package org.academy.kata.implementation.novitskiiy;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        double[] values = getRainfallValues(town, strng);
        if (values == null) return -1.0;

        return Arrays.stream(values).average().orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        double[] values = getRainfallValues(town, strng);
        if (values == null) return -1.0;

        double mean = mean(town, strng);
        return Arrays.stream(values).map(v -> Math.pow(v - mean, 2)).average().orElse(-1.0);
    }

    private double[] getRainfallValues(String town, String strng) {
        Map<String, String> dataMap = new HashMap<>();

        for (String line : strng.split("\n")) {
            String[] parts = line.split(":");
            if (parts.length < 2) continue;
            dataMap.put(parts[0], parts[1]);
        }

        if (!dataMap.containsKey(town)) return null;

        return Arrays.stream(dataMap.get(town).split(","))
                .map(s -> s.split(" ")[1])
                .mapToDouble(Double::parseDouble)
                .toArray();
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
