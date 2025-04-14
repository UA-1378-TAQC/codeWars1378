package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class ConsoleReaderDataProvider {
    @DataProvider(name = "readFloatDataProvider")
    public Object[][] readFloatDataProvider() {
        return new Object[][]{
                {0.5f, "1.0", 1.0f},
                {1.5f, "2.0", 2.0f},
                {0.1f, "0.25", 0.25f},
        };
    }

    @DataProvider(name = "readDoubleArrayDataProvider")
    public Object[][] readDoubleArrayDataProvider() {
        return new Object[][]{
                {"\n,\n1.1,2.2,3.3\n", 1.0, new double[]{1.1, 2.2, 3.3}},
                {"\n;\n4.5;5.6;6.7\n", 4.0, new double[]{4.5, 5.6, 6.7}},
                {"\n|\n7.8|8.9|9.0\n", 7.5, new double[]{7.8, 8.9, 9.0}}
        };
    }
}
