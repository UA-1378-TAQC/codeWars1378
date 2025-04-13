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

    @DataProvider(name = "stringArrayDataProvider")
    public Object[][] stringArrayDataProvider() {
        return new Object[][]{
                {",", "a,b,c", null, new String[]{"a", "b", "c"}},
                {",", "  a , b ,  c  ", null, new String[]{"a", "b", "c"}},
                {" ", "hello world", null, new String[]{"hello", "world"}},
                {";", "test;data;provider", null, new String[]{"test", "data", "provider"}},
                {",", "only", null, new String[]{"only"}},
                {",", "a,b,c", "[a-z]", new String[]{"a", "b", "c"}},
                {"\\|", "A|B|C", "[A-Z]", new String[]{"A", "B", "C"}}
        };
    }

}
