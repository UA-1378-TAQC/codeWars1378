package org.academy.kata.implementation.novitskiiy;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (toFind.isEmpty()) return "";

        int wins = 0, draws = 0, losses = 0, scored = 0, conceded = 0, points = 0;
        boolean played = false;

        String[] matches = resultSheet.split(",");
        Pattern pattern = Pattern.compile("(.*?) (\\d+) (.*?) (\\d+)");

        for (String match : matches) {
            Matcher matcher = pattern.matcher(match);
            if (matcher.matches()) {
                String team1 = matcher.group(1).trim();
                int score1 = Integer.parseInt(matcher.group(2));
                String team2 = matcher.group(3).trim();
                int score2 = Integer.parseInt(matcher.group(4));

                if (team1.contains(".") || team2.contains(".")) {
                    return "Error(float number):" + match.trim();
                }

                if (team1.equals(toFind)) {
                    played = true;
                    scored += score1;
                    conceded += score2;
                    if (score1 > score2) {
                        wins++;
                        points += 3;
                    } else if (score1 < score2) {
                        losses++;
                    } else {
                        draws++;
                        points++;
                    }
                } else if (team2.equals(toFind)) {
                    played = true;
                    scored += score2;
                    conceded += score1;
                    if (score2 > score1) {
                        wins++;
                        points += 3;
                    } else if (score2 < score1) {
                        losses++;
                    } else {
                        draws++;
                        points++;
                    }
                }
            } else if (match.contains(".")) {
                return "Error(float number):" + match.trim();
            }
        }

        if (!played) return toFind + ":This team didn't play!";

        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, losses, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
