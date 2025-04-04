package org.academy.kata.implementation.Anat0li1;

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
        if(lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }
        String[] results = new String[lstOf1stLetter.length];
        for(int i = 0; i < lstOf1stLetter.length; i++){
            int totalNumber = 0;
            for(int j = 0; j < lstOfArt.length; j++){
                if(lstOfArt[j].startsWith(lstOf1stLetter[i])){
                    totalNumber += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                }
            }
            results[i] = "(" + lstOf1stLetter[i] + " : " + totalNumber + ")";
        }
        return String.join(" - ", results);
    }
}
