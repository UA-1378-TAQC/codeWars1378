package org.academy.kata.implementation.roman50021;

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

        String[] rows = strng.split("\n");

        for(String row : rows){
            if(row.startsWith(town + ":")){
                String dataPart = row.substring(town.length() + 1);

                String [] monthlyData = dataPart.split(",");

                double sum = 0.0;
                int count = 0;

                for (String monthEntry : monthlyData) {
                    String[] parts = monthEntry.trim().split(" ");
                    if (parts.length == 2) {
                        try {
                            double value = Double.parseDouble(parts[1]);
                            sum += value;
                            count++;
                        } catch (NumberFormatException e) {
                            return -1;
                        }
                    }
                }

                return count == 0 ? -1 : sum / count;
            }

        }

        return -1;
    }
    @Override
    public double variance(String town, String strng) {

        String[] rows = strng.split("\n");

        for (String row : rows) {
            if (row.startsWith(town + ":")) {
                String dataPart = row.substring(town.length() + 1);
                String[] monthlyData = dataPart.split(",");

                double mean = mean(town, strng);
                if (mean == -1) {
                    return -1;
                }


                double sumSquaredDiffs = 0.0;
                int count = 0;

                for (String monthEntry : monthlyData) {
                    String[] parts = monthEntry.trim().split(" ");
                    if (parts.length == 2) {
                        try {
                            double value = Double.parseDouble(parts[1]);
                            sumSquaredDiffs += Math.pow(value - mean, 2);
                            count++;
                        } catch (NumberFormatException e) {
                            return -1;
                        }
                    }
                }

                return count == 0 ? -1 : sumSquaredDiffs / count;
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
        return "";
    }
}
