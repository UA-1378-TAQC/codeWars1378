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

    @DataProvider(name = "testWritePrompt")
    public Object[][] testWritePrompt(){
        return new Object[][]{
            {"Enter length.","Enter length."},
            {"Enter height.","Enter height."},
            {"Enter widths.","Enter widths."},
            {"Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\n","\"Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\\n" + //
                                "\""}
        };
    };
}
