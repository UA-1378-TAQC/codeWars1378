package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class ConsoleReaderDataProvider {

    @DataProvider(name = "bigIntegerDataProvider")
    public Object[][] bigIntegerDataProvider() {
        return new Object[][]{
                {BigInteger.ZERO, "15", BigInteger.valueOf(15)},
                {BigInteger.ZERO, "0", BigInteger.ZERO},
                {BigInteger.ZERO, "1", BigInteger.ONE},
                {BigInteger.ZERO, "100", BigInteger.valueOf(100)}

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
