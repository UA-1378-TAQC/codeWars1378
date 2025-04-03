package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.regex.*;
import java.util.ArrayList;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        Pattern pattern = Pattern.compile("(\\d*\\.\\d\\d)\\W*(\\d*)\\W(\\w*)\\W*");
        Matcher matcher = pattern.matcher(book);

        ArrayList<String> checkNumber = new ArrayList<String>();
        ArrayList<String> category = new ArrayList<String>();
        ArrayList<String> amount = new ArrayList<String>();

        int endIndex = book.length();
        boolean isAnyLeft = true;

        while (matcher.find()) {
            amount.add(matcher.group(1));
            checkNumber.add(matcher.group(2));
            category.add(matcher.group(3));
            endIndex = matcher.end();
            if(matcher.group(2).isBlank()){
                isAnyLeft=false;
            }
        }
        if(isAnyLeft) amount.add(book.substring(endIndex));

        double balance = Double.parseDouble(amount.get(0));
        StringBuilder result = new StringBuilder(String.format("Original Balance: %.2f\\r\\n",balance));

        for (int i = 1; i < amount.size(); i++) {
            balance -= Double.parseDouble(amount.get(i));
            result.append(checkNumber.get(i - 1))
                    .append(" ").append(category.get(i - 1)).append(" ")
                    .append(amount.get(i))
                    .append(String.format(" Balance %.2f\\r\\n", balance));
        }
        double totalExpense = Double.parseDouble(amount.get(0)) - balance;
        double avr = totalExpense / (amount.size() - 1);

        result.append(String.format("Total expense  %.2f\\r\\n", totalExpense))
                .append(String.format("Average expense  %.2f", avr));
        return result.toString();
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
