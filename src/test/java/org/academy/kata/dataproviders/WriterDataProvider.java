package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {
    @DataProvider(name = "writeArrayDataProvider")
    public Object[][] writeArrayDataProvider() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, "1\n2\n3\n4\n5"},
                {new int[]{}, ""},
                {new int[]{42}, "42"},
                {new int[]{-1, 0, 1}, "-1\n0\n1"},
                {new int[]{100, 200, 300}, "100\n200\n300"},
        };
    }
}
