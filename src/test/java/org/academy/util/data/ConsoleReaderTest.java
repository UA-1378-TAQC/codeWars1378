package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ConsoleReaderTest extends ConsoleReaderDataProvider {
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

    @Test(dataProvider = "readStringDataProvider")
    public void testReadString(String[] stepInputs, String regEx, String expected) {
        inputCaptor.setInput(String.join("\n", stepInputs));
        ConsoleReader consoleReader = new ConsoleReader();
        String actual = consoleReader.readString(regEx);
        Assert.assertEquals(expected, actual);
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
