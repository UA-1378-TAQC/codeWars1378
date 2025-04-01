package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        Map<Character, Integer> stockCount = new HashMap<>();
        for (String book : lstOfArt) {
            char category = book.charAt(0);
            int quantity = Integer.parseInt(book.split(" ")[1]);
            stockCount.put(category, stockCount.getOrDefault(category, 0) + quantity);
        }

        return Arrays.stream(lstOf1stLetter)
                .map(cat -> "(" + cat + " : " + stockCount.getOrDefault(cat.charAt(0), 0) + ")")
                .collect(Collectors.joining(" - "));
    }
}
