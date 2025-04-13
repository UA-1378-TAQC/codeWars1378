package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ConsoleReaderTest {

    ConsoleInputCaptor inputCaptor;

    @BeforeMethod
    public void setUpInputStream() {
        inputCaptor = new ConsoleInputCaptor();
    }

    @AfterMethod
    public void restoreInputStream() {
        inputCaptor.restoreInput();
    }

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadLong() {
    }

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadDouble() {
    }

    @Test
    public void testReadBigInteger() {
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadIntArray() {
    }

    @Test
    public void testReadDoubleArray() {
    }

    @Test(dataProvider = "stringArrayDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadStringArray(String delimiter, String input, String regEx, String[] expectedResult) {
        inputCaptor.setInput(delimiter + "\n" + input + "\n");

        ConsoleReader reader = new ConsoleReader();
        String[] result = reader.readStringArray(regEx);

        Assert.assertEquals(result, expectedResult);
    }

}
