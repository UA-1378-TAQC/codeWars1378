package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;

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
