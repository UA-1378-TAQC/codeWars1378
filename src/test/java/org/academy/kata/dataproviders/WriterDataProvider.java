package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {
    @DataProvider(name = "doubleDataProvider")
    public static Object[][] doubleDataProvider() {
        return new Object[][]{
                {0.0, "0.0"},
                {1.23, "1.23"},
                {-4.56, "-4.56"},
                {Double.MAX_VALUE, "1.7976931348623157E308"},
                {Double.MIN_VALUE, "5.0E-324"},
                {Math.PI, "3.141592653589793"}
        };
    }
}
