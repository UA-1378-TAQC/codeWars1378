package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class InputValidatorDataProvider {
    @DataProvider(name = "isValidStringDataProvider")
    public Object[][] isValidStringDataProvider() {
        return new Object[][]{
                {"", "", false},
                {"     ", "", false},
                {"\n", "", false},
                {"vvv", "", true},
                {"fff", "    ", true},
                {"rrr", null, true},
                {null, null, false},
                {null, "", false},
                {"3", "\\d", true},
                {"45 _", "(\\d*)\\s_?", true},
                {"45 _hhh", "(\\d*)\\s_?", false}
        };
    }

    @DataProvider(name = "isValidStringArrayDataProvider")
    protected Object[][] isValidStringArrayDataProvider() {
        return new Object[][]{
                {"abc,def,ghi", ",", "^[a-zA-Z]+$", true},
                {" abc , def , ghi ", ",", "^[a-zA-Z]+$", true},
                {"abc,123,ghi", ",", "^[a-zA-Z]+$", false},
                {"", ",", "^[a-zA-Z]+$", false},
                {null, ",", "^[a-zA-Z]+$", false},
                {"abc|def|ghi", "\\|", "^[a-zA-Z]+$", true},
                {"abc,,ghi", ",", "^[a-zA-Z]+$", false},
                {"123,456,789", ",", "^\\d+$", true},
                {"123, 45a ,789", ",", "^\\d+$", false},
                {"onlyOne", ",", "^[a-zA-Z]+$", true},
                {"one,two,three,", ",", "^[a-zA-Z]+$", true}
        };
    }

    @DataProvider(name = "isValidDoubleArrayDataProvider")
    protected Object[][] isValidDoubleArrayDataProvider() {
        Object[][] data = new Object[][]{
                {"1, 2, 3", ",", 0.0, true},
                {"", "", null, false},
                {"    ", ",", null, false},
                {",", ",", null, false},
                {"23", ",", null, true},
                {"23", ",", 23.0000001, false},
                {"23", ",", 22.9999999, true},
                {"23, 70, 12, 1, 0, 12, 1", ",", 0.0, true},
                {"237212", "", 0.0, true},
                {"237212", "", 2.0, false},
                {"2.5 5.88 52.3 6.6", ".", 2.0, true},
                {"2.5 5.88 52.3 6.6", " ", 2.0, true},
                {"2.5 5.88 52.3 6.6", "", 2.0, false},
                {"2.55.8852.36.6", ".", 2.0, true},
                {"2,55 | 5,88 | 52,3 || 6,6", "|", 2.0, false},
                {"2.55 | 5.88 | 52.3 || 6.6", ",", 2.0, false},
                {"2.55 | 5.88 | 52.3 || 6.6", ".", 2.0, false},
                {"2.55 | 5.88 | 52.3 || 6.6", "|", 2.0, true},
                {"23, 70, 12, -1, 12, 1", ",", 0.0, false},
                {"-10", ",", -10.0000001, true},
                {"-10", ",", -9.9999999, false},
                {"21314111", "1", null, true},
                {"21314151", "1", null, true},
        };
        return data;
    }

    @DataProvider(name = "isValidIntDataProvider")
    public Object[][] isValidIntDataProvider() {
        return new Object[][]{
                {"123", 100, true},
                {"99", 100, false},
                {"-1", -5, true},
                {"-10", 0, false},
                {"0", 0, true},
                {"2147483647", 0, true},  // max int
                {"2147483648", 0, false}, // overflow
                {"-2147483648", -2147483648, true}, // min int
                {"-2147483649", -2147483648, false}, // underflow
                {"abc", 0, false},
                {"", 0, false},
                {"    ", 0, false},
                {"12.3", 0, false},
                {"--12", 0, false},
        };
    }

    @DataProvider(name = "floatDataProvider")
    public static Object[][] floatDataProvider() {
        return new Object[][]{
                {"0", 0.0f, true},
                {"1.23", 1.0f, true},
                {"-4.56", -5.0f, true},
                {"3.1415", 3.0f, true},
                {"2.71828", 2.0f, true},
                {"1e2", 0.0f, true},
                {"", 0.0f, false},
                {"abc", 0.0f, false},
                {null, 0.0f, false}
        };
    }

    @DataProvider(name = "doubleDataProvider")
    public static Object[][] doubleDataProvider() {
        return new Object[][]{
                {"3.14", 0.0, true},
                {"0.0", 0.0, true},
                {"-1.5", -2.0, true},
                {"100", 99.99, true},
                {"-3.14", 0.0, false},
                {"0.0", 1.0, false},
                {"99.99", 100.0, false},
                {"abc", 0.0, false},
                {"", 0.0, false},
                {" ", 0.0, false},
                {null, 0.0, false},
                {"1.7976931348623157E308", 0.0, true},
                {"-1.7976931348623157E308", 0.0, false},
        };
    }


    @DataProvider(name = "integerArrayDataProvider")
    public Object[][] integerArrayDataProvider() {
        return new Object[][]{
                {"1, 2, 3", ",", 1, true},
                {"1 2 3", " ", 1, true},
        };
    }

    @DataProvider(name = "isValidLongDataProvider")
    public Object[][] isValidLongDataProvider() {
        return new Object[][]{
                {"123", 100L, true},
                {"99", 100L, false},
                {"-1", -5L, true},
                {"-10", 0L, false},
                {"0", 0L, true},
                {"9223372036854775807", 0L, true},  // max long
                {"9223372036854775808", 0L, false}, // overflow
                {"-9223372036854775808", -9223372036854775808L, true}, // min long
                {"-9223372036854775809", -9223372036854775808L, false}, // underflow
                {"abc", 0L, false},
                {"", 0L, false},
                {"    ", 0L, false},
                {"12.3", 0L, false},
                {"--12", 0L, false}
        };
    }
    @DataProvider(name = "bigIntegerDataProvider")
    public static Object[][] bigIntegerDataProvider() {
        return new Object[][]{
                {"0", new BigInteger("0"), true},
                {"123", new BigInteger("123"), true},
                {"-456", new BigInteger("-456"), true},
                {"789000000000000000000", new BigInteger("789000000000000000000"), true},
                {"+42", new BigInteger("42"), true},
                {"  10  ", new BigInteger("10"), true}, // з пробілами
                {"", BigInteger.ZERO, false},
                {"abc", BigInteger.ZERO, false},
                {"12.34", BigInteger.ZERO, false}, // десяткове — невалідне для BigInteger
                {"1e3", BigInteger.ZERO, false},   // експоненціальне — теж ні
                {null, BigInteger.ZERO, false}
        };
    }

}
