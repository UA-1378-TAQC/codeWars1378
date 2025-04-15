package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterStringDataProvider {

    @DataProvider(name = "stringData")
    public Object[][] stringData() {
        return new Object[][]{
                {"Hello, world!", "Hello, world!"},
                {"", ""},
                {"12345", "12345"},
                {"Test case with spaces", "Test case with spaces"},
                {"Symbols: @#$%^&*", "Symbols: @#$%^&*"},
                {"Multiline\ntext", "Multiline\ntext"},
                {"Привіт", "Привіт"}
        };
    }
}
