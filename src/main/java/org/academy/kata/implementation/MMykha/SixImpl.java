package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISix;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SixImpl extends Base implements ISix {
    @Override
    public long findNb(long m) {
        BigDecimal bigN = BigDecimal.valueOf(m)
                .sqrt(MathContext.DECIMAL128)
                .multiply(BigDecimal.valueOf(8))
                .add(BigDecimal.ONE)
                .sqrt(MathContext.DECIMAL128)
                .subtract(BigDecimal.ONE)
                .divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        if(bigN.remainder(BigDecimal.ONE).equals(BigDecimal.ZERO) && bigN.signum()==1) return bigN.longValue();
        else return -1;
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
        return "";
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return "";
    }
}
