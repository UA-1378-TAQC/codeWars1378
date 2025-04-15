package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

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

    @Test(dataProvider = "stringArrayDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadStringArray(String delimiter, String input, String regEx, String[] expectedResult) {
        inputCaptor.setInput(delimiter + "\n" + input + "\n");

        ConsoleReader reader = new ConsoleReader();
        String[] result = reader.readStringArray(regEx);

        Assert.assertEquals(result, expectedResult);
    }

}
