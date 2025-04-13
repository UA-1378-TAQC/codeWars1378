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

    @Test
    public void testIsValidDouble() {
    }

    @Test
    public void testIsValidBigInteger() {
    }

    @Test(dataProvider = "isValidStringDataProvider", dataProviderClass = InputValidatorDataProvider.class)
    public void testIsValidString(String prompt, String regEx, boolean expectedResult) {
        boolean actualResult = InputValidator.isValidString(prompt, regEx);
        Assert.assertEquals(actualResult, expectedResult);
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
