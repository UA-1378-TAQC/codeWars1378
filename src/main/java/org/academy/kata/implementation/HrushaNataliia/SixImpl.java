package org.academy.kata.implementation.HrushaNataliia;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sqrtM = (long) Math.sqrt(m);
        if (sqrtM * sqrtM != m) {
            return -1;
        }
        long discriminant = 1 + 8 * sqrtM;
        long sqrtDiscriminant = (long) Math.sqrt(discriminant);
        if (sqrtDiscriminant * sqrtDiscriminant != discriminant) {
            return -1;
        }
        long n = (sqrtDiscriminant - 1) / 2;
        if (n * (n + 1) / 2 * (n * (n + 1) / 2) == m) {
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
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        List<Double> rainfalls = getRainfalls(town, strng);
        if (rainfalls.isEmpty()) {
            return -1.0;
        }
        double sum = 0.0;
        for (double d : rainfalls) {
            sum += d;
        }
        return sum / rainfalls.size();
    }

    public double variance(String town, String strng) {
        List<Double> rainfalls = getRainfalls(town, strng);
        if (rainfalls.isEmpty()) {
            return -1.0;
        }
        double mean = mean(town, strng);
        double sumSq = 0.0;
        for (double d : rainfalls) {
            sumSq += Math.pow(d - mean, 2);
        }
        return sumSq / rainfalls.size();
    }

    private static List<Double> getRainfalls(String town, String strng) {
        List<Double> result = new ArrayList<>();
        String[] lines = strng.split("\n");
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts[0].equals(town)) {
                String[] entries = parts[1].split(",");
                for (String entry : entries) {
                    String[] monthRain = entry.trim().split(" ");
                    result.add(Double.parseDouble(monthRain[1]));
                }
                break;
            }
        }
        return result;
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
        if (lstOfArt == null || lstOfArt.length == 0 || lstOf1stLetter == null || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<String, Integer> categoryCounts = new HashMap<>();
        for (String category : lstOf1stLetter) {
            categoryCounts.put(category, 0);
        }

        for (String book : lstOfArt) {
            String[] parts = book.split(" ");
            if (parts.length < 2) {
                continue;
            }
            String category = parts[0].substring(0, 1);
            int quantity;
            try {
                quantity = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                continue;
            }
            if (categoryCounts.containsKey(category)) {
                categoryCounts.put(category, categoryCounts.get(category) + quantity);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            String category = lstOf1stLetter[i];
            int count = categoryCounts.getOrDefault(category, 0);
            if (i > 0) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(count).append(")");
        }

        return result.toString();
    }

}
