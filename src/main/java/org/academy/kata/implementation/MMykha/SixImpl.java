package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.Arrays;
import java.util.regex.*;

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
        int sum = 0;
        String result = "";
        if(lstOfArt.length==0) return "";
        Pattern digitPattern = Pattern.compile("\\s(\\d*)");
        for(int i = 0; i < lstOf1stLetter.length; i++){
            final int index = i;
            sum = Arrays.stream(lstOfArt).filter(el->el.substring(0,1).equals(lstOf1stLetter[index]))
                    .map(n -> {
                        Matcher digitMatcher = digitPattern.matcher(n);
                        digitMatcher.find();
                        return digitMatcher.group(1);
                    })
                    .mapToInt(Integer::parseInt).sum();
            if(i>0) result=result.concat(" - ");
            result=result.concat(String.format("(%s : %d)",lstOf1stLetter[i], sum));
        }
        return result;
    }
}
