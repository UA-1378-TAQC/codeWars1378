package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class ConsoleReaderDataProvider {

    @DataProvider(name = "bigIntegerDataProvider")
    public Object[][] bigIntegerDataProvider() {
        return new Object[][]{
                {BigInteger.TEN, "15", BigInteger.valueOf(15)},
                {BigInteger.ZERO, "0", BigInteger.valueOf(0)},
                {BigInteger.ONE, "1", BigInteger.ONE},
                {BigInteger.valueOf(100), "100", BigInteger.valueOf(100)}

        };
    }

}
