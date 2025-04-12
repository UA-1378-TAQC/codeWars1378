package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long n = 1;
        while(m > 0)
        {
            m-=n*n*n;
            n++;
        }
        if(m < 0)
            return -1;
        else
            return n-1;
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
        int[] categoryCounts = new int[lstOf1stLetter.length];
        for (String book : lstOfArt) {
            char category = book.charAt(0);
            int quantity = Integer.parseInt(book.split(" ")[1]);

            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (lstOf1stLetter[i].charAt(0) == category) {
                    categoryCounts[i] += quantity;
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            if (!result.isEmpty()) {
                result.append(" - ");
            }
            result.append("(").append(lstOf1stLetter[i]).append(" : ").append(categoryCounts[i]).append(")");
        }

        return result.toString();
    }
}
