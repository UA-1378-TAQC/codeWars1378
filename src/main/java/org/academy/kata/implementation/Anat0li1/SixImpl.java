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
        return x / (Math.sqrt(x + 1) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        if(town == null || strng == null){
            return -1;
        }
        double sum = 0;
        String[] rows = strng.split("\n");
        for(int i = 0; i < rows.length; i++){
            String[] rowData = rows[i].split(":");
            String townData = rowData[0];
            if(townData.equals(town)){
                String[] monthData = rowData[1].split(",");
                for(int j = 0; j < monthData.length; j++){
                    sum += Double.parseDouble(monthData[j].trim().split(" ")[1]);
                }
                return sum / monthData.length;
            }
        }
        return -1;
    }

    @Override
    public double variance(String town, String strng) {
        if(town == null || strng == null){
            return 0.0;
        }
        double mean = mean(town, strng);
        double sum = 0;
        String[] rows = strng.split("\n");
        for(int i = 0; i < rows.length; i++){
            String[] rowData = rows[i].split(":");
            String townData = rowData[0];
            if(townData.equals(town)){
                String[] monthData = rowData[1].split(",");
                for(int j = 0; j < monthData.length; j++){
                    sum += Math.pow(mean - Double.parseDouble(monthData[j].trim().split(" ")[1]), 2);
                }
                return sum / monthData.length;
            }
        }
        return -1;
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
