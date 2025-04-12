package org.academy.util.data;

import org.academy.kata.dataproviders.InputValidatorDataProvider;
import org.testng.Assert;

import org.testng.annotations.Test;


public class InputValidatorTest {

    @Test
    public void testIsValidInt() {
    }

    @Test
    public void testIsValidLong() {
    }

    @Test
    public void testIsValidFloat() {
    }

    @Test(dataProvider = "doubleDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidDouble(String prompt, Double minValue, boolean expected) {
        boolean result = InputValidator.isValidDouble(prompt, minValue);
        Assert.assertEquals(result, expected, String.format(
                "Validation failed for input '%s' with minValue %f. Expected: %b, but got: %b",
                prompt, minValue, expected, result));
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
