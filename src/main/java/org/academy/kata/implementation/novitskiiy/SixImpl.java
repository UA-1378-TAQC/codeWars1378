package org.academy.kata.implementation.novitskiiy;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
        String cleaned = book.replaceAll("[^a-zA-Z0-9.\\s\n]", "");
        String[] array = cleaned.split("\\n+");
        array[0] = "Original Balance: " + array[0];

        double total = 0;
        double average;
        double balance = Double.parseDouble(array[0].split(":")[1].trim());

        for (int i = 1; i < array.length; i++) {
            String[] temp = array[i].split("\\s+");
            double expense = Double.parseDouble(temp[2]);
            balance -= expense;
            total += expense;
            array[i] = temp[0] + " " + temp[1] + " " + temp[2] + " Balance " + String.format("%.2f", balance);
        }

        average = total / (array.length - 1);
        StringBuilder res = new StringBuilder();
        for (String line : array) {
            res.append(line).append("\r\n");
        }
        res.append("Total expense  ").append(String.format("%.2f", total)).append("\r\n");
        res.append("Average expense  ").append(String.format("%.2f", average));

        return res.toString();
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<Character, Integer> stockMap = new HashMap<>();

        for (String category : lstOf1stLetter) {
            stockMap.put(category.charAt(0), 0);
        }

        for (String book : lstOfArt) {
            char category = book.charAt(0);
            int quantity = Integer.parseInt(book.split(" ")[1]);

            if (stockMap.containsKey(category)) {
                stockMap.put(category, stockMap.get(category) + quantity);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            if (result.length() > 0) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(stockMap.get(category.charAt(0))).append(")");
        }

        return result.toString();
    }
}
