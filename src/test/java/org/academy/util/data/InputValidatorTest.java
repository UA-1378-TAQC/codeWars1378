package org.academy.util.data;

import org.academy.kata.dataproviders.InputValidatorDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class InputValidatorTest {

    @Test
    public void testIsValidInt() {
    }

    @Test(dataProvider = "isValidLongDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidLong(String input, Long minValue, boolean expected) {
        boolean result = InputValidator.isValidLong(input, minValue);
        assertEquals(result, expected, "Failed for input: \"" + input + "\", minValue: " + minValue);
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
