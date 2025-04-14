package org.academy.kata;


import org.academy.kata.dataproviders.EightDataProvider;
import org.testng.Assert;
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

    @Test
    public void testCountPositivesSumNegatives() {
    }

    @Test
    public void testStringToNumber() {
    }

    @Test(dataProvider = "twoDecimalPlacesDataProvider")
    public void testTwoDecimalPlaces(double input, double expected, IEight iEight) {
        double actual = iEight.TwoDecimalPlaces(input);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testDivisibleBy() {
    }

    @Test
    public void testAm_i_wilson() {
    }
}
