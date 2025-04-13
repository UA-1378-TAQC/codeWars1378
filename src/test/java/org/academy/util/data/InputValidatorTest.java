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

    @Test(dataProvider = "floatDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidFloat(String prompt, Float minValue, boolean expected) {
        boolean result = InputValidator.isValidFloat(prompt, minValue);
        Assert.assertEquals(result, expected, String.format(
                "Validation failed for input '%s' with minValue %.2f. Expected: %b, but got: %b",
                prompt, minValue, expected, result));
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
