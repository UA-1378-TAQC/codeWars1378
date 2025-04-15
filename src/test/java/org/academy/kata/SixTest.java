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

    @Test(dataProvider = "meanDataProvider")
    public void testMean(String town, String data, double expected, ISix sixImpl) {
        double actual = sixImpl.mean(town, data);
        Assert.assertEquals(actual, expected, 1e-2,
                String.format("abs(actual - expected) must be <= 1e-2. Expected was %f, but got %f", expected, actual));
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
