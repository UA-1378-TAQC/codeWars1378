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

    @DataProvider(name = "testWriteArray2String")
    public Object[][] testWriteArray2String(){
        return new Object[][]{
            {new String[]{"0ABAR 20", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},new String[]{"0ABAR 20", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}},
            {new String[]{"Hello","World","Hi"},new String[]{"Hello","World","Hi"}},
            {new String[]{"I","want","to","all","tests","goes","well"},new String[]{"I","want","to","all","tests","goes","well"}}
        };
    }
}
