package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.*;


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
        if (toFind == null || toFind.isEmpty()) {
            return "";
        }

        String[] matches = resultSheet.split(",");
        int wins = 0, draws = 0, losses = 0;
        int scored = 0, conceded = 0;
        boolean played = false;

        for (String match : matches) {
            if (!match.contains(toFind)) {
                continue;
            }

            if (match.matches(".*\\d+\\.\\d+.*")) {
                return "Error(float number):" + match;
            }

            // Отримаємо всі слова та числа
            String[] parts = match.trim().split(" ");
            List<String> words = new ArrayList<>();
            List<Integer> numbers = new ArrayList<>();

            for (String part : parts) {
                try {
                    numbers.add(Integer.parseInt(part));
                } catch (NumberFormatException e) {
                    words.add(part);
                }
            }

            if (numbers.size() != 2) {
                continue; // некоректний запис
            }

            int score1 = numbers.get(0);
            int score2 = numbers.get(1);

            // Знайти індекси рахунків у parts
            int firstScoreIdx = -1;
            int secondScoreIdx = -1;
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equals(String.valueOf(score1)) && firstScoreIdx == -1) {
                    firstScoreIdx = i;
                } else if (parts[i].equals(String.valueOf(score2)) && secondScoreIdx == -1) {
                    secondScoreIdx = i;
                }
            }

            if (firstScoreIdx == -1 || secondScoreIdx == -1) continue;

            // Визначимо назви команд
            String team1 = String.join(" ", Arrays.copyOfRange(parts, 0, firstScoreIdx));
            String team2 = String.join(" ", Arrays.copyOfRange(parts, firstScoreIdx + 1, secondScoreIdx));

            boolean isTeam1 = team1.equals(toFind);
            boolean isTeam2 = team2.equals(toFind);

            if (!isTeam1 && !isTeam2) {
                continue;
            }

            played = true;

            int teamScore = isTeam1 ? score1 : score2;
            int oppScore = isTeam1 ? score2 : score1;

            scored += teamScore;
            conceded += oppScore;

            if (teamScore > oppScore) {
                wins++;
            } else if (teamScore == oppScore) {
                draws++;
            } else {
                losses++;
            }
        }

        if (!played) {
            return toFind + ":This team didn't play!";
        }

        int points = wins * 3 + draws;

        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + losses +
                ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
