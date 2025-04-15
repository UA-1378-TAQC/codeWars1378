package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class ConsoleReaderDataProvider {
    @DataProvider(name = "longDataProvider")
    public Object[][] longDataProvider() {
        return new Object[][]{
                {0L, "0", 0L},
                {1L, "1", 1L},
                {-1L, "-1", -1L},
                {100L, "100", 100L},
                {Long.MAX_VALUE, String.valueOf(Long.MAX_VALUE), Long.MAX_VALUE},
                {Long.MIN_VALUE, String.valueOf(Long.MIN_VALUE), Long.MIN_VALUE}
        };
    }
}

