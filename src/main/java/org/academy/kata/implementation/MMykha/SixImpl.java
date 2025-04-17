package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.ISix;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (bigN.remainder(BigDecimal.ONE).equals(BigDecimal.ZERO) && bigN.signum() == 1) return bigN.longValue();
        else return -1;
    }

    @Override
    public String balance(String book) {
        Pattern pattern = Pattern.compile("(\\d*\\.\\d*)\\W*(\\d*)\\W(\\w*)\\W*");
        Matcher matcher = pattern.matcher(book);

        ArrayList<String> checkNumber = new ArrayList<String>();
        ArrayList<String> category = new ArrayList<String>();
        ArrayList<String> amount = new ArrayList<String>();

        int endIndex = book.length();
        boolean isAnyLeft = true;

        while (matcher.find()) {
            amount.add(matcher.group(1));
            checkNumber.add(matcher.group(2));
            category.add(matcher.group(3));
            endIndex = matcher.end();
            if (matcher.group(2).isBlank()) {
                isAnyLeft = false;
            }
        }
        if (isAnyLeft) amount.add(book.substring(endIndex));

        double balance = Double.parseDouble(amount.get(0));
        StringBuilder result = new StringBuilder(String.format("Original Balance: %.2f\r\\n", balance));

        for (int i = 1; i < amount.size(); i++) {
            balance -= Double.parseDouble(amount.get(i));
            result.append(checkNumber.get(i - 1))
                    .append(" ").append(category.get(i - 1)).append(" ")
                    .append(amount.get(i))
                    .append(String.format(" Balance %.2f\r\\n", balance));
        }
        double totalExpense = Double.parseDouble(amount.get(0)) - balance;
        double avr = totalExpense / (amount.size() - 1);

        result.append(String.format("Total expense  %.2f\r\\n", totalExpense))
                .append(String.format("Average expense  %.2f", avr));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        double[] values = this.getValues(town, strng);
        if (values == null) return -1;
        double sum = Arrays.stream(values).sum();
        return sum / 12;
    }

    @Override
    public double variance(String town, String strng) {
        double[] values = this.getValues(town, strng);
        if (values == null) return -1;
        double mean = this.mean(town, strng);
        double sum = Arrays.stream(values).map(el -> Math.pow((el - mean), 2)).sum();
        return sum / 12;
    }

    private double[] getValues(String town, String str) {
        if (!Pattern.compile(town + ":").matcher(str).find()) return null;
        double[] arr = new double[12];
        String regex = String.format("%s\\W((\\w*\\s\\d*\\.\\d*\\W?||\\s)*)", town);
        Pattern patternByTown = Pattern.compile(regex);
        Matcher matchByTown = patternByTown.matcher(str);
        while (matchByTown.find()) str = matchByTown.group(1);
        Pattern valuesPattern = Pattern.compile("\\d*\\.\\d");
        Matcher matchValues = valuesPattern.matcher(str);
        int i = 0;
        while (matchValues.find()) {
            arr[i] = Double.parseDouble(matchValues.group());
            i++;
        }
        return arr;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.isEmpty()) return "";
        if (!Pattern.compile(toFind + "\\s").matcher(resultSheet).find())
            return String.format("%s:This team didn't play!", toFind);

        Pattern nbaTeamPattern = Pattern.compile(String.format("((\\w*\\s)*((\\d*)(\\.\\d*)?)\\s)?%s\\s((\\d*)(\\.\\d*)?)(\\s(\\w*\\s)*((\\d*)(\\.\\d*)?))?", toFind));
        Matcher nbaTeamMather = nbaTeamPattern.matcher(resultSheet);

        int wins = 0;
        int draws = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;

        while (nbaTeamMather.find()) {
            if (nbaTeamMather.group(3) != null && !this.isIntegerNumber(nbaTeamMather.group(3))) {
                return String.format("Error(float number):%s", nbaTeamMather.group());
            }
            if (nbaTeamMather.group(6) != null && !this.isIntegerNumber(nbaTeamMather.group(6))) {
                return String.format("Error(float number):%s", nbaTeamMather.group());
            }
            if (nbaTeamMather.group(11) != null && !this.isIntegerNumber(nbaTeamMather.group(11))) {
                return String.format("Error(float number):%s", nbaTeamMather.group());
            }

            int value = Integer.parseInt(nbaTeamMather.group(6));
            int valueOfRival = Integer.parseInt((nbaTeamMather.group(3) == null) ? nbaTeamMather.group(11) : nbaTeamMather.group(3));
            int diff = value - valueOfRival;

            if (diff < 0) lost++;
            else if (diff > 0) wins++;
            else draws++;

            scored += value;
            conceded += valueOfRival;
        }
        int totalPoint = wins * 3 + draws;
        return String.format("%s:W=%d;"
                + "D=%d;"
                + "L=%d;"
                + "Scored=%d;"
                + "Conceded=%d;"
                + "Points=%d", toFind, wins, draws, lost, scored, conceded, totalPoint);
    }

    private boolean isIntegerNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        int sum = 0;
        String result = "";
        if (lstOfArt.length == 0) return "";
        Pattern digitPattern = Pattern.compile("\\s(\\d*)");
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            final int index = i;
            sum = Arrays.stream(lstOfArt).filter(el -> el.substring(0, 1).equals(lstOf1stLetter[index]))
                    .map(n -> {
                        Matcher digitMatcher = digitPattern.matcher(n);
                        digitMatcher.find();
                        return digitMatcher.group(1);
                    })
                    .mapToInt(Integer::parseInt).sum();
            if (i > 0) result = result.concat(" - ");
            result = result.concat(String.format("(%s : %d)", lstOf1stLetter[i], sum));
        }
        return result;
    }
}
