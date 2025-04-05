package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.*;


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
        String[] cities = strng.split("\n");

        for (String cityData : cities) {
            String[] parts = cityData.split(":");
            String cityName = parts[0];

            if (cityName.equals(town)) {
                String[] months = parts[1].split(",");
                double totalRainfall = 0.0;
                int numberOfMonths = 0;

                for (String monthData : months) {
                    String[] monthParts = monthData.trim().split(" ");
                    double rainfall = Double.parseDouble(monthParts[1]);

                    totalRainfall += rainfall;
                    numberOfMonths++;
                }

                return totalRainfall / numberOfMonths;
            }
        }

        return -1.0;
    }

    @Override
    public double variance(String town, String strng) {
        String[] cities = strng.split("\n");

        for (String cityData : cities) {
            String[] parts = cityData.split(":");
            String cityName = parts[0];

            if (cityName.equals(town)) {
                String[] months = parts[1].split(",");
                double totalRainfall = 0.0;
                int numberOfMonths = 0;

                double[] rainfallData = new double[months.length];

                for (int i = 0; i < months.length; i++) {
                    String[] monthParts = months[i].trim().split(" ");
                    double rainfall = Double.parseDouble(monthParts[1]);

                    totalRainfall += rainfall;
                    rainfallData[i] = rainfall;
                    numberOfMonths++;
                }

                double meanRainfall = totalRainfall / numberOfMonths;
                double sumOfSquaredDifferences = 0.0;

                for (double rainfall : rainfallData) {
                    sumOfSquaredDifferences += Math.pow(rainfall - meanRainfall, 2);
                }

                return sumOfSquaredDifferences / numberOfMonths;
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<String, Integer> categoryCounts = new HashMap<>();
        for (String category : lstOf1stLetter) {
            categoryCounts.put(category, 0);
        }

        // Обхід списку книг та підрахунок кількостей по категоріях
        for (String art : lstOfArt) {
            String[] parts = art.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String category = code.substring(0, 1);

            if (categoryCounts.containsKey(category)) {
                categoryCounts.put(category, categoryCounts.get(category) + quantity);
            }
        }

        // Формування підсумкового рядка
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
