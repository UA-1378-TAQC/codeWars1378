package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}
