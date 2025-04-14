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
}
