package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ConsoleReaderTest extends ConsoleReaderDataProvider {

    ConsoleInputCaptor inputCaptor;
    private IReader reader;


    @BeforeMethod
    public void setUpInputStream() {
        inputCaptor = new ConsoleInputCaptor();
    }

    @AfterMethod
    public void restoreInputStream() {
        inputCaptor.restoreInput();
    }


    @Test(dataProvider = "readIntDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadInt(int minValue, String simulatedInput, int expected) {
        inputCaptor.setInput(simulatedInput + "\n");
        ConsoleReader consoleReader = new ConsoleReader();

        int actual = consoleReader.readInt(minValue);

        Assert.assertEquals(actual, expected);
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
        inputCaptor.setInput(simulatedInput + "\n");
        ConsoleReader consoleReader = new ConsoleReader();

        float actual = consoleReader.readFloat(minValue);

        Assert.assertEquals(actual, expected, 0.0001f);

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

    @Test(dataProvider = "readDoubleArrayDataProvider")
    public void testReadDoubleArray(String simulatedInput, Double minValue, double[] expected) {
        ConsoleInputCaptor captor = new ConsoleInputCaptor();
        captor.setInput(simulatedInput);
        ConsoleReader consoleReader = new ConsoleReader();
        double[] actual = consoleReader.readDoubleArray(minValue);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "intArrayDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadIntArray(String input, int[] expected) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        int[] result = reader.readIntArray(0);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testReadDoubleArray() {
    }

    @Test
    public void testReadStringArray() {
    }
}

