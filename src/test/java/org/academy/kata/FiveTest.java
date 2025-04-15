package org.academy.kata;

import org.academy.kata.dataproviders.FiveDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "gapDataProvider")
    public void testGap(int g, long m, long n, Long[] expected, IFive fiveImpl) {
        long[] actual = fiveImpl.gap(g, m, n);

        if (expected == null) {
            Assert.assertNull(actual, "Expected null but got result from " + fiveImpl.getClass().getSimpleName());
        } else {
            Long[] actualBoxed = Arrays.stream(actual).boxed().toArray(Long[]::new);
            Assert.assertEquals(actualBoxed, expected, "Failed for implementation: " + fiveImpl.getClass().getSimpleName());
        }
    }

    @Test(dataProvider = "zerosDataProvider")
    public void testZeros(int input, int expected, IFive iFive) {
        int actual = iFive.zeros(input);
        Assert.assertEquals(actual, expected,
                "Failed for implementation: " + iFive.getClass().getSimpleName() + " with input: " + input);
    }

    @Test(dataProvider = "perimeterDataProvider")
    public void testPerimeter(BigInteger n, BigInteger expected, IFive iFive) {
        BigInteger actual = iFive.perimeter(n);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "solveDataProvider")
    public void testSolve(double m, double expected, IFive iFive) {
        double actual = iFive.solve(m);
        Assert.assertEquals(actual, expected, 1e-12);
    }

    @Test
    public void testSmallest() {
        
    }
}
