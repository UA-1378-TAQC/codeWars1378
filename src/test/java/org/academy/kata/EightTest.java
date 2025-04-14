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

    @Test(dataProvider = "squareRootDataProvider")
    public void testSquareOrSquareRoot(int[] input, int[] expected, IEight iEight) {
        int[] actual = iEight.squareOrSquareRoot(input);
        Assert.assertEquals(actual, expected, "Failed for class: " + iEight.getClass().getSimpleName());
    }

    @Test(dataProvider = "countPositiveSumNegativeDataProvider")
    public void testCountPositivesSumNegatives(int[] input, int[] expected, IEight iEight) {
        int[] actual = iEight.countPositivesSumNegatives(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "stringToNumberDataProvider")
    public void testStringToNumber(String string, int integer, IEight iEight) {
        int value = iEight.stringToNumber(string);
        Assert.assertEquals(value, integer);
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test(dataProvider = "divisibleByDataProvider")
    public void testDivisibleBy(int[] inputNumbers, int divider, int[] expectedResult, IEight iEight) {
        int[] actualResult = iEight.divisibleBy(inputNumbers, divider);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAm_i_wilson() {
    }
}
