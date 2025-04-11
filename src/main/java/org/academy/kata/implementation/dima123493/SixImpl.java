package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISix;

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

        return (sum == m) ? n : -1;
    }

    @Override
    public String balance(String book) {
        var lines = book.replaceAll("[^\\w\n. ]", "").split("\n");
        var report = new StringBuilder("Original Balance: " + lines[0] + (book = "\\r\\n"));
        double balance = Double.parseDouble(lines[0]), sum = 0;
        for (int i = 1; i < lines.length; i++) {
            sum += Double.parseDouble(lines[i].split("\\s+")[2]);
            report.append(lines[i].trim().replaceAll("\\s+", " ")).append(String.format(" Balance %.2f", balance - sum)).append(book);
        }
        return report + String.format("Total expense  %.2f%sAverage expense  %.2f", sum, book, sum / (lines.length - 1));
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
}
