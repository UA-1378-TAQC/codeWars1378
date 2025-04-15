package org.academy.kata;


import org.academy.kata.dataproviders.EightDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EightTest extends EightDataProvider {

    @Test(dataProvider = "litersDataProvider")
    public void testLiters(double time, int expected, IEight iEight) {
        int actual = iEight.liters(time);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "cuboidDataProvider")
    public void testGetVolumeOfCuboid(double length, double width, double height, double expectedVolume, IEight iEight) {
        double actualVolume = iEight.getVolumeOfCuboid(length, width, height);
        Assert.assertEquals(actualVolume, expectedVolume, 0.001);
    }


    @Test(dataProvider = "kmPerLiterProvider")
    public void testMpgToKPM(float mpg, float expectedResult, IEight iEight) {
        float actualResult = iEight.mpgToKPM(mpg);
        Assert.assertEquals(actualResult, expectedResult, 0.001);
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

    @Test(dataProvider = "twoDecimalPlacesDataProvider")
    public void testTwoDecimalPlaces(double input, double expected, IEight iEight) {
        double actual = iEight.TwoDecimalPlaces(input);
        Assert.assertEquals(actual, expected, 0.001);
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
