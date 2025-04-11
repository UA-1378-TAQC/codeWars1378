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
        return x / (Math.sqrt(1 + x) + 1);
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
        if (toFind.isEmpty()) return "";
        if (!Pattern.compile(toFind+"\\s").matcher(resultSheet).find()) return String.format("%s:This team didn't play!", toFind);

        Pattern nbaTeamPattern = Pattern.compile(String.format("((\\w*\\s)*((\\d*)(\\.\\d*)?)\\s)?%s\\s((\\d*)(\\.\\d*)?)(\\s(\\w*\\s)*((\\d*)(\\.\\d*)?))?",toFind));
        Matcher nbaTeamMather = nbaTeamPattern.matcher(resultSheet);

        int wins = 0;
        int draws = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;

        while(nbaTeamMather.find()){
            if(nbaTeamMather.group(3)!=null && !this.isIntegerNumber(nbaTeamMather.group(3))){
                return String.format("Error(float number):%s",nbaTeamMather.group());
            }
            if(nbaTeamMather.group(6)!=null && !this.isIntegerNumber(nbaTeamMather.group(6))){
                return String.format("Error(float number):%s",nbaTeamMather.group());
            }
            if(nbaTeamMather.group(11)!=null && !this.isIntegerNumber(nbaTeamMather.group(11))){
                return String.format("Error(float number):%s",nbaTeamMather.group());
            }

            int value = Integer.parseInt(nbaTeamMather.group(6));
            int valueOfRival = Integer.parseInt((nbaTeamMather.group(3)==null)?nbaTeamMather.group(11):nbaTeamMather.group(3));
            int diff = value-valueOfRival;

            if(diff<0) lost++;
            else if(diff>0) wins++;
            else draws++;

            scored+=value;
            conceded+=valueOfRival;
        }
        int totalPoint = wins*3+draws;
        return String.format("%s:W=%d;"
                +"D=%d;"
                +"L=%d;"
                +"Scored=%d;"
                +"Conceded=%d;"
                +"Points=%d",toFind,wins,draws,lost,scored,conceded,totalPoint);
    }

    private boolean isIntegerNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
