package org.academy.kata.implementation.BohdanKovalets;

import org.academy.kata.Base;
import org.academy.kata.ISix;

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
        return "";
    }

    @Override
    public double f(double x) {
        if (x == 0) {
            return 0;
        }
        double sqrtTerm = Math.sqrt(1 + x);
        return x / (sqrtTerm + 1);
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

        int wins=0, draws=0, losses=0, scored=0, conceded=0;
        boolean teamFound = false;
        String[] matches = resultSheet.split(",");

        for (String match : matches) {
            if (match.matches(".*\\d+\\.\\d+.*")) {
                return "Error(float number):" + match;
            }
            String[] parts = match.split("\\s+");
            StringBuilder team1 = new StringBuilder();
            StringBuilder team2 = new StringBuilder();
            int score1 = 0, score2 = 0;
            int i = 0;

            while (i < parts.length && !parts[i].matches("\\d+")) {
                team1.append(parts[i]).append(" ");
                i++;
            }
            if (i < parts.length) {
                score1 = Integer.parseInt(parts[i]);
                i++;
            }

            while (i < parts.length && !parts[i].matches("\\d+")) {
                team2.append(parts[i]).append(" ");
                i++;
            }
            if (i < parts.length) {
                score2 = Integer.parseInt(parts[i]);
            }

            String team1Name = team1.toString().trim();
            String team2Name = team2.toString().trim();

            if (team1Name.equals(toFind)) {
                teamFound = true;
                scored += score1;
                conceded += score2;
                if (score1 > score2) wins++;
                else if (score1<score2) losses++;
                else draws++;
            } else if (team2Name.equals(toFind)) {
                teamFound = true;
                scored += score2;
                conceded += score1;
                if (score2 >score1) wins++;
                else if (score2<score1) losses++;
                else draws++;
            }

        }
        if (!teamFound) {
            return toFind + ":This team didn't play!";
        }
        int points = wins*3+draws;
        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, wins,draws,losses, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        java.util.Map<String, Integer> categorySums = new java.util.HashMap<>();
        for (String item : lstOfArt) {
            String[] parts = item.split(" ");
            String category = String.valueOf(parts[0].charAt(0));
            int quantity = Integer.parseInt(parts[1]);

            categorySums.put(category, categorySums.getOrDefault(category, 0)+quantity);
        }

        StringBuilder result = new StringBuilder();
        for (int i=0; i<lstOf1stLetter.length; i++) {
            String category = lstOf1stLetter[i];
            int sum = categorySums.getOrDefault(category, 0);

            result.append("(").append(category).append(" : ").append(sum).append(")");
            if (i < lstOf1stLetter.length-1) {
                result.append(" - ");
            }
        }
        return result.toString();
    }
}
