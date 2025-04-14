package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class ConsoleReaderDataProvider {

    @DataProvider(name = "intArrayDataProvider")
    public Object[][] intArrayDataProvider() {
        return new Object[][]{
                {",\n1,2,3", new int[]{1, 2, 3}},
                {",\n1f2,3\n,\n1,2,3", new int[]{1, 2, 3}},
                {";\n  5 ; 6 ; 7 ", new int[]{5, 6, 7}},
                {"-\n4-2-1\n-\n5-6-7", new int[]{5, 6, 7}},
                {"|\n42", new int[]{42}},
                {";\n1,2,3\n,\n1,2,3", new int[]{1, 2, 3}},
                {"***\n10***20***30", new int[]{10, 20, 30}},
                {" : \n1 : 2 : 3", new int[]{1, 2, 3}},
        };
    }

    @DataProvider(name = "readFloatDataProvider")
    public Object[][] readFloatDataProvider() {
        return new Object[][]{
                {0.5f, "1.0", 1.0f},
                {1.5f, "2.0", 2.0f},
                {0.1f, "0.25", 0.25f},
        };
    }

    @DataProvider(name="doubleDataProvider")
    protected Object[][] doubleDataProvider() {
        return new Object[][]{
                {0.0, "23.0", 23.0},
                {null, "78.9", 78.9},
                {-17.0, "-11", -11.0},
                {0.0, "0", 0.0},
        };
    }

    @DataProvider(name="doubleIncorrectDataProvider")
    protected Object[][] doubleIncorrectDataProvider() {
        return new Object[][]{
                {0.0, "drt"},
                {8.0, "2.0"},
                {null, "null"}
        };
    }

}
