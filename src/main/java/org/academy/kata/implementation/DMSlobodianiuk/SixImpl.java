package org.academy.kata.implementation.DMSlobodianiuk;

import org.academy.kata.Base;
import org.academy.kata.ISix;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        if(m > Math.pow(2,63)-1)
        {
            return -1;
        }

        long k = 0;
        long n = 0;

        while(k < m){
            k += n * n * n;

            if(k == m){
                return n;
            }
            n += 1;
        }

        return -1;
    }

    @Override
    public String balance(String book) {
        String balance[] = book.split("\n");
        

        for(int i = 0;i<balance.length;i++)
        {
            balance[i] = balance[i].replaceAll("[/{!@#$%^&*-+=:;,`?}]","");
            balance[i] = balance[i].replaceAll(" +"," ");
        }

        // for(String word:balance){
        //     System.out.println(word);
        // }

        double original_Balance = Double.parseDouble(balance[0]);
        String res = "Original Balance: " + original_Balance + "0\\r\\n";

        double total_Expense = 0;

        for(int i = 1;i<balance.length;i++)
        {
            
            String t[] = balance[i].split(" ");
            // System.out.println(Arrays.toString(t));
            String check_Number = t[0];
            String catagory = t[1];
            double check_Amount = Double.parseDouble(t[2]);
            total_Expense += check_Amount;
            double final_Balance = Math.round((original_Balance - check_Amount)*100.0)/100.0;
            original_Balance -= check_Amount;
            

        
            res += check_Number + " " + catagory + " " + length_Check(check_Amount) + " " + "Balance " + length_Check(final_Balance) + "\\r\\n";

        }
        // total_Expense = Math.round(total_Expense*100.0)/100.0;
        double avarage_Expense = Math.round(total_Expense/(balance.length-1)*100.0)/100.0;

        res += "Total expense  " + length_Check(total_Expense) + "\\r\\nAverage expense  " + length_Check(avarage_Expense);
        // System.out.println("\n"+ res);
        return res;
    }

    public static String length_Check(double t_value){
        String t_Value_String =  String.valueOf(t_value);

        String t_Value_String_substring = t_Value_String.substring(t_Value_String.indexOf('.')+1);

        if(t_Value_String_substring.length() == 0){
            t_Value_String += "00";
        }
        else if(t_Value_String_substring.length() == 1){
            t_Value_String += "0";
        }
        else if(t_Value_String_substring.length() == 2)
        {
            return t_Value_String;
        }
        else if(t_Value_String_substring.length() > 2){
            t_Value_String = length_Check((Math.round(t_value*100.0))/100.0);
        }
        return t_Value_String;
    }

    @Override
    public double f(double x) {
        return x/(Math.sqrt(1+x)+1);
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
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
