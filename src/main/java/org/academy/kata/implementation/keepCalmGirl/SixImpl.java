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
        String[] lines = book.split("\\n");
        double balance = Double.parseDouble(lines[0].replaceAll("[^0-9.]", ""));
        double originalBalance = balance;
        double totalExpense = 0;
        int itemCount = 0;
        StringBuilder result = new StringBuilder();
        result.append(String.format("Original Balance: %.2f\\r\\n", originalBalance));

        for (int i = 1; i < lines.length; i++) {
            String[] order = lines[i].split("[^0-9a-zA-Z.]+");
            if (order.length < 3) continue;

            String orderId = order[0];
            String item = order[1];
            double itemPrice = Double.parseDouble(order[2]);

            balance -= itemPrice;
            totalExpense += itemPrice;
            itemCount += 1;

            result.append(String.format("%s %s %.2f Balance %.2f\\r\\n", orderId, item, itemPrice, balance));
        }

        double avgExpense = totalExpense / itemCount;
        result.append(String.format("Total expense  %.2f\\r\\n", totalExpense));
        result.append(String.format("Average expense  %.2f", avgExpense));
        return result.toString();
    }

    @Override
    public double f(double x) {
        if (Math.abs(x) < 1) {
            return (x / 2) - (Math.pow(x, 2) / 8) + (Math.pow(x, 3) / 16) - (Math.pow(x, 4) / 128) + (Math.pow(x, 5) / 1024) - (Math.pow(x, 6) / 8192) + (Math.pow(x, 7) / 65536);
        } else {
            return Math.sqrt(1 + x) - 1;
        }
    }

    @Override
    public double mean(String town, String strng) {
        String[] lines = strng.split("\\n");

        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                String[] values = line.split(":")[1].split(",");
                double sum = 0;
                double count = 0;

                for (String value : values) {
                    sum += Double.parseDouble(value.trim().split(" ")[1]);
                    count++;
                }
                return count > 0 ? sum / count : -1.0;
            }
        }
        return -1.0;
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        if (mean == -1.0) return -1.0;

        String[] lines = strng.split("\\n");

        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                String[] values = line.split(":")[1].split(",");
                double sumSquaredDiff = 0;
                double count = 0;

                for (String value : values) {
                    double num = Double.parseDouble(value.trim().split(" ")[1]);
                    sumSquaredDiff += Math.pow(num - mean, 2);
                    count++;
                }
                return count > 0 ? sumSquaredDiff / count : -1.0;
            }
        }
        return -1.0;
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
