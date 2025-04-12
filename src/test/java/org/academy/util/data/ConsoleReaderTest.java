package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ConsoleReaderTest {
    private ConsoleInputCaptor inputCaptor;
    private IReader reader;

    @BeforeMethod
    public void setUpInputStream() {
        inputCaptor = new ConsoleInputCaptor();
        reader = new ConsoleReader();
    }

    @AfterMethod
    public void restoreInputStream() {
        inputCaptor.restoreInput();
    }

    @Test
    public void testReadInt() {
    }

    @Test(dataProvider = "longDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadLong(long minValue, String simulatedInput, long expectedResult) {
        inputCaptor.setInput(simulatedInput);
        long actualResult = reader.readLong(minValue);
        Assert.assertEquals(actualResult, expectedResult,
                String.format("Expected: %d, but got: %d", expectedResult, actualResult));
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

    @Test
    public void testReadStringArray() {
    }
}
