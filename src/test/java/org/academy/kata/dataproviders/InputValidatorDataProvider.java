package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {
    @DataProvider(name = "integerArrayDataProvider")
    public Object[][] integerArrayDataProvider() {
        return new Object[][]{
                {"1, 2, 3", ",", 1, true},
                {"1 2 3", "\\s+", 1, true},
        };
    }
}
