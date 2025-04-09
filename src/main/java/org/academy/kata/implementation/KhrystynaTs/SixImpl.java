package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> categoryTotals = new HashMap<>();
        for (String category : lstOf1stLetter) {
            categoryTotals.put(category, 0);
        }
        for (String entry : lstOfArt) {
            String[] parts = entry.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);

            String category = String.valueOf(code.charAt(0));
            if (categoryTotals.containsKey(category)) {
                categoryTotals.put(category, categoryTotals.get(category) + quantity);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            result.append("(").append(category).append(" : ").append(categoryTotals.get(category)).append(") - ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 3);
        }

        return result.toString();
    }

}
