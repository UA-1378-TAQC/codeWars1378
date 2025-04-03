package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.regex.*;
import java.util.Arrays;

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
        double [] values = this.getValues(town,strng);
        if(values==null) return -1;
        double sum = Arrays.stream(values).sum();
        return sum/12;
    }

    @Override
    public double variance(String town, String strng) {
        double [] values = this.getValues(town,strng);
        if(values==null) return -1;
        double mean = this.mean(town,strng);
        double sum = Arrays.stream(values).map(el->Math.pow((el-mean),2)).sum();
        return sum/12;
    }

    private double [] getValues(String town, String str){
        if(!Pattern.compile(town+":").matcher(str).find()) return null;
        double [] arr = new double[12];
        String regex = String.format("%s\\W((\\w*\\s\\d*\\.\\d*\\W?||\\s)*)",town);
        Pattern patternByTown = Pattern.compile(regex);
        Matcher matchByTown = patternByTown.matcher(str);
        while(matchByTown.find()) str = matchByTown.group(1);
        Pattern valuesPattern = Pattern.compile("\\d*\\.\\d");
        Matcher matchValues = valuesPattern.matcher(str);
        int i = 0;
        while(matchValues.find()){
            arr[i]=Double.parseDouble(matchValues.group());
            i++;
        }
        return arr;
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
