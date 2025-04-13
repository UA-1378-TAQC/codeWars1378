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

}
