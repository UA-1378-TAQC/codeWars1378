package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
import java.util.Objects;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {

        if (book == null || book.trim().isEmpty()) {
            return "";
        }

        String cleanedBook = book.replaceAll("[^A-Za-z0-9\\s.]", "");
        String[] rows = cleanedBook.split("\\r?\\n");

        double balance = Double.parseDouble(rows[0].trim());
        double originalBalance = balance;
        double totalExpense = 0;
        int expenseCount = 0;

        StringBuilder report = new StringBuilder();
        report.append(String.format("Original Balance: %.2f\r\n", originalBalance));

        for (int i = 1; i < rows.length; i++) {
            String row = rows[i].trim();
            if (row.isEmpty()) continue;

            String[] cols = Arrays.stream(row.split("\\s+"))
                    .filter(s -> !s.isEmpty())
                    .toArray(String[]::new);

            if (cols.length < 3) continue;

            double amount = Double.parseDouble(cols[2]);
            totalExpense += amount;
            expenseCount++;
            balance -= amount;

            report.append(String.format("%s %s %.2f Balance %.2f\r\n",
                    cols[0], cols[1], amount, balance));
        }

        report.append(String.format("Total expense  %.2f\r\n", totalExpense));
        report.append(String.format("Average expense  %.2f\r\n",
                expenseCount > 0 ? totalExpense / expenseCount : 0));

        return report.toString().trim();
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
