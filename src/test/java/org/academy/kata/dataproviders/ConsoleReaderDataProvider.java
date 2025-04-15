package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;
import java.math.BigInteger;

public class ConsoleReaderDataProvider{
    @DataProvider(name = "readStringDataProvider")
    protected Object[][] readStringDataProvider(){
        Object[][] data = {
                {new String[]{"str"}, null, "str"},
                {new String[]{"str", "oneMore"}, null, "str"},
                {new String[]{"", "str"}, null, "str"},
                {new String[]{"   ", "str"}, null, "str"},
                {new String[]{"", "   ", "str"}, null, "str"},
                {new String[]{"   ", "", "str"}, null, "str"},
                {new String[]{"str"}, "", "str"},
                {new String[]{"str", "oneMore"}, "", "str"},
                {new String[]{"", "str"}, "", "str"},
                {new String[]{"   ", "str"}, "", "str"},
                {new String[]{"", "   ", "str"}, "", "str"},
                {new String[]{"   ", "", "str"}, "", "str"},
                {new String[]{"str1_"}, "\\w+", "str1_"},
                {new String[]{"str1_", "oneMore"}, "\\w+", "str1_"},
                {new String[]{"str1_!", "oneMore"}, "\\w+", "oneMore"},
                {new String[]{"", "s1t_r"}, "\\w+", "s1t_r"},
                {new String[]{"   ", "1_str"}, "\\w+", "1_str"},
                {new String[]{"", "   ", "_1str"}, "\\w+", "_1str"},
                {new String[]{"   ", "", "__str11"}, "\\w+", "__str11"}
        };
        return data;
    }

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
}
