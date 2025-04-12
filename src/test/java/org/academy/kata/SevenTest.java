package org.academy.kata;

import org.academy.kata.dataproviders.SevenDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider {

    @Test(dataProvider = "benefactorDataProvider")
    public void testNewAvg(double[] arr, double navg, String expected, ISeven iSeven) {
        if(expected.equals("exception")){
            Assert.assertThrows(IllegalArgumentException.class, () -> iSeven.newAvg(arr, navg));
        }else{
            long expectedResult = Long.parseLong(expected);
            long actual = iSeven.newAvg(arr, navg);
            Assert.assertEquals(actual, expectedResult);
        }
    }

    @Test
    public void testSeriesSum() {
    }
}
