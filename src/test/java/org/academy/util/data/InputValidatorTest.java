package org.academy.util.data;

import org.academy.kata.dataproviders.InputValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class InputValidatorTest extends InputValidatorDataProvider {

    @Test(dataProvider = "isValidIntDataProvider")
    public void testIsValidInt(String input, Integer minValue, boolean expected) {
        boolean actual = InputValidator.isValidInt(input, minValue);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "isValidLongDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidLong(String input, Long minValue, boolean expected) {
        boolean result = InputValidator.isValidLong(input, minValue);
        assertEquals(result, expected, "Failed for input: \"" + input + "\", minValue: " + minValue);
    }

    @Test(dataProvider = "floatDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidFloat(String prompt, Float minValue, boolean expected) {
        boolean result = InputValidator.isValidFloat(prompt, minValue);
        Assert.assertEquals(result, expected, String.format(
                "Validation failed for input '%s' with minValue %.2f. Expected: %b, but got: %b",
                prompt, minValue, expected, result));
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

    @Test(dataProvider = "isValidStringDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidString(String prompt, String regEx, boolean expectedResult) {
        boolean actualResult = InputValidator.isValidString(prompt, regEx);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "integerArrayDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidIntegerArray(String prompt, String delimiter, Integer minValue, boolean expected) {
        boolean actual = InputValidator.isValidIntegerArray(prompt, delimiter, minValue);
        assertEquals(actual, expected, "Failed for input: " + prompt);
    }

    @Test(dataProvider = "isValidDoubleArrayDataProvider")
    public void testIsValidDoubleArray(String input, String delimiter, Double minValue, boolean expected) {
        boolean actual = InputValidator.isValidDoubleArray(input, delimiter, minValue);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "isValidStringArrayDataProvider")
    public void testIsValidStringArray(String input, String delimiter, String regex, boolean expected) {
        boolean actual = InputValidator.isValidStringArray(input, delimiter, regex);
        Assert.assertEquals(expected, actual);
    }
}
