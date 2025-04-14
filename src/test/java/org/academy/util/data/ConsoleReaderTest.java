package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ConsoleReaderTest {
    ConsoleInputCaptor inputCaptor;
    ConsoleOutputCaptor outputCaptor;

    @BeforeMethod
    public void setUpInputStream() {
        inputCaptor = new ConsoleInputCaptor();
    }

    @AfterMethod
    public void restoreInputStream() {
        inputCaptor.restoreInput();
    }

    @BeforeMethod
    public void setUpOutputStream() {
        outputCaptor = new ConsoleOutputCaptor();
    }

    @AfterMethod
    public void restoreOutputStream() {
        outputCaptor.stopCapture();
    }

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadLong() {
    }

    @Test(dataProvider = "readFloatDataProvider")
    public void testReadFloat(float minValue, String simulatedInput, float expected) {
        ConsoleOutputCaptor captor = new ConsoleOutputCaptor();
        captor.setInput(simulatedInput + "\n");
        ConsoleReader consoleReader = new ConsoleReader();

        float actual = consoleReader.readFloat(minValue);

        assertEquals(actual, expected, 0.0001f);
    }

    @Test(dataProvider = "doubleDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadDouble(Double minValue, String input, Double expectedResult) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        outputCaptor.startCapture();
        assertEquals(reader.readDouble(minValue), expectedResult);
    }

    @Test(dataProvider = "doubleIncorrectDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadDoubleIncorrect(Double minValue, String input) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        outputCaptor.startCapture();
        try {
            reader.readDouble(minValue);
        } catch (Exception e) {
            assertEquals(outputCaptor.getOutput(), "Incorrect input, please try again:");
        }
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

    @Test(dataProvider = "intArrayDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadIntArray(String input, int[] expected) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        int[] result = reader.readIntArray(0);
        assertEquals(result, expected);
    }

    @Test
    public void testReadDoubleArray() {
    }

    @Test
    public void testReadStringArray() {
    }
}
