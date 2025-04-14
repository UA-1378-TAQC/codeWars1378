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

    @Test
    public void testIsValidDoubleArray() {
    }

    @Test(dataProvider = "isValidStringArrayDataProvider")
    public void testIsValidStringArray(String input, String delimiter, String regex, boolean expected) {
        boolean actual = InputValidator.isValidStringArray(input, delimiter, regex);
        Assert.assertEquals(expected, actual);
    }
}
