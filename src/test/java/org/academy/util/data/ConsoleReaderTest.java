package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.NoSuchElementException;


public class ConsoleReaderTest extends ConsoleReaderDataProvider {
    private ConsoleInputCaptor inputCaptor;
    private ConsoleOutputCaptor outputCaptor;
    private IReader reader;

    @BeforeMethod
    public void setUpInputStream() {
        inputCaptor = new ConsoleInputCaptor();
        outputCaptor = new ConsoleOutputCaptor();
    }

    @AfterMethod
    public void restoreInputStream() {
        inputCaptor.restoreInput();
        outputCaptor.stopCapture();
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

    @Test(dataProvider = "doubleDataProvider")
    public void testReadDouble(Double minValue, String input, Double expectedResult) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        outputCaptor.startCapture();
        Assert.assertEquals(reader.readDouble(minValue), expectedResult);
    }

    @Test(dataProvider = "doubleIncorrectDataProvider")
    public void testReadDoubleIncorrect(Double minValue, String input) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        outputCaptor.startCapture();
        try {
            reader.readDouble(minValue);
        } catch (NoSuchElementException e) {
            Assert.assertEquals(outputCaptor.getOutput(), "Incorrect input, please try again:");
        }
    }

    @Test(dataProvider = "bigIntegerDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadBigInteger(BigInteger minVal, String input, BigInteger expectedResult) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        BigInteger result = reader.readBigInteger(minVal);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "readStringDataProvider")
    public void testReadString(String[] stepInputs, String regEx, String expected) {
        inputCaptor.setInput(String.join("\n", stepInputs));
        ConsoleReader consoleReader = new ConsoleReader();
        String actual = consoleReader.readString(regEx);
        Assert.assertEquals(expected, actual);
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

    @Test(dataProvider = "stringArrayDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadStringArray(String delimiter, String input, String regEx, String[] expectedResult) {
        inputCaptor.setInput(delimiter + "\n" + input + "\n");

        ConsoleReader reader = new ConsoleReader();
        String[] result = reader.readStringArray(regEx);

        Assert.assertEquals(result, expectedResult);
    }
}
