package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class InputValidatorDataProvider {
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
                {"one,two,three,", ",", "^[a-zA-Z]+$", true},
        };
    }
}
