package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SixTest extends SixDataProvider {

    @Test
    public void testFindNb() {
    }

    @Test(dataProvider = "balanceDataProvider")
    public void testBalance(String input, String expected, ISix iSix) {
        String output = iSix.balance(input);

        Assert.assertEquals(output,expected);
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

    @Test
    public void testStockSummary() {
    }
}
