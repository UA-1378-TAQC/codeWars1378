package org.academy.kata;


import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SixTest extends SixDataProvider{

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

    @Test(dataProvider="varianceDataProvider")
    public void testVariance(String town,String strn,double expectedValue,ISix iSix) {
        double actualValue = iSix.variance(town, strn);
        Assert.assertEquals(actualValue, expectedValue,0.000000001);
    }

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}
