package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class ConsoleWriterDataProvider {
    @DataProvider(name = "writeResultObjectDataProvider")
    protected Object[][] writeResultObjectDataProvider(){
        Object[][] data = new Object[][]{
                {101, "101"},
                {3.99999, "3.99999"},
                {3.99999f, "3.99999"},
                {47L, "47"},
                {'c', "c"},
                {"%", "%"},
                {"hello", "hello"},
                {false, "false"},
                {List.of(1, 2, 3), "[1, 2, 3]"},
                {new ArrayList<>(), "[]"}
        };
        return data;
    }
}
