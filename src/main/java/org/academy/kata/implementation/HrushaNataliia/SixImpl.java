package org.academy.kata.implementation.HrushaNataliia;

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
        if (toFind.isEmpty()) {
            return "";
        }

        int wins = 0;
        int draws = 0;
        int losses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        boolean hasPlayed = false;

        String[] games = resultSheet.split(",");
        for (String game : games) {
            game = game.trim();
            if (game.isEmpty()) {
                continue;
            }

            if (game.matches(".*\\d+\\.\\d+.*")) {
                return "Error(float number):" + game;
            }

            String[] parts = game.split(" ");
            int score1 = -1;
            int score2 = -1;
            int splitIndex = -1;

            for (int i = 0; i < parts.length; i++) {
                try {
                    Integer.parseInt(parts[i]);
                    if (score1 == -1) {
                        score1 = Integer.parseInt(parts[i]);
                        splitIndex = i;
                    } else {
                        score2 = Integer.parseInt(parts[i]);
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }

            if (score1 == -1 || score2 == -1) {
                continue;
            }

            String team1 = String.join(" ", java.util.Arrays.copyOfRange(parts, 0, splitIndex));
            String team2 = String.join(" ", java.util.Arrays.copyOfRange(parts, splitIndex + 1, parts.length - 1));

            if (team1.equals(toFind)) {
                hasPlayed = true;
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
            } else if (team2.equals(toFind)) {
                hasPlayed = true;
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

        if (!hasPlayed) {
            return toFind + ":This team didn't play!";
        } else {
            return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                    toFind, wins, draws, losses, scored, conceded, points);
        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
