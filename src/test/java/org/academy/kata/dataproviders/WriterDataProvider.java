package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {

    @DataProvider(name = "floatDataProvider")
    public static Object[][] floatDataProvider() {
        return new Object[][]{
                {0.0f, "0.0"},
                {1.23f, "1.23"},
                {-4.56f, "-4.56"},
                {Float.MAX_VALUE, String.valueOf(Float.MAX_VALUE)},
                {Float.MIN_VALUE, String.valueOf(Float.MIN_VALUE)},
                {3.14159f, "3.14159"}
        };
    }
}
