package org.academy.kata.implementation.adidvar;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import static org.academy.kata.implementation.KhrystynaTs.SixImpl.length_Check;

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
        String[] balance = book.split("\n");
        for (int i = 0; i < balance.length; i++) {
            balance[i] = balance[i].replaceAll("[/{!@#$%^&*-+=:;,`?}]", "");
            balance[i] = balance[i].replaceAll(" +", " ");
        }

        double total_Expense = 0;
        double original_Balance = Double.parseDouble(balance[0]);
        String res = "Original Balance: " + original_Balance + "0\\r\\n";

        for (int i = 1; i < balance.length; i++) {
            String[] t = balance[i].split(" ");
            // System.out.println(Arrays.toString(t));
            String check_Number = t[0];
            String catagory = t[1];
            double check_Amount = Double.parseDouble(t[2]);
            total_Expense += check_Amount;
            double final_Balance = Math.round((original_Balance - check_Amount) * 100.0) / 100.0;
            original_Balance -= check_Amount;
            res += check_Number + " " + catagory + " " + length_Check(check_Amount) + " " + "Balance " + length_Check(final_Balance) + "\\r\\n";

        }
        // total_Expense = Math.round(total_Expense*100.0)/100.0;
        double avarage_Expense = Math.round(total_Expense / (balance.length - 1) * 100.0) / 100.0;

        res += "Total expense  " + length_Check(total_Expense) + "\\r\\nAverage expense  " + length_Check(avarage_Expense);
        // System.out.println("\n"+ res);
        return res;
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
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
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
