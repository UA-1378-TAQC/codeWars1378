package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {

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
