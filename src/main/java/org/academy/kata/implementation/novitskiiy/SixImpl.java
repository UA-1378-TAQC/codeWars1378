package org.academy.kata.implementation.novitskiiy;

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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<Character, Integer> stockMap = new HashMap<>();

        for (String category : lstOf1stLetter) {
            stockMap.put(category.charAt(0), 0);
        }

        for (String book : lstOfArt) {
            char category = book.charAt(0);
            int quantity = Integer.parseInt(book.split(" ")[1]);

            if (stockMap.containsKey(category)) {
                stockMap.put(category, stockMap.get(category) + quantity);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            if (result.length() > 0) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(stockMap.get(category.charAt(0))).append(")");
        }

        return result.toString();
    }
}
