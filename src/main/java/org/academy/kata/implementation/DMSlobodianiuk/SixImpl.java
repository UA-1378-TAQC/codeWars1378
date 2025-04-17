package org.academy.kata.implementation.DMSlobodianiuk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        if (m > Math.pow(2, 63) - 1) {
            return -1;
        }

        long k = 0;
        long n = 0;

        while (k < m) {
            k += n * n * n;

            if (k == m) {
                return n;
            }
            n += 1;
        }

        return -1;
    }

    @Override
    public String balance(String book) {
        String[] balance = book.split("\n");


        for (int i = 0; i < balance.length; i++) {
            balance[i] = balance[i].replaceAll("[/{!@#$%^&*-+=:;,`?}]", "");
            balance[i] = balance[i].replaceAll(" +", " ");
        }


        double original_Balance = Double.parseDouble(balance[0]);
        String res = "Original Balance: " + original_Balance + "0\\r\\n";

        double total_Expense = 0;

        for (int i = 1; i < balance.length; i++) {

            String[] t = balance[i].split(" ");
            String check_Number = t[0];
            String catagory = t[1];
            double check_Amount = Double.parseDouble(t[2]);
            total_Expense += check_Amount;
            double final_Balance = Math.round((original_Balance - check_Amount) * 100.0) / 100.0;
            original_Balance -= check_Amount;


            res += check_Number + " " + catagory + " " + length_Check(check_Amount) + " " + "Balance " + length_Check(final_Balance) + "\\r\\n";

        }
        double avarage_Expense = Math.round(total_Expense / (balance.length - 1) * 100.0) / 100.0;

        res += "Total expense  " + length_Check(total_Expense) + "\\r\\nAverage expense  " + length_Check(avarage_Expense);
        return res;
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

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        if (extract(town, strng).equals("-1")) return -1.0;

        String mean_data = extract(town, strng);

        String[] mean_data_splited = mean_data.split(":");
        String[] month_value = mean_data_splited[1].split(",");

        double mean_lenght = month_value.length;
        double mean_value = 0;

        for (String mv : month_value) {
            String[] t_month_value = mv.split(" ");
            mean_value += Double.parseDouble(t_month_value[1]);
        }

        return mean_value / mean_lenght;
    }

    @Override
    public double variance(String town, String strng) {
        if (extract(town, strng).equals("-1")) {
            return -1.0;
        }
        String variance_data = extract(town, strng);

        String[] variance_data_splited = variance_data.split(":");
        String[] variance_value_arr = variance_data_splited[1].split(",");

        double variance_lenght = variance_value_arr.length;

        double mean_value = mean(town, strng);
        double d = 0;

        for (String vv : variance_value_arr) {
            String[] t_month_value = vv.split(" ");
            double t_value = Double.parseDouble(t_month_value[1]);
            d += Math.pow((t_value - mean_value), 2);
        }

        return d / variance_lenght;
    }

    public static String extract(String town, String towns) {
        String[] towns_splited = towns.split("\n");


        for (String line : towns_splited) {
            if (line.startsWith(town + ":")) {
                return line;
            }
        }
        return "-1";
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.equals("")) {
            return "";
        }

        if (!resultSheet.contains(toFind + " ")) {
            return toFind + ":This team didn't play!";
        }

        int w = 0;
        int d = 0;
        int l = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;

        String[] resultSheetSplited = resultSheet.split(",");

        for (String rss : resultSheetSplited) {
            if (rss.contains(toFind)) {

                String[] t = rss.split(" ");

                double num_1 = 0;
                double num_2 = 0;

                String name_1 = "";
                String name_2 = "";

                for (String t_rss : t) {
                    if (t_rss.indexOf(".") != -1) {
                        return "Error(float number):" + rss;
                    }
                    try {
                        Integer.parseInt(t_rss);
                        if (num_1 == 0 && num_2 == 0) {
                            num_1 = Integer.parseInt(t_rss);
                        }
                        if (num_1 != 0) {
                            num_2 = Integer.parseInt(t_rss);
                        }
                    } catch (NumberFormatException e) {
                        if (num_1 != 0) {
                            name_2 += " " + t_rss;
                        } else {
                            name_1 += " " + t_rss;
                        }
                    }
                }
                name_1 = name_1.trim();
                name_2 = name_2.trim();

                if (name_1.equals(toFind)) {
                    if (num_1 > num_2) {
                        w += 1;
                        points += 3;
                    } else if (num_1 < num_2) l += 1;
                    else {
                        d += 1;
                        points += 1;
                    }
                    scored += num_1;
                    conceded += num_2;
                } else {
                    if (num_1 < num_2) {
                        w += 1;
                        points += 3;
                    } else if (num_1 > num_2) l += 1;
                    else {
                        d += 1;
                        points += 1;
                    }
                    scored += num_2;
                    conceded += num_1;
                }

            }
        }

        return toFind + ":W=" + w + ";D=" + d + ";L=" + l + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return " ";
        }
        HashMap<String, Integer> list = new HashMap<>();

        Set<String> lettersSet = new HashSet<>(Arrays.asList(lstOf1stLetter));

        for (int i = 0; i < lstOfArt.length; i++) {
            if (lettersSet.contains(lstOfArt[i].substring(0, 1))) {
                String[] t = lstOfArt[i].split(" ");
                String art = t[0].substring(0, 1);
                int books = Integer.parseInt(t[1]);
                list.merge(art, books, Integer::sum);
            }
        }
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            list.merge(lstOf1stLetter[i], 0, Integer::sum);
        }

        String res = "";
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            res += "(" + entry.getKey() + " : " + entry.getValue() + ") - ";
        }

        res = res.substring(0, res.length() - 3);
        res.trim();
        if (res.length() == 0) {
            return " ";
        }
        return res;
    }
}
