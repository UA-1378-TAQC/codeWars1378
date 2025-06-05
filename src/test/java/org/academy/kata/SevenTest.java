package org.academy.kata;

import org.academy.kata.dataproviders.SevenDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

public class SevenTest extends SevenDataProvider {

    @BeforeClass
    public void setup(){
        Locale.setDefault(Locale.ROOT);
    }

    @Test(dataProvider = "benefactorDataProvider")
    public void testNewAvg(double[] arr, double navg, long expected, ISeven iSeven) {
        long actual = iSeven.newAvg(arr, navg);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "benefactorExceptionDataProvider")
    public void testNewAvgException(double[] arr, double navg, ISeven iSeven) {
        Assert.assertThrows(IllegalArgumentException.class, () -> iSeven.newAvg(arr, navg));
    }

    @Test(dataProvider = "seriesSumDataProvider")
    public void testSeriesSum(int n, String expected, ISeven iSeven) {
        String actual = iSeven.seriesSum(n);
        Assert.assertEquals(actual, expected, "Failed for class: " + iSeven.getClass().getSimpleName());
    }
}
