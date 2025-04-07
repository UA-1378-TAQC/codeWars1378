package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\n");
        StringBuilder report = new StringBuilder();
        String originalBalance = lines[0].replaceAll("[^a-zA-Z0-9. ]", "");
        report.append("Original balance: ").append(originalBalance).append("\n");
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].replaceAll("[^a-zA-Z0-9. ]", "");  // Clean the line
            if (!line.trim().isEmpty()) {  // Ignore empty lines
                String[] parts = line.split(" ");
                if (parts.length >= 3) {
                    String checkNumber = parts[0];
                    String category = parts[1];
                    String checkAmount = parts[2];
                    report.append("Check ").append(checkNumber)
                            .append(" - Category: ").append(category)
                            .append(" - Amount: ").append(checkAmount).append("\n");
                }
            }
        }
        return report.toString();
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
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
