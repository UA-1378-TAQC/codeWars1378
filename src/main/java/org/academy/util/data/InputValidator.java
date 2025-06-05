package org.academy.util.data;

import java.math.BigInteger;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;

public class InputValidator {

    public static boolean isValidInt(String prompt, Integer minValue) {
        return isValidNumeric(prompt, minValue, Integer::parseInt);
    }

    public static boolean isValidLong(String prompt, Long minValue) {
        return isValidNumeric(prompt, minValue, Long::parseLong);
    }

    public static boolean isValidFloat(String prompt, Float minValue) {
        return isValidNumeric(prompt, minValue, Float::parseFloat);
    }

    public static boolean isValidDouble(String prompt, Double minValue) {
        return isValidNumeric(prompt, minValue, Double::parseDouble);
    }

    public static boolean isValidBigInteger(String prompt, BigInteger minValue) {
        return isValidNumeric(prompt, minValue, BigInteger::new);
    }

    public static boolean isValidString(String prompt, String regEx) {
        if (prompt == null || prompt.isBlank()) {
            return false;
        }
        return regEx == null || regEx.isBlank() || prompt.matches(regEx);
    }

    public static boolean isValidIntegerArray(String prompt, String delimiter, Integer minValue) {
        return isValidNumberArray(prompt, delimiter, minValue, Integer::parseInt);
    }

    public static boolean isValidDoubleArray(String prompt, String delimiter, Double minValue) {
        return isValidNumberArray(prompt, delimiter, minValue, Double::parseDouble);
    }

    public static boolean isValidStringArray(String prompt, String delimiter, String regExpr) {
        if (prompt == null || prompt.isBlank()) {
            return false;
        }
        String[] array = prompt.trim().split(delimiter);
        for (String elem : array) {
            if (!isValidString(elem.trim(), regExpr)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends Number> boolean isValidNumeric(String prompt, T minValue, Function<String, T> parser) {
        if (prompt == null || prompt.isBlank()) {
            return false;
        }
        try {
            T value = parser.apply(prompt.trim());
            if (minValue != null) {
                return !(value.doubleValue() < minValue.doubleValue());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static <T extends Number> boolean isValidNumberArray(String prompt, String delimiter,
                                                                 T minValue, Function<String, T> parser) {
        if (prompt == null || prompt.isBlank()) {
            return false;
        }
        String safeDelimiter = Pattern.quote(delimiter);
        String[] array = Arrays.stream(prompt.trim().split(safeDelimiter)).filter(str -> !str.isBlank()).toArray(String[]::new);
        if(array.length == 0){
            return false;
        }
        for (String elem : array) {
            try {
                T value = parser.apply(elem.trim());
                if (minValue != null && value.doubleValue() < minValue.doubleValue()) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
