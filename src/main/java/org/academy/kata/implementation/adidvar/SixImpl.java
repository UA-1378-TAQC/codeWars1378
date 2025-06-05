package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long n = 1;
        while (m > 0) {
            m -= n * n * n;
            n++;
        }
        if (m < 0)
            return -1;
        else
            return n - 1;
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
        String[] cities = strng.split("\n");
        for (String city : cities) {
            if (city.startsWith(town + ":")) {
                String[] records = city.substring(town.length() + 1).split(",");
                double sum = 0.0;
                for (String record : records) {
                    sum += Double.parseDouble(record.split(" ")[1]);
                }
                return sum / records.length;
            }
        }

        return -1;
    }

    @Override
    public double variance(String town, String strng) {
        double avg = mean(town, strng);

        String[] cities = strng.split("\n");
        for (String city : cities) {
            if (city.startsWith(town + ":")) {
                String[] records = city.substring(town.length() + 1).split(",");
                double rainfallSum = 0.0;
                for (String record : records) {
                    double monthRainfall = Double.parseDouble(record.split(" ")[1]);
                    rainfallSum += (monthRainfall - avg) * (monthRainfall - avg);
                }
                return rainfallSum / records.length;
            }
        }

        return -1;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == null || toFind.isEmpty() || resultSheet == null || resultSheet.isEmpty()){
            return "";
        }

        boolean played = false;
        int lost = 0;
        int won = 0;
        int draws = 0;
        int conceded = 0;
        int score = 0;
        int points = 0;

        String[] matches = resultSheet.split(",");
        String floatErrorRegex = ".*\\d+\\.\\d+.*";

        for (String match : matches) {
            if (match.matches(floatErrorRegex)) {
                return "Error(float number):" + match.trim();
            }

            String regex = "(.+?) (\\d+) (.+?) (\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(match.trim());

            if(matcher.matches()) {
                String team1 = matcher.group(1).trim();
                int score1  = Integer.parseInt(matcher.group(2));
                String team2 = matcher.group(3).trim();
                int score2 = Integer.parseInt(matcher.group(4));

                if (team1.equals(toFind)) {
                    played = true;
                    if (score1 > score2) {
                        won++;
                        points += 3;
                    }
                    else if (score1 < score2) {
                        lost++;
                    }
                    else {
                        draws++;
                        points++;
                    }

                    score += score1;
                    conceded += score2;
                }
                else if (team2.equals(toFind)) {
                    played = true;
                    if (score1 < score2) {
                        won++;
                        points += 3;
                    }
                    else if (score1 > score2) {
                        lost++;
                    }
                    else {
                        draws++;
                        points++;
                    }

                    score += score2;
                    conceded += score1;
                }
            }
        }
        if (played) {
            return toFind + ":W=" + won + ";D=" + draws + ";L=" + lost + ";Scored=" + score + ";Conceded=" + conceded + ";Points=" + points;
        } else
            return toFind + ":This team didn't play!";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        int[] categoryCounts = new int[lstOf1stLetter.length];
        for (String book : lstOfArt) {
            char category = book.charAt(0);
            int quantity = Integer.parseInt(book.split(" ")[1]);

            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (lstOf1stLetter[i].charAt(0) == category) {
                    categoryCounts[i] += quantity;
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            if (!result.isEmpty()) {
                result.append(" - ");
            }
            result.append("(").append(lstOf1stLetter[i]).append(" : ").append(categoryCounts[i]).append(")");
        }

        return result.toString();
    }

}
