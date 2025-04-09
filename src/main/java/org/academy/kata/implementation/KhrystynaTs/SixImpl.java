package org.academy.kata.implementation.KhrystynaTs;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import static java.util.stream.Stream.of;
import java.util.stream.DoubleStream;

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
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
