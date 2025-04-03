package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
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
        double[] values = getRainfallValues(town, strng);
        if (values == null) return -1.0;
        return Arrays.stream(values).average().orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        double[] values = getRainfallValues(town, strng);
        if (values == null) return -1.0;

        double mean = mean(town, strng);
        return Arrays.stream(values)
                .map(x -> Math.pow(x - mean, 2))
                .average()
                .orElse(-1.0);
    }

    private static double[] getRainfallValues(String town, String strng) {
        String[] records = strng.split("\n");

        for (String record : records) {
            if (record.startsWith(town + ":")) {
                String dataPart = record.substring(town.length() + 1);

                return Arrays.stream(dataPart.split(","))
                        .map(s -> s.split(" ")[1])
                        .mapToDouble(Double::parseDouble)
                        .toArray();
            }
        }
        return null;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.isEmpty()) return "";

        String[] matches = resultSheet.split(",");
        int wins = 0, draws = 0, losses = 0, scored = 0, conceded = 0, points = 0;
        boolean teamPlayed = false;

        Pattern pattern = Pattern.compile("([A-Za-z0-9 .]+) (\\d+) ([A-Za-z0-9 .]+) (\\d+)");

        for (String match : matches) {
            Matcher matcher = pattern.matcher(match.trim());
            if (!matcher.matches()) continue;

            String team1 = matcher.group(1).trim();
            String team2 = matcher.group(3).trim();
            int score1, score2;

            try {
                score1 = Integer.parseInt(matcher.group(2));
                score2 = Integer.parseInt(matcher.group(4));
            } catch (NumberFormatException e) {
                return "Error(float number):" + match.trim();
            }

            if (team1.equals(toFind) || team2.equals(toFind)) {
                teamPlayed = true;
                if (team1.equals(toFind)) {
                    scored += score1;
                    conceded += score2;
                    if (score1 > score2) {
                        wins++;
                        points += 3;
                    } else if (score1 < score2) {
                        losses++;
                    } else {
                        draws++;
                        points += 1;
                    }
                } else {
                    scored += score2;
                    conceded += score1;
                    if (score2 > score1) {
                        wins++;
                        points += 3;
                    } else if (score2 < score1) {
                        losses++;
                    } else {
                        draws++;
                        points += 1;
                    }
                }
            }
        }

        if (!teamPlayed) return toFind + ":This team didn't play!";

        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, losses, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
