package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {
    @DataProvider(name="isValidStringDataProvider")
    public Object[][] isValidStringDataProvider() {
        return new Object[][] {
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
}
