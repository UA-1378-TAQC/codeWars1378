package org.academy.kata.implementation.Anat0li1;

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
        if(book == null || book.isEmpty()){
            return book;
        }
        book = book.replaceAll("[^A-Za-z0-9\\s.]", "");
        System.out.println(book);
        double costSum = 0;
        int avgCounter = 0;
        String lineDivider = "\\r\\n";
        String inLine = " ";
        String[] rows = book.split("\n");
        double balance = Double.parseDouble(rows[0]);
        StringBuilder builder = new StringBuilder(String.format("Original Balance: %.2f", balance));
        builder.append(lineDivider);
        for(int i = 1; i < rows.length; i++){
            if(!Objects.equals(rows[i], "")){
                String[] cols = rows[i].split(" ");
                cols = Arrays.stream(cols)
                        .filter(s -> !s.trim().isEmpty())
                        .toArray(String[]::new);
                double curCost = Double.parseDouble(cols[2]);
                costSum += curCost;
                avgCounter++;
                balance -= curCost;
                builder.append(cols[0]).append(inLine).append(cols[1])
                        .append(inLine).append(cols[2]).append(inLine).append("Balance")
                        .append(inLine).append(String.format("%.2f", (double)Math.round(balance * 100) / 100)).append(lineDivider);
            }
        }
        builder.append("Total").append(inLine).append("expense").append(inLine)
                .append(inLine).append(String.format("%.2f", (double)Math.round(costSum * 100) / 100)).append(lineDivider);
        builder.append("Average").append(inLine).append("expense").append(inLine)
                .append(inLine).append(String.format("%.2f", (double)Math.round(costSum / avgCounter * 100)/100));

        return builder.toString();
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
