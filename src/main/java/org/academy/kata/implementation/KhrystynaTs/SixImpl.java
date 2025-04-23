package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;

import static java.util.stream.Stream.of;


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
        String[] balance = book.split("\n");

        for (int i = 0; i < balance.length; i++) {
            balance[i] = balance[i].replaceAll("[/{!@#$%^&*-+=:;,`?}]", "");
            balance[i] = balance[i].replaceAll(" +", " ");
        }

        double originalBalance = Double.parseDouble(balance[0]);
        String res = "Original Balance: " + originalBalance + "0\\r\\n";

        double totalExpense = 0;

        for (int i = 1; i < balance.length; i++) {

            String[] t = balance[i].split(" ");
            String checkNumber = t[0];
            String category = t[1];
            double checkAmount = Double.parseDouble(t[2]);
            totalExpense += checkAmount;
            double final_Balance = Math.round((originalBalance - checkAmount) * 100.0) / 100.0;
            originalBalance -= checkAmount;


            res += checkNumber + " " + category + " " + length_Check(checkAmount) + " " + "Balance " + length_Check(final_Balance) + "\\r\\n";
        }
            double avarage_Expense = Math.round(totalExpense / (balance.length - 1) * 100.0) / 100.0;

            res += "Total expense  " + length_Check(totalExpense) + "\\r\\nAverage expense  " + length_Check(avarage_Expense);
            return res;

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
        Map<String, Integer> categoryTotals = new HashMap<>();
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        for (String category : lstOf1stLetter) {
            categoryTotals.put(category, 0);
        }
        for (String entry : lstOfArt) {
            String[] parts = entry.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);

            String category = String.valueOf(code.charAt(0));
            if (categoryTotals.containsKey(category)) {
                categoryTotals.put(category, categoryTotals.get(category) + quantity);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            result.append("(").append(category).append(" : ").append(categoryTotals.get(category)).append(") - ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 3);
        }

        return result.toString();
    }
    public static String length_Check(double t_value) {
        String t_Value_String = String.valueOf(t_value);

        String t_Value_String_substring = t_Value_String.substring(t_Value_String.indexOf('.') + 1);

        if (t_Value_String_substring.length() == 0) {
            t_Value_String += "00";
        } else if (t_Value_String_substring.length() == 1) {
            t_Value_String += "0";
        } else if (t_Value_String_substring.length() == 2) {
            return t_Value_String;
        } else if (t_Value_String_substring.length() > 2) {
            t_Value_String = length_Check((Math.round(t_value * 100.0)) / 100.0);
        }
        return t_Value_String;
    }
}
