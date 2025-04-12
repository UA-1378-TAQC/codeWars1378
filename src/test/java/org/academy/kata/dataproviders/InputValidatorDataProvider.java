package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {
    @DataProvider(name = "doubleDataProvider")
    public static Object[][] doubleDataProvider() {
        return new Object[][]{
                {"0", 0.0, true},
                {"1.23", 0.0, true},
                {"-4.56", -5.0, true},
                {"3.1415", 3.0, true},
                {"2.71828", 2.0, true},
                {"1e3", 0.0, true},
        };
    }
}
