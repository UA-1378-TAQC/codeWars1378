package org.academy.util.data;

import org.academy.kata.dataproviders.InputValidatorDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


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

    @Test
    public void testIsValidDouble() {
    }

    @Test
    public void testIsValidBigInteger() {
    }

    @Test
    public void testIsValidString() {
    }

    @Test(dataProvider = "integerArrayDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidIntegerArray(String prompt, String delimiter, Integer minValue, boolean expected) {
        boolean actual = InputValidator.isValidIntegerArray(prompt, delimiter, minValue);
        assertEquals(actual, expected, "Failed for input: " + prompt);
    }

    @Test
    public void testIsValidDoubleArray() {
    }

    @Test
    public void testIsValidStringArray() {
    }
}
