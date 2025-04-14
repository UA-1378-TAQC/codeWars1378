package org.academy.kata;

import org.academy.kata.dataproviders.SixDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SixTest {

    @Test
    public void testFindNb() {
    }

    @Test
    public void testBalance() {
    }

    @Test(dataProvider = "dataForF", dataProviderClass = SixDataProvider.class)
    public void testF(int input, int expected) {
        int actual = 1;
        for (int i = 1; i <= input; i++) {
            actual *= i;
        }
        assertEquals(actual, expected);
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
