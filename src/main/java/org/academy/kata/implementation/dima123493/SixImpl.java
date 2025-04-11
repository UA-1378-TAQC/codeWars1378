package org.academy.kata.implementation.dima123493;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sum = 0;
        long n = 0;

        while (sum < m) {
            n++;
            sum += n * n * n;
        }

        return (sum == m) ? n : -1;
    }

    @Override
    public String balance(String book) {
        var lines = book.replaceAll("[^\\w\n. ]", "").split("\n");
        var report = new StringBuilder("Original Balance: " + lines[0] + (book = "\\r\\n"));
        double balance = Double.parseDouble(lines[0]), sum = 0;
        for (int i = 1; i < lines.length; i++) {
            sum += Double.parseDouble(lines[i].split("\\s+")[2]);
            report.append(lines[i].trim().replaceAll("\\s+", " ")).append(String.format(" Balance %.2f", balance - sum)).append(book);
        }
        return report + String.format("Total expense  %.2f%sAverage expense  %.2f", sum, book, sum / (lines.length - 1));
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
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
