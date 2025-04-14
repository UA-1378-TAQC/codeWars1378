package org.academy.kata;

import org.academy.kata.dataproviders.SevenDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider {

    @Test(dataProvider = "benefactorDataProvider")
    public void testNewAvg(double[] arr, double navg, long expected, ISeven iSeven) {
        long actual = iSeven.newAvg(arr, navg);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "benefactorExceptionDataProvider")
    public void testNewAvgException(double[] arr, double navg, ISeven iSeven) {
        Assert.assertThrows(IllegalArgumentException.class, () -> iSeven.newAvg(arr, navg));
    }

    @Test
    public void testSeriesSum() {
    }
}
