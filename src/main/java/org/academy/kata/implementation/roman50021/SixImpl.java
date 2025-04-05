package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        Map<String, Integer> categorySums = new LinkedHashMap<>();
        for(String letter : lstOf1stLetter){
            categorySums.put(letter, 0);
        }

        for(String item : lstOfArt){
            String[] parts = item.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String category = code.substring(0, 1);

            if(categorySums.containsKey(category)){
                categorySums.put(category, categorySums.get(category) + quantity);
            }
        }

        List<String> resultParts = new ArrayList<>();
        for (String letter : lstOf1stLetter){
            int sum = categorySums.get(letter);
            resultParts.add("(" + letter + " : " + sum + ")");
        }

        return String.join(" - ", resultParts);
    }
}
