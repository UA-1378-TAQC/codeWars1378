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
                {"one,two,three,", ",", "^[a-zA-Z]+$", true}
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
                {"--12", 0L, false}
        };
    }
}
