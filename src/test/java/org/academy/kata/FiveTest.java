package org.academy.kata;

import org.academy.kata.dataproviders.FiveDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveTest extends FiveDataProvider {

    @Test
    public void testGap() {
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @Test(dataProvider = "solveDataProvider")
    public void testSolve(double m, double expected, IFive iFive) {
        double actual = iFive.solve(m);
        Assert.assertEquals(actual, expected, 1e-12,
                "Expected must be near " + expected + ", but got " + actual);
    }

    @Test
    public void testSmallest() {
    }
}
