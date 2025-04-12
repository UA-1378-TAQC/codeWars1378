package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {
    @DataProvider(name = "characterData")
    public Object[][] characterData() {
        return new Object[][]{
                {'A', "A"},
                {'m', "m"},
                {'Z', "Z"},
                {'1', "1"},
                {'#', "#"}
        };
    }

    @DataProvider(name = "doubleArrayDataProvider")
    public Object[][] doubleArrayDataProvider() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0}, "1.0\n2.0\n3.0"},
                {new double[]{0.5, -2.3, 4.1}, "0.5\n-2.3\n4.1"},
                {new double[]{}, ""},
                {new double[]{Double.MAX_VALUE}, "1.7976931348623157E308"},
                {new double[]{Double.MIN_VALUE}, "4.9E-324"},
                {new double[]{0.0}, "0.0"},
                {new double[]{Double.NaN}, "NaN"},
        };
    }
}
