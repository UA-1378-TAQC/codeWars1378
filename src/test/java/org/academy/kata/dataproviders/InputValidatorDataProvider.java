package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {

    @DataProvider(name = "isValidIntDataProvider")
    public Object[][] isValidIntDataProvider() {
        return new Object[][] {
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

    @DataProvider(name = "integerArrayDataProvider")
    public Object[][] integerArrayDataProvider() {
        return new Object[][]{
                {"1, 2, 3", ",", 1, true},
                {"1 2 3", "\\s+", 1, true},
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
                {"--12", 0L, false},

        };
    }
}
