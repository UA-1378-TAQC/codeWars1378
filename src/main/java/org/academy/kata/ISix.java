package org.academy.kata;

import java.util.List;

public interface ISix {
    long findNb(long m);

    String balance(String book);

    double f(double x);

    double mean(String town, String strng);

    double variance(String town, String strng);

    String nbaCup(String resultSheet, String toFind);

    String stockSummary(String[] lstOfArt, String[] lstOf1stLetter);

    List<String> getTasks();
}
