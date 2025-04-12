package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String cleaned = book.replaceAll("[^a-zA-Z0-9.\\s\n]", "");
        String[] array = cleaned.split("\\n+");
        array[0] = "Original Balance: " + array[0];

        double total = 0;
        double average;
        double balance = Double.parseDouble(array[0].split(":")[1].trim());

        for(int i = 1; i < array.length; i++) {
            String[] temp = array[i].split("\\s+");
            double expense = Double.parseDouble(temp[2]);
            balance -= expense;
            total += expense;
            array[i] = temp[0] + " " + temp[1] + " " + temp[2] + " Balance " + String.format("%.2f", balance);
        }

        average = total / (array.length - 1);
        StringBuilder res = new StringBuilder();
        for(String line : array) {
            res.append(line).append("\\r\\n");
        }
        res.append("Total expense  ").append(String.format("%.2f", total)).append("\\r\\n");
        res.append("Average expense  ").append(String.format("%.2f", average));

        return res.toString();
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
