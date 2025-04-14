package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ConsoleReaderTest extends ConsoleReaderDataProvider {

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

    @Test
    public void testReadStringArray() {
    }
}
