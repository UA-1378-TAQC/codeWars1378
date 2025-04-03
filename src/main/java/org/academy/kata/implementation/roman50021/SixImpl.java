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
        String cleaned = book.replaceAll("[^a-zA-Z0-9\\.\\s]", "");

        String[] lines = cleaned.split("\\n");

        double original_balance = Double.parseDouble(lines[0]);

        StringBuilder report = new StringBuilder();
        report.append(String.format("Original Balance: %.2f\n", original_balance));

        double current_balance = original_balance;
        double total_expense = 0.0;
        int transactionCount = 0;

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");

            String checkNumber = parts[0];
            String category = parts[1];
            double amount = Double.parseDouble(parts[2]);

            current_balance -= amount;
            total_expense += amount;
            transactionCount++;

            report.append(String.format("%s %s %s Balance %.2f\n",
                    checkNumber, category, parts[2], current_balance));
        }

        double average_expense = total_expense / transactionCount;

        report.append(String.format("Total expense  %.2f\n", total_expense));
        report.append(String.format("Average expense  %.2f", average_expense));

        return report.toString().replace("\n", "\\r\\n");
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
