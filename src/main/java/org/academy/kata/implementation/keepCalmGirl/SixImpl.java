package org.academy.kata.implementation.keepCalmGirl;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\\n");
        double balance = Double.parseDouble(lines[0].replaceAll("[^0-9.]", ""));
        double originalBalance = balance;
        double totalExpense = 0;
        int itemCount = 0;
        StringBuilder result = new StringBuilder();
        result.append(String.format("Original Balance: %.2f\\r\\n", originalBalance));

        for (int i = 1; i < lines.length; i++) {
            String[] order = lines[i].split("[^0-9a-zA-Z.]+");
            if (order.length < 3) continue;

            String orderId = order[0];
            String item = order[1];
            double itemPrice = Double.parseDouble(order[2]);

            balance -= itemPrice;
            totalExpense += itemPrice;
            itemCount += 1;

            result.append(String.format("%s %s %.2f Balance %.2f\\r\\n", orderId, item, itemPrice, balance));
        }

        double avgExpense = totalExpense / itemCount;
        result.append(String.format("Total expense  %.2f\\r\\n", totalExpense));
        result.append(String.format("Average expense  %.2f", avgExpense));
        return result.toString();
    }

    @Override
    public double f(double x) {
        if (Math.abs(x) < 1) {
            return (x / 2) - (Math.pow(x, 2) / 8) + (Math.pow(x, 3) / 16) - (Math.pow(x, 4) / 128) + (Math.pow(x, 5) / 1024) - (Math.pow(x, 6) / 8192) + (Math.pow(x, 7) / 65536);
        } else {
            return Math.sqrt(1 + x) - 1;
        }
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
