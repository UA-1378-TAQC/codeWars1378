package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
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
        double[] values = getRainfallValues(town, strng);
        if (values == null) return -1.0;
        return Arrays.stream(values).average().orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        double[] values = getRainfallValues(town, strng);
        if (values == null) return -1.0;

        double mean = mean(town, strng);
        return Arrays.stream(values)
                .map(x -> Math.pow(x - mean, 2))
                .average()
                .orElse(-1.0);
    }

    private static double[] getRainfallValues(String town, String strng) {
        String[] records = strng.split("\n");

        for (String record : records) {
            if (record.startsWith(town + ":")) {
                String dataPart = record.substring(town.length() + 1);

                return Arrays.stream(dataPart.split(","))
                        .map(s -> s.split(" ")[1])
                        .mapToDouble(Double::parseDouble)
                        .toArray();
            }
        }
        return null;
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
        return List.of(
                "findNb (Find the smallest number n such that the sum of cubes of the first n numbers equals m)",
                "balance (Balance a book of transactions)",
                "f (Perform a mathematical operation on x)",
                "mean (Calculate the average rainfall for a given town)",
                "variance (Calculate the variance in rainfall for a given town)",
                "nbaCup (Analyze the NBA results and return a particular team's result)",
                "stockSummary (Generate a stock summary based on article quantities)"

        );
    }
}
