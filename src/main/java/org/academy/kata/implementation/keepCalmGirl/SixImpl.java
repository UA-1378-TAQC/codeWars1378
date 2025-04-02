package org.academy.kata.implementation.keepCalmGirl;

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
        if (toFind.isEmpty()) return "";

        String[] games = resultSheet.split(",");
        int wins = 0, draws = 0, losses = 0, scored = 0, conceded = 0, points = 0;
        boolean played = false;

        for (String game : games) {
            String[] parts = game.split(" ");
            StringBuilder team1 = new StringBuilder();
            StringBuilder team2 = new StringBuilder();
            int score1 = -1, score2 = -1;

            for (String part : parts) {
                if (part.matches("\\d+\\.\\d+")) {
                    return "Error(float number):" + game;
                }
                if (part.matches("\\d+")) {
                    if (score1 == -1) {
                        score1 = Integer.parseInt(part);
                    } else {
                        score2 = Integer.parseInt(part);
                    }
                } else {
                    if (score1 == -1) {
                        team1.append(team1.isEmpty() ? "" : " ").append(part);
                    } else {
                        team2.append(team2.isEmpty() ? "" : " ").append(part);
                    }
                }
            }
            if (team1.toString().equals(toFind) || team2.toString().equals(toFind)) {
                played = true;

                if (team1.toString().equals(toFind)) {
                    scored += score1;
                    conceded += score2;
                    if (score1 > score2) {
                        wins++;
                        points += 3;
                    } else if (score1 == score2) {
                        draws++;
                        points += 1;
                    } else {
                        losses++;
                    }
                } else if (team2.toString().equals(toFind)) {
                    scored += score2;
                    conceded += score1;
                    if (score2 > score1) {
                        wins++;
                        points += 3;
                    } else if (score2 == score1) {
                        draws++;
                        points += 1;
                    } else {
                        losses++;
                    }
                }
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
