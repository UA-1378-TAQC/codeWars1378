package org.academy.kata;


import org.academy.kata.dataproviders.EightDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EightTest extends EightDataProvider {

    @Test
    public void testLiters() {
    }

    @Test(dataProvider = "cuboidDataProvider")
    public void testGetVolumeOfCuboid(double length, double width, double height, double expectedVolume, IEight iEight) {
        double actualVolume = iEight.getVolumeOfCuboid(length, width, height);
        Assert.assertEquals(actualVolume, expectedVolume, 0.001);
    }


    @Test
    public void testMpgToKPM() {
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @Test(dataProvider = "countPositiveSumNegativeDataProvider")
    public void testCountPositivesSumNegatives(int[] input, int[] expected, IEight iEight) {
        int[] actual = iEight.countPositivesSumNegatives(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStringToNumber() {
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }

    @Test
    public void testAm_i_wilson() {
    }
}
