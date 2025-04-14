package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {
    @DataProvider(name = "characterData")
    public Object[][] characterData() {

    @DataProvider(name = "intDataProvider")
    public Object[][] intDataProvider() {
        return new Object[][]{
                {'A', "A"},
                {'m', "m"},
                {'Z', "Z"},
                {'1', "1"},
                {'#', "#"}
                {0, "0"},
                {1, "1"},
                {-42, "-42"},
                {Integer.MAX_VALUE, String.valueOf(Integer.MAX_VALUE)},
                {Integer.MIN_VALUE, String.valueOf(Integer.MIN_VALUE)}
        };
    }

    @DataProvider(name = "doubleArrayDataProvider")
    public Object[][] doubleArrayDataProvider() {
    @DataProvider(name = "longDataProvider")
    public Object[][] longDataProvider() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0}, "1.0\n2.0\n3.0"},
                {new double[]{0.5, -2.3, 4.1}, "0.5\n-2.3\n4.1"},
                {new double[]{}, ""},
                {new double[]{Double.MAX_VALUE}, "1.7976931348623157E308"},
                {new double[]{Double.MIN_VALUE}, "4.9E-324"},
                {new double[]{0.0}, "0.0"},
                {new double[]{Double.NaN}, "NaN"},
                {1L, "1\n"},
                {123L, "123\n"},
                {999999999999L, "999999999999\n"}
        };
    }
}
