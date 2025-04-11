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
        if(resultSheet == null || toFind == null){
            return "";
        }
        if(resultSheet.isEmpty() || toFind.isEmpty()){
            return "";
        }
        String name = toFind;
        String[] results = resultSheet.trim().split(",");
        int numberOfWins = 0;
        int numberOfLoses = 0;
        int allMatches = 0;
        int numberOfScored = 0;
        int numberOfConceded = 0;
        for(int i = 0; i < results.length; i++){
            int teamCount;
            int oppositeCount;
            if(checkTeamIsInRow(results[i], name)){
                if(results[i].startsWith(name)){
                    String[] rowValues = results[i].trim().split(" ");
                    if(rowValues[name.split(" ").length].contains(".") || rowValues[rowValues.length - 1].contains(".")){
                        return "Error(float number):" + results[i];
                    }
                    teamCount = Integer.parseInt(rowValues[name.split(" ").length]);
                    oppositeCount = Integer.parseInt(rowValues[rowValues.length - 1]);
                }
                else{
                    String[] rowValues = results[i].trim().split(" " + name + " ");
                    if(rowValues[rowValues.length - 1].contains(".") || rowValues[0].trim().split(" ")[rowValues[0].trim().split(" ").length - 1].contains(".")){
                        return "Error(float number):" + results[i];
                    }
                    teamCount = Integer.parseInt(rowValues[rowValues.length - 1]);
                    oppositeCount = Integer.parseInt(rowValues[0].trim().split(" ")[rowValues[0].trim().split(" ").length - 1]);
                }

                if(oppositeCount > teamCount){
                    numberOfLoses++;
                }
                else if(oppositeCount < teamCount){
                    numberOfWins++;
                }
                allMatches++;

                numberOfScored += teamCount;
                numberOfConceded += oppositeCount;
            }
        }
        if(allMatches == 0){
            return name + ":This team didn't play!";
        }
        int points = 3 * numberOfWins + (allMatches - numberOfWins - numberOfLoses);
        StringBuilder builder = new StringBuilder(name);
        builder.append(":W=").append(numberOfWins).append(";D=").append(allMatches - numberOfLoses - numberOfWins)
                .append(";L=").append(numberOfLoses).append(";Scored=").append(numberOfScored)
                .append(";Conceded=").append(numberOfConceded).append(";Points=").append(points);
        return builder.toString();
    }

    private static boolean checkTeamIsInRow(String row, String team){
        System.out.println(row);
        String[] teams = row.trim().split(" \\d+( |$|.\\d+)");

        boolean result = false;
        for (String s : teams) {
            System.out.println(s.trim());
            if (s.trim().equals(team)) {

                return true;
            }
        }
        return false;
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
