package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sum = 0;
        long n = 0;
        while (sum < m) {
            n++;
            sum += n * n * n;
        }

        return sum == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        return "";
    }

    @Override
    public double f(double x) {
        if (x == 0) {
            return 0;
        }
        double sqrtTerm = Math.sqrt(1 + x);
        return x / (sqrtTerm + 1);
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
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        java.util.Map<String, Integer> categorySums = new java.util.HashMap<>();
        for (String item : lstOfArt) {
            String[] parts = item.split(" ");
            String category = String.valueOf(parts[0].charAt(0));
            int quantity = Integer.parseInt(parts[1]);

            categorySums.put(category, categorySums.getOrDefault(category, 0)+quantity);
        }

        StringBuilder result = new StringBuilder();
        for (int i=0; i<lstOf1stLetter.length; i++) {
            String category = lstOf1stLetter[i];
            int sum = categorySums.getOrDefault(category, 0);

            result.append("(").append(category).append(" : ").append(sum).append(")");
            if (i < lstOf1stLetter.length-1) {
                result.append(" - ");
            }
        }
        return result.toString();
    }
}
