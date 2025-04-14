package org.academy.util.data;

import org.academy.kata.dataproviders.InputValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InputValidatorTest extends InputValidatorDataProvider {

    @Test(dataProvider = "isValidIntDataProvider")
    public void testIsValidInt(String input, Integer minValue, boolean expected) {
        boolean actual = InputValidator.isValidInt(input, minValue);
        Assert.assertEquals(actual, expected);
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

    @Test
    public void testIsValidDoubleArray() {
    }

    @Test
    public void testIsValidStringArray() {
    }
}
