package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.util.*;


public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long sum = 0;
        long n = 0;

        while (sum < m){
            n++;
            sum += n*n*n;
            if (sum == m){
                return n;
            }
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        return "";
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        String[] cities = strng.split("\n");

        for (String cityData : cities) {
            String[] parts = cityData.split(":");
            String cityName = parts[0];

            if (cityName.equals(town)) {
                String[] months = parts[1].split(",");
                double totalRainfall = 0.0;
                int numberOfMonths = 0;

                for (String monthData : months) {
                    String[] monthParts = monthData.trim().split(" ");
                    double rainfall = Double.parseDouble(monthParts[1]);

                    totalRainfall += rainfall;
                    numberOfMonths++;
                }

                return totalRainfall / numberOfMonths;
            }
        }

        return -1.0;
    }

    @Override
    public double variance(String town, String strng) {
        String[] cities = strng.split("\n");

        for (String cityData : cities) {
            String[] parts = cityData.split(":");
            String cityName = parts[0];

            if (cityName.equals(town)) {
                String[] months = parts[1].split(",");
                double totalRainfall = 0.0;
                int numberOfMonths = 0;

                double[] rainfallData = new double[months.length];

                for (int i = 0; i < months.length; i++) {
                    String[] monthParts = months[i].trim().split(" ");
                    double rainfall = Double.parseDouble(monthParts[1]);

                    totalRainfall += rainfall;
                    rainfallData[i] = rainfall;
                    numberOfMonths++;
                }

                double meanRainfall = totalRainfall / numberOfMonths;
                double sumOfSquaredDifferences = 0.0;

                for (double rainfall : rainfallData) {
                    sumOfSquaredDifferences += Math.pow(rainfall - meanRainfall, 2);
                }

                return sumOfSquaredDifferences / numberOfMonths;
            }
        }

        return -1.0;
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<String, Integer> categoryCounts = new HashMap<>();
        for (String category : lstOf1stLetter) {
            categoryCounts.put(category, 0);
        }

        // Обхід списку книг та підрахунок кількостей по категоріях
        for (String art : lstOfArt) {
            String[] parts = art.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String category = code.substring(0, 1);

            if (categoryCounts.containsKey(category)) {
                categoryCounts.put(category, categoryCounts.get(category) + quantity);
            }
        }

        // Формування підсумкового рядка
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            if (result.length() > 0) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(categoryCounts.get(category)).append(")");
        }

        return result.toString();
    }
}
