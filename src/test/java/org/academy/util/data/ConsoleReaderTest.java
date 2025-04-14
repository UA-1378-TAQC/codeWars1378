package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.academy.kata.console.ConsoleOutputCaptor;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ConsoleReaderTest extends ConsoleReaderDataProvider {
    private ConsoleInputCaptor inputCaptor;
    private IReader reader;

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


    @Test(dataProvider = "longDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadLong(long minValue, String simulatedInput, long expectedResult) {
        inputCaptor.setInput(simulatedInput);
        reader = new ConsoleReader();
        long actualResult = reader.readLong(minValue);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "readFloatDataProvider")
    public void testReadFloat(float minValue, String simulatedInput, float expected) {
        ConsoleOutputCaptor captor = new ConsoleOutputCaptor();
        captor.setInput(simulatedInput + "\n");
        ConsoleReader consoleReader = new ConsoleReader();

        float actual = consoleReader.readFloat(minValue);

        assertEquals(actual, expected, 0.0001f);
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
