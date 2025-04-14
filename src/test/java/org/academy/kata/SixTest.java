package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SixTest {

    @Test
    public void testFindNb() {
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

    @Test(dataProvider = "stockSummaryDataProvider", dataProviderClass = SixDataProvider.class)
    public void testStockSummary(ISix implementation, String[] lstOfArt, String[] lstOf1stLetter, String expected) {
        String result = implementation.stockSummary(lstOfArt, lstOf1stLetter);
        assertEquals(result, expected);
    }
}
