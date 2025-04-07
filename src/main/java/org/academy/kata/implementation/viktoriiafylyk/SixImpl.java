package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISix;

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
