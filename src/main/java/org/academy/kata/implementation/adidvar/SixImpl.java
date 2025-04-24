package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import static org.academy.kata.implementation.KhrystynaTs.SixImpl.length_Check;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long n = 1;
        while (m > 0) {
            m -= n * n * n;
            n++;
        }
        if (m < 0)
            return -1;
        else
            return n - 1;
    }

    @Override
    public String balance(String book) {
        String cleaned = book.replaceAll("[^a-zA-Z0-9.\\s\n]", "");
        String[] array = cleaned.split("\\n+");
        array[0] = "Original Balance: " + array[0];

        double total = 0;
        double average;
        double balance = Double.parseDouble(array[0].split(":")[1].trim());

        for (int i = 1; i < array.length; i++) {
            String[] temp = array[i].split("\\s+");
            double expense = Double.parseDouble(temp[2]);
            balance -= expense;
            total += expense;
            array[i] = temp[0] + " " + temp[1] + " " + temp[2] + " Balance " + String.format("%.2f", balance);
        }
        average = total / (array.length - 1);
        StringBuilder res = new StringBuilder();
        for (String line : array) {
            res.append(line).append("\\r\\n");
        }
        res.append("Total expense  ").append(String.format("%.2f", total)).append("\\r\\n");
        res.append("Average expense  ").append(String.format("%.2f", average));
        return res.toString();
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        String[] cities = strng.split("\n");
        for (String city : cities) {
            if (city.startsWith(town + ":")) {
                String[] records = city.substring(town.length() + 1).split(",");
                double sum = 0.0;
                for (String record : records) {
                    sum += Double.parseDouble(record.split(" ")[1]);
                }
                return sum / records.length;
            }
        }

        return -1;
    }

    @Override
    public double variance(String town, String strng) {
        double avg = mean(town, strng);

        String[] cities = strng.split("\n");
        for (String city : cities) {
            if (city.startsWith(town + ":")) {
                String[] records = city.substring(town.length() + 1).split(",");
                double rainfallSum = 0.0;
                for (String record : records) {
                    double monthRainfall = Double.parseDouble(record.split(" ")[1]);
                    rainfallSum += (monthRainfall - avg) * (monthRainfall - avg);
                }
                return rainfallSum / records.length;
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
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        int[] categoryCounts = new int[lstOf1stLetter.length];
        for (String book : lstOfArt) {
            char category = book.charAt(0);
            int quantity = Integer.parseInt(book.split(" ")[1]);

            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (lstOf1stLetter[i].charAt(0) == category) {
                    categoryCounts[i] += quantity;
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            if (!result.isEmpty()) {
                result.append(" - ");
            }
            result.append("(").append(lstOf1stLetter[i]).append(" : ").append(categoryCounts[i]).append(")");
        }

        return result.toString();
    }

}
