package org.academy.kata.implementation.DMSlobodianiuk;

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
        if(extract(town,strng).equals("-1")) return -1.0;

        String mean_data = extract(town,strng);

        // String mean_data_splited[] = mean_data.split(":");

        // String month_value[] = mean_data_splited[1].split(",");

        String[] mean_data_splited = mean_data.split(":");
        String[] month_value = mean_data_splited[1].split(",");

        double mean_lenght = month_value.length;
        double mean_value = 0;

        for(String mv: month_value){
            String t_month_value[] = mv.split(" ");
            mean_value += Double.parseDouble(t_month_value[1]);
        }

        return mean_value/mean_lenght;
    }

    @Override
    public double variance(String town, String strng) {
        if(extract(town,strn).equals("-1")){
            return -1.0;
        }
        String variance_data = extract(town,strn);

        // String variance_data_splited[] = variance_data.split(":");
        // String variance_value_arr[] = variance_data_splited[1].split(",");

        String[] variance_data_splited = variance_data.split(":");
        String[] variance_value_arr = variance_data_splited[1].split(",");

        double variance_lenght = variance_value_arr.length;

        double mean_value = mean(town,strn);
        double d = 0;

        for(String vv: variance_value_arr){
            String t_month_value[] = vv.split(" ");
            double t_value = Double.parseDouble(t_month_value[1]);
            // d += (t_value - mean_value) * (t_value - mean_value);
            d += Math.pow((t_value - mean_value),2);
        }

        return d/variance_lenght;
    }
    public static String extract(String town,String towns){
        String towns_splited[] = towns.split("\n");


        for (String line : towns_splited) {
            if (line.startsWith(town + ":")) {
                return line;
            }
        }
        return "-1";
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
