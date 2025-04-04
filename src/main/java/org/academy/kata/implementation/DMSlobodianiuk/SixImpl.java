package org.academy.kata.implementation.DMSlobodianiuk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.academy.kata.Base;
import org.academy.kata.ISix;

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
            return " ";
        }
        // int list[] = new int[lstOf1stLetter.length];
        HashMap<String,Integer> list = new HashMap<>();

        Set<String> lettersSet = new HashSet<>(Arrays.asList(lstOf1stLetter));

        for(int i = 0;i<lstOfArt.length;i++)
        {
            if (lettersSet.contains(lstOfArt[i].substring(0, 1))) {
                String t[] = lstOfArt[i].split(" ");
                String art = t[0].substring(0,1);
                int books = Integer.parseInt(t[1]);
                list.merge(art, books,Integer::sum);
            }
        }
        for(int i = 0;i<lstOf1stLetter.length;i++)
        {
            list.merge(lstOf1stLetter[i],0,Integer::sum);
        }

        // System.out.println(list);

        String res = "";
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            res += "(" + entry.getKey() + " : " + entry.getValue() + ") - ";
        }

        res = res.substring(0,res.length()-3);
        res.trim();
        // System.out.println(res);
        if(res.length() == 0){
            return " ";
        }
        return res;
    }
}
