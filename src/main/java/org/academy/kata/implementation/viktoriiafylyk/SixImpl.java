package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.Arrays;


public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] arr = book
                .replaceAll("[^a-zA-Z0-9\n. ]", "").split("\n+");

        StringBuilder sb = new StringBuilder();
        double balance = Double.parseDouble(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            balance -= Double.parseDouble(arr[i].split("\\s+")[2]);
            sb.append(String.format("%s Balance %.2f\\r\\n", arr[i].trim().replaceAll("\\s+", " "), balance));
        }

        return String.format("Original Balance: %s\\r\\n", arr[0])
                + sb.toString()
                + String.format("Total expense  %.2f\\r\\n"
                , Arrays.stream(arr, 1, arr.length)
                        .mapToDouble(a -> Double.parseDouble(a.split("\\s+")[2]))
                        .sum())
                + String.format("Average expense  %.2f"
                , Arrays.stream(arr, 1, arr.length)
                        .mapToDouble(a -> Double.parseDouble(a.split("\\s+")[2]))
                        .average()
                        .getAsDouble());
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
}
