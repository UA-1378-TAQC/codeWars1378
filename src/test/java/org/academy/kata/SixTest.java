package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;

public class SixTest extends SixDataProvider {


    @Test(dataProvider = "findNbDataProvider")
    public void testFindNb(long input, long expected, ISix iSix) {
        long actual = iSix.findNb(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBalance() {
    }

    @Test
    public void testF() {
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
    }

    @Test
    public void testNbaCup() {
    }

    @Test(dataProvider = "stockSummaryDataProvider")
    public void testStockSummary(String[] lstOfArt, String[] lstOf1stLetter, String expected, ISix implementation) {
        String result = implementation.stockSummary(lstOfArt, lstOf1stLetter);
        assertEquals(result, expected);
    }


}
