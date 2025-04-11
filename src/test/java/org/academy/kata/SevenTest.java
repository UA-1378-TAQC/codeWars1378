package org.academy.kata;

import org.academy.kata.dataproviders.SevenDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider {

    @Test
    public void testNewAvg() {
    }

    @Test(dataProvider = "seriesSumDataProvider")
    public void testSeriesSum(int n, String expected, ISeven iSeven) {
        String actual = iSeven.seriesSum(n);
        Assert.assertEquals(actual, expected, "Failed for class: " + iSeven.getClass().getSimpleName());
    }
}
