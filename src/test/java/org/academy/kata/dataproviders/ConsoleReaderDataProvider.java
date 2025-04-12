package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

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
}
