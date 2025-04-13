package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {
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
}
