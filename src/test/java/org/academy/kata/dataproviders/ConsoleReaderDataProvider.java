package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class ConsoleReaderDataProvider{

    @DataProvider(name = "readIntDataProvider")
    public Object[][] readIntDataProvider() {
        return new Object[][]{
                {0, "0", 0},
                {1, "1", 1},
                {-1, "-1", -1},
                {42, "42", 42},
                {Integer.MAX_VALUE, String.valueOf(Integer.MAX_VALUE), Integer.MAX_VALUE},
                {Integer.MIN_VALUE, String.valueOf(Integer.MIN_VALUE), Integer.MIN_VALUE}
        };
    }

}
