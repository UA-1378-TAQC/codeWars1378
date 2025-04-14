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
                {new int[]{100, 200, 300}, "100\n200\n300"}
        };
    }

    @DataProvider(name = "intDataProvider")
    public Object[][] intDataProvider() {
        return new Object[][]{
                {0, "0"},
                {1, "1"},
                {-42, "-42"},
                {Integer.MAX_VALUE, String.valueOf(Integer.MAX_VALUE)},
                {Integer.MIN_VALUE, String.valueOf(Integer.MIN_VALUE)}
        };
    }

    @DataProvider(name = "longDataProvider")
    public Object[][] longDataProvider() {
        return new Object[][]{
                {1L, "1\n"},
                {123L, "123\n"},
                {999999999999L, "999999999999\n"}
        };
    }
}
