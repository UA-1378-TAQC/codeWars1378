package org.academy.kata.implementation.novitskiiy;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long n = 0;
        long sum = 0;

        while (sum < m) {
            n++;
            sum += (long) Math.pow(n, 3);
        }

        if (sum == m) {
            return n;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
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
        return Arrays.stream(values).map(v -> Math.pow(v - mean, 2)).average().orElse(-1.0);
    }

    private double[] getRainfallValues(String town, String strng) {
        Map<String, String> dataMap = new HashMap<>();

        for (String line : strng.split("\n")) {
            String[] parts = line.split(":");
            if (parts.length < 2) continue;
            dataMap.put(parts[0], parts[1]);
        }

        if (!dataMap.containsKey(town)) return null;

        return Arrays.stream(dataMap.get(town).split(","))
                .map(s -> s.split(" ")[1])
                .mapToDouble(Double::parseDouble)
                .toArray();
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
