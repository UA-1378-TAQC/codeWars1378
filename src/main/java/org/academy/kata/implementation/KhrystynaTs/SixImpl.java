package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import static java.util.stream.Stream.of;
import java.util.stream.DoubleStream;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        double result = Math.sqrt(m);
        double d = 1 + 8 * result;
        double n = (Math.sqrt(d) - 1) / 2;
        return n - Math.floor(n) == 0 ? (long) n : -1;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\n");
        StringBuilder report = new StringBuilder();
        String originalBalance = lines[0].replaceAll("[^a-zA-Z0-9. ]", "");
        report.append("Original balance: ").append(originalBalance).append("\n");
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].replaceAll("[^a-zA-Z0-9. ]", "");  // Clean the line
            if (!line.trim().isEmpty()) {  // Ignore empty lines
                String[] parts = line.split(" ");
                if (parts.length >= 3) {
                    String checkNumber = parts[0];
                    String category = parts[1];
                    String checkAmount = parts[2];
                    report.append("Check ").append(checkNumber)
                            .append(" - Category: ").append(category)
                            .append(" - Amount: ").append(checkAmount).append("\n");
                }
            }
        }
        return report.toString();
    }

    @Override
    public double f(double x) {
        double A = x;
        double B = -(2 * x + 1);
        double C = x;

        double discriminant = B * B - 4 * A * C;

        double sqrtDiscriminant = Math.sqrt(discriminant);

        double x1 = (-B + sqrtDiscriminant) / (2 * A);
        double x2 = (-B - sqrtDiscriminant) / (2 * A);

        if (x1 > 0 && x1 < 1) {
            return x1;
        } else {
            return x2;
        }
    }
  
    @Override
    public double mean(String town, String strng) {

        return stream(town, strng).average().orElse(-1);
    }

    @Override
    public double variance(String town, String strng) {

        return stream(town, strng).map(m -> Math.pow(m - mean(town, strng), 2)).average().orElse(-1);

    }
   public DoubleStream stream(String town, String data) {
        return of(data.split("\n")).filter(s -> s.startsWith(town + ":"))
                .flatMapToDouble(s -> of(s.replaceAll("[^\\d.]", " ").trim().split("\\s+")).mapToDouble(Double::parseDouble));
    }
    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.equals(""))
            return "";
        int countTeamname = toFind.split(" ").length;
        String[] split = resultSheet.split(",");
        int points = 0;
        int won = 0;
        int draw = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;
        for (String temp : split) {
            int ownPoints = 0;
            int oppPoints = 0;
            boolean teamFound = false;
            String[] parts = temp.split(" ");
            if (countTeamname == 2) {
                teamFound = (parts[0].equals(toFind.split(" ")[0]) && parts[1].equals(toFind.split(" ")[1]))
                        || (parts[parts.length - 3].equals(toFind.split(" ")[0])
                        && parts[parts.length - 2].equals(toFind.split(" ")[1]));
            } else {
                teamFound = (parts[0].equals(toFind.split(" ")[0]) && parts[1].equals(toFind.split(" ")[1])
                        && parts[2].equals(toFind.split(" ")[2]))
                        || (parts[parts.length - 4].equals(toFind.split(" ")[0])
                        && parts[parts.length - 3].equals(toFind.split(" ")[1])
                        && parts[parts.length - 2].equals(toFind.split(" ")[2]));
            }

            if (teamFound) {
                try {
                    if (toFind.split(" ")[0].equals(parts[0])) {
                        if (toFind.split(" ").length == 2) {
                            ownPoints = Integer.parseInt(parts[2]);
                        } else {
                            ownPoints = Integer.parseInt(parts[3]);
                        }
                        oppPoints = Integer.parseInt(parts[parts.length - 1]);
                    } else {
                        if (toFind.split(" ").length == 2) {
                            oppPoints = Integer.parseInt(parts[parts.length - 4]);
                        } else {
                            oppPoints = Integer.parseInt(parts[parts.length - 5]);
                        }
                        ownPoints = Integer.parseInt(parts[parts.length - 1]);
                    }
                } catch (NumberFormatException e) {
                    return "Error(float number):" + temp;
                }
                scored += ownPoints;
                conceded += oppPoints;
                if (ownPoints > oppPoints) {
                    points += 3;
                    won++;
                } else if (ownPoints == oppPoints) {
                    points += 1;
                    draw++;
                } else {
                    lost++;
                }
            }

        }

        if (won == 0 && draw == 0 && lost == 0) {
            return toFind + ":This team didn't play!";
        } else {
            return toFind + ":W=" + won + ";D=" + draw + ";L=" + lost + ";Scored=" + scored + ";Conceded=" + conceded
                    + ";Points=" + points;
        }
    }
    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
