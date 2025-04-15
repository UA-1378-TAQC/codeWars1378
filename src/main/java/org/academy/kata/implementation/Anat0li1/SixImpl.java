package org.academy.kata.implementation.Anat0li1;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.Arrays;
import java.util.Objects;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        long cubeSum = 0;
        long i = 0;
        while (cubeSum < m) {
            i++;
            cubeSum += (long) Math.pow(i, 3);
        }
        if (cubeSum == m) {
            return i;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        if (book == null || book.isEmpty()) {
            return book;
        }
        book = book.replaceAll("[^A-Za-z0-9\\s.]", "");
        System.out.println(book);
        double costSum = 0;
        int avgCounter = 0;
        String lineDivider = "\\r\\n";
        String inLine = " ";
        String[] rows = book.split("\n");
        double balance = Double.parseDouble(rows[0]);
        StringBuilder builder = new StringBuilder(String.format("Original Balance: %.2f", balance));
        builder.append(lineDivider);
        for (int i = 1; i < rows.length; i++) {
            if (!Objects.equals(rows[i], "")) {
                String[] cols = rows[i].split(" ");
                cols = Arrays.stream(cols)
                        .filter(s -> !s.trim().isEmpty())
                        .toArray(String[]::new);
                double curCost = Double.parseDouble(cols[2]);
                costSum += curCost;
                avgCounter++;
                balance -= curCost;
                builder.append(cols[0]).append(inLine).append(cols[1])
                        .append(inLine).append(cols[2]).append(inLine).append("Balance")
                        .append(inLine).append(String.format("%.2f", (double) Math.round(balance * 100) / 100)).append(lineDivider);
            }
        }
        builder.append("Total").append(inLine).append("expense").append(inLine)
                .append(inLine).append(String.format("%.2f", (double) Math.round(costSum * 100) / 100)).append(lineDivider);
        builder.append("Average").append(inLine).append("expense").append(inLine)
                .append(inLine).append(String.format("%.2f", (double) Math.round(costSum / avgCounter * 100) / 100));

        return builder.toString();
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(x + 1) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || strng == null) {
            return -1;
        }
        double sum = 0;
        String[] rows = strng.split("\n");
        for (int i = 0; i < rows.length; i++) {
            String[] rowData = rows[i].split(":");
            String townData = rowData[0];
            if (townData.equals(town)) {
                String[] monthData = rowData[1].split(",");
                for (int j = 0; j < monthData.length; j++) {
                    sum += Double.parseDouble(monthData[j].trim().split(" ")[1]);
                }
                return sum / monthData.length;
            }
        }
        return -1;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || strng == null) {
            return 0.0;
        }
        double mean = mean(town, strng);
        double sum = 0;
        String[] rows = strng.split("\n");
        for (int i = 0; i < rows.length; i++) {
            String[] rowData = rows[i].split(":");
            String townData = rowData[0];
            if (townData.equals(town)) {
                String[] monthData = rowData[1].split(",");
                for (int j = 0; j < monthData.length; j++) {
                    sum += Math.pow(mean - Double.parseDouble(monthData[j].trim().split(" ")[1]), 2);
                }
                return sum / monthData.length;
            }
        }
        return -1;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (resultSheet == null || toFind == null) {
            return "";
        }
        if (resultSheet.isEmpty() || toFind.isEmpty()) {
            return "";
        }
        String name = toFind;
        String[] results = resultSheet.trim().split(",");
        int numberOfWins = 0;
        int numberOfLoses = 0;
        int allMatches = 0;
        int numberOfScored = 0;
        int numberOfConceded = 0;
        for (int i = 0; i < results.length; i++) {
            int teamCount;
            int oppositeCount;
            if (checkTeamIsInRow(results[i], name)) {
                if (results[i].startsWith(name)) {
                    String[] rowValues = results[i].trim().split(" ");
                    if (rowValues[name.split(" ").length].contains(".") || rowValues[rowValues.length - 1].contains(".")) {
                        return "Error(float number):" + results[i];
                    }
                    teamCount = Integer.parseInt(rowValues[name.split(" ").length]);
                    oppositeCount = Integer.parseInt(rowValues[rowValues.length - 1]);
                } else {
                    String[] rowValues = results[i].trim().split(" " + name + " ");
                    if (rowValues[rowValues.length - 1].contains(".") || rowValues[0].trim().split(" ")[rowValues[0].trim().split(" ").length - 1].contains(".")) {
                        return "Error(float number):" + results[i];
                    }
                    teamCount = Integer.parseInt(rowValues[rowValues.length - 1]);
                    oppositeCount = Integer.parseInt(rowValues[0].trim().split(" ")[rowValues[0].trim().split(" ").length - 1]);
                }

                if (oppositeCount > teamCount) {
                    numberOfLoses++;
                } else if (oppositeCount < teamCount) {
                    numberOfWins++;
                }
                allMatches++;

                numberOfScored += teamCount;
                numberOfConceded += oppositeCount;
            }
        }
        if (allMatches == 0) {
            return name + ":This team didn't play!";
        }
        int points = 3 * numberOfWins + (allMatches - numberOfWins - numberOfLoses);
        StringBuilder builder = new StringBuilder(name);
        builder.append(":W=").append(numberOfWins).append(";D=").append(allMatches - numberOfLoses - numberOfWins)
                .append(";L=").append(numberOfLoses).append(";Scored=").append(numberOfScored)
                .append(";Conceded=").append(numberOfConceded).append(";Points=").append(points);
        return builder.toString();
    }

    private static boolean checkTeamIsInRow(String row, String team) {
        System.out.println(row);
        String[] teams = row.trim().split(" \\d+( |$|.\\d+)");

        boolean result = false;
        for (String s : teams) {
            System.out.println(s.trim());
            if (s.trim().equals(team)) {

                return true;
            }
        }
        return false;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String[] results = new String[lstOf1stLetter.length];
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int totalNumber = 0;
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOfArt[j].startsWith(lstOf1stLetter[i])) {
                    totalNumber += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                }
            }
            results[i] = "(" + lstOf1stLetter[i] + " : " + totalNumber + ")";
        }
        return String.join(" - ", results);
    }
}
