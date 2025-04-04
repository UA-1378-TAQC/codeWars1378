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
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if(toFind.equals("")){
            return "";
        }
        
        if(!resultSheet.contains(toFind + " ")){
            return toFind + ":This team didn't play!";
        }

        int w = 0;
        int d = 0;
        int l = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;

        String resultSheetSplited[] = resultSheet.split(",");

        for(String rss: resultSheetSplited){
            // System.out.println(rss);
            if(rss.contains(toFind)){
                // System.out.println("\n"+rss);
                String t[] = rss.split(" ");
                
                double num_1 = 0;
                double num_2 = 0;

                String name_1 = "";
                String name_2 = "";

                for(String t_rss: t){

                    // try{
                    //     Double.parseDouble(t_rss);
                    // }
                    // catch(NumberFormatException e){
                    //     return "Error(float number):" + rss;
                    // }
                    if(t_rss.indexOf(".")!=-1){
                        return "Error(float number):" + rss;
                    }
                    try {
                        Integer.parseInt(t_rss);
                        if(num_1 == 0 && num_2 == 0){
                            num_1 = Integer.parseInt(t_rss);
                        }
                        if(num_1 != 0){
                            num_2 = Integer.parseInt(t_rss);
                        }
                    }
                    catch(NumberFormatException e){
                        if(num_1 != 0){
                            name_2 += " " + t_rss;
                        }
                        else{
                            name_1 += " " + t_rss;
                        }
                    }
                }
                name_1 = name_1.trim();
                name_2 = name_2.trim();
                // System.out.println(name_1 + "|"+num_1+ "|"+name_2+"|" + num_2);

                if(name_1.equals(toFind)){
                    if(num_1 > num_2){ w += 1; points += 3;}
                    else if(num_1 < num_2)l += 1;
                    else {d += 1;points += 1;}
                    scored += num_1;
                    conceded += num_2;
                }
                else{
                    if(num_1 < num_2){ w += 1; points += 3;}
                    else if(num_1 > num_2) l += 1;
                    else {d += 1;points += 1;}
                    scored += num_2;
                    conceded += num_1;
                }

            }
        }

        return toFind + ":W=" + w + ";D=" + d + ";L=" + l + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
