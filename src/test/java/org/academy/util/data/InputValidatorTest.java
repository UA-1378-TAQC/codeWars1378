package org.academy.util.data;

import org.academy.kata.dataproviders.InputValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InputValidatorTest extends InputValidatorDataProvider {

    @Test
    public void testIsValidInt() {
    }

    @Test
    public void testIsValidLong() {
    }

    @Test
    public void testIsValidFloat() {
    }

    @Test
    public void testIsValidDouble() {
    }

    @Test
    public void testIsValidBigInteger() {
    }

    @Test
    public void testIsValidString() {
    }

    @Test
    public void testIsValidIntegerArray() {
    }

    @Test(dataProvider = "isValidDoubleArrayDataProvider")
    public void testIsValidDoubleArray(String input, String delimiter, Double minValue, boolean expected) {
        boolean actual = InputValidator.isValidDoubleArray(input, delimiter, minValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsValidStringArray() {
    }
}
