package org.academy.kata.implementation.RomanKmet;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;

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
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        double[] data = extractData(town, strng);
        return (data == null) ? -1.0 : Arrays.stream(data).average().orElse(-1.0);
    }

    private double[] extractData(String town, String strng) {
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .findFirst()
                .map(line -> line.substring(line.indexOf(":") + 1)
                        .split(","))
                .map(values -> Arrays.stream(values)
                        .mapToDouble(v -> Double.parseDouble(v.split(" ")[1]))
                        .toArray())
                .orElse(null);
    }

    @Override
    public double variance(String town, String strng) {
        double[] data = extractData(town, strng);
        if (data == null) return -1.0;
        double mean = mean(town, strng);
        return Arrays.stream(data).map(x -> Math.pow(x - mean, 2)).average().orElse(-1.0);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOfArt.length == 0 || lstOf1stLetter == null || lstOf1stLetter.length == 0) {
            return "";
        }
        Map<String, Integer> categoryCounts = new HashMap<>();
        for (String category : lstOf1stLetter) {
            categoryCounts.put(category, 0);
        }
        for (String item : lstOfArt) {
            String[] parts = item.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String category = code.substring(0, 1);
            if (categoryCounts.containsKey(category)) {
                categoryCounts.put(category, categoryCounts.get(category) + quantity);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            if (result.length() > 0) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(categoryCounts.get(category)).append(")");
        }

        return result.toString();
    }
}
