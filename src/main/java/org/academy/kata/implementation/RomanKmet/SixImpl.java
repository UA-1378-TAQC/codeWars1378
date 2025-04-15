package org.academy.kata.implementation.RomanKmet;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
import java.util.regex.*;


public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sum = 0;
        long n = 0;
        while (sum < m) {
            n++;
            sum += n * n * n;
        }
        return sum == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        String cleaned = book.replaceAll("[^a-zA-Z0-9.\\s]", "").replaceAll(" +", " ").trim();
        String[] lines = cleaned.split("\\n");
        double originalBalance = Double.parseDouble(lines[0]);
        double balance = originalBalance;
        double totalExpense = 0.0;
        int count = 0;
        StringBuilder report = new StringBuilder();
        report.append(String.format("Original Balance: %.2f\r\n", originalBalance));
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" ");
            if (parts.length != 3) continue;

            String checkNumber = parts[0];
            String category = parts[1];
            double amount = Double.parseDouble(parts[2]);

            balance -= amount;
            totalExpense += amount;
            count++;

            report.append(String.format("%s %s %.2f Balance %.2f\r\n",
                    checkNumber, category, amount, balance));
        }
        double averageExpense = totalExpense / count;

        report.append(String.format("Total expense  %.2f\r\n", totalExpense));
        report.append(String.format("Average expense  %.2f", averageExpense));

        return report.toString();
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        double[] data = extractData(town, strng);
        return (data == null) ? -1.0 : Arrays.stream(data).average().orElse(-1.0);
    }

    private double[] extractData(String town, String strng) {
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .findFirst()
                .map(line -> line.substring(line.indexOf(":") + 1)
                        .split(","))
                .map(values -> Arrays.stream(values)
                        .mapToDouble(v -> Double.parseDouble(v.split(" ")[1]))
                        .toArray())
                .orElse(null);
    }

    @Override
    public double variance(String town, String strng) {
        double[] data = extractData(town, strng);
        if (data == null) return -1.0;
        double mean = mean(town, strng);
        return Arrays.stream(data).map(x -> Math.pow(x - mean, 2)).average().orElse(-1.0);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == null || toFind.isEmpty()) {
            return "";
        }
        String[] matches = resultSheet.split(",");
        int wins = 0, draws = 0, losses = 0, scored = 0, conceded = 0;
        for (String match : matches) {
            if (match.contains(toFind)) {
                Pattern pattern = Pattern.compile("(.+) (\\d+) (.+) (\\d+)");
                Matcher matcher = pattern.matcher(match.trim());

                if (!matcher.matches()) {
                    if (match.matches(".*\\d+\\.\\d+.*")) {
                        return "Error(float number):" + match.trim();
                    }
                    continue;
                }
                String team1 = matcher.group(1).trim();
                int score1 = Integer.parseInt(matcher.group(2));
                String team2 = matcher.group(3).trim();
                int score2 = Integer.parseInt(matcher.group(4));

                if (team1.equals(toFind)) {
                    scored += score1;
                    conceded += score2;
                    if (score1 > score2) {
                        wins++;
                    } else if (score1 < score2) {
                        losses++;
                    } else {
                        draws++;
                    }
                } else if (team2.equals(toFind)) {
                    scored += score2;
                    conceded += score1;
                    if (score2 > score1) {
                        wins++;
                    } else if (score2 < score1) {
                        losses++;
                    } else {
                        draws++;
                    }
                }
            }
        }
        if (wins == 0 && draws == 0 && losses == 0 && scored == 0 && conceded == 0) {
            return toFind + ":This team didn't play!";
        }
        int points = (wins * 3) + (draws * 1);
        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins, draws, losses, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOfArt.length == 0 || lstOf1stLetter == null || lstOf1stLetter.length == 0) {
            return "";
        }
        Map<String, Integer> categoryCounts = new HashMap<>();
        for (String category : lstOf1stLetter) {
            categoryCounts.put(category, 0);
        }
        for (String item : lstOfArt) {
            String[] parts = item.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String category = code.substring(0, 1);
            if (categoryCounts.containsKey(category)) {
                categoryCounts.put(category, categoryCounts.get(category) + quantity);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            if (!result.isEmpty()) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(categoryCounts.get(category)).append(")");
        }

        return result.toString();
    }
}
