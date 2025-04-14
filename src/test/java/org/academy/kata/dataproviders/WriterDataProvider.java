package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {
    @DataProvider(name = "longDataProvider")
    public Object[][] longDataProvider() {
        return new Object[][]{
                {1L, "1\n"},
                {123L, "123\n"},
                {999999999999L, "999999999999\n"}
        };
    }
}
