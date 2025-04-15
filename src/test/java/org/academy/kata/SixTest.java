package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.academy.util.Authors;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

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

    @Test(dataProvider = "nbaData", dataProviderClass = SixDataProvider.class)
    public void testNbaCup(String resultSheet, String team, String expected, ISix sixImpl) {
        String actual = sixImpl.nbaCup(resultSheet, team);
        Assert.assertEquals(actual, expected, "Failed for implementation: " + sixImpl.getClass().getSimpleName());
    }

    @Test
    public void testStockSummary() {
    }
}
