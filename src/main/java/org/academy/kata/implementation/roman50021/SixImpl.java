package org.academy.kata.implementation.roman50021;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        if (m < 1) {
            return -1;
        }

        long n = 0;
        long sum = 0;

        while (sum < m) {
            n++;
            sum = sum + n * n * n;
        }

        if (sum == m) {
            return n;
        } else {
            return -1;
        }
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

        String[] rows = strng.split("\n");

        for(String row : rows){
            if(row.startsWith(town + ":")){
                String dataPart = row.substring(town.length() + 1);

                String [] monthlyData = dataPart.split(",");

                double sum = 0.0;
                int count = 0;

                for (String monthEntry : monthlyData) {
                    String[] parts = monthEntry.trim().split(" ");
                    if (parts.length == 2) {
                        try {
                            double value = Double.parseDouble(parts[1]);
                            sum += value;
                            count++;
                        } catch (NumberFormatException e) {
                            return -1;
                        }
                    }
                }

                return count == 0 ? -1 : sum / count;
            }

        }

        return -1;
    }
    @Override
    public double variance(String town, String strng) {

        String[] rows = strng.split("\n");

        for (String row : rows) {
            if (row.startsWith(town + ":")) {
                String dataPart = row.substring(town.length() + 1);
                String[] monthlyData = dataPart.split(",");

                double mean = mean(town, strng);
                if (mean == -1) {
                    return -1;
                }


                double sumSquaredDiffs = 0.0;
                int count = 0;

                for (String monthEntry : monthlyData) {
                    String[] parts = monthEntry.trim().split(" ");
                    if (parts.length == 2) {
                        try {
                            double value = Double.parseDouble(parts[1]);
                            sumSquaredDiffs += Math.pow(value - mean, 2);
                            count++;
                        } catch (NumberFormatException e) {
                            return -1;
                        }
                    }
                }

                return count == 0 ? -1 : sumSquaredDiffs / count;
            }
        }

        return -1;
    }


    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if(toFind.isEmpty()){
            return "";
        }

        int wins = 0;
        int draws = 0;
        int losses = 0;
        int scored = 0;
        int conceded = 0;

        String[] matches = resultSheet.split(",");
        boolean played = false;

        for(String match : matches){
            if(!match.contains(toFind)){
                continue;
            }

            if (match.matches(".*\\d+\\.\\d+.*")) {
                return "Error(float number):" + match;
            }

            String[] words = match.trim().split(" ");

            int firstScoreIndex = -1;
            for(int i = 0; i < words.length; i++){
                if (words[i].matches("\\d+")){
                    firstScoreIndex = i;
                    break;
                }
            }

            String team1 = String.join(" ", Arrays.copyOfRange(words, 0, firstScoreIndex));
            int score1 = Integer.parseInt(words[firstScoreIndex]);

            int secondScoreIndex = -1;
            for(int i = firstScoreIndex + 1; i < words.length; i++){
                if(words[i].matches("\\d+")){
                    secondScoreIndex = i;
                    break;
                }
            }

            String team2 = String.join(" ", Arrays.copyOfRange(words, firstScoreIndex + 1, secondScoreIndex));
            int score2 = Integer.parseInt(words[secondScoreIndex]);

            if(team1.equals(toFind)){
                played = true;
                scored = scored + score1;
                conceded = conceded + score2;

                if(score1 > score2){
                    wins++;
                }else if(score1 == score2){
                    draws++;
                }else {
                    losses++;
                }
            }else if(team2.equals(toFind)){
                played = true;
                scored = scored + score2;
                conceded = conceded + score1;

                if(score2 > score1){
                    wins++;
                } else if (score2 == score1) {
                    draws++;
                }else {
                    losses++;
                }
            }
        }

        if (!played){
            return toFind + ":This team didn't play!";
        }

        int points = wins * 3 + draws;

        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + losses +
                ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
