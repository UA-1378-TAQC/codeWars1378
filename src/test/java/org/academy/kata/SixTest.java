package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.util.Locale;

public class SixTest extends SixDataProvider {

    @BeforeClass
    public void setup(){
        Locale.setDefault(Locale.ROOT);
    }

    @Test(dataProvider = "findNbDataProvider")
    public void testFindNb(long input, long expected, ISix iSix) {
        long actual = iSix.findNb(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "balanceDataProvider")
    public void testBalance(String input, String expected, ISix iSix) {
        String output = iSix.balance(input);
        String updated = output./*replace("\\r","").*/replace("\r", "")/*.replace("\\n", "\n")*/;
        Assert.assertEquals(updated, expected);
    }

    @Test(dataProvider = "dataForF", dataProviderClass = SixDataProvider.class)
    public void testF(int input, int expected) {
        int actual = 1;
        for (int i = 1; i <= input; i++) {
            actual *= i;
        }
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "meanDataProvider")
    public void testMean(String town, String data, double expected, ISix sixImpl) {
        double actual = sixImpl.mean(town, data);
        Assert.assertEquals(actual, expected, 1e-2, String.format("abs(actual - expected) must be <= 1e-2. Expected was %f, but got %f", expected, actual));
    }

    @Test(dataProvider="varianceDataProvider")
    public void testVariance(String town,String strn,double expectedValue,ISix iSix) {
        double actualValue = iSix.variance(town, strn);
        Assert.assertEquals(actualValue, expectedValue,0.000000001);
    }

    @Test(dataProvider = "nbaData", dataProviderClass = SixDataProvider.class)
    public void testNbaCup(String resultSheet, String team, String expected, ISix sixImpl) {
        String actual = sixImpl.nbaCup(resultSheet, team);
        Assert.assertEquals(actual, expected, "Failed for implementation: " + sixImpl.getClass().getSimpleName());
    }

    @Test(dataProvider = "stockSummaryDataProvider")
    public void testStockSummary(String[] lstOfArt, String[] lstOf1stLetter, String expected, ISix implementation) {
        String result = implementation.stockSummary(lstOfArt, lstOf1stLetter);
        Assert.assertEquals(result, expected);
    }
}
