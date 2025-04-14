package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;
import static org.testng.Assert.assertEquals;


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
        String input = "5\n15\n";
        InputStream testInput = new ByteArrayInputStream(input.getBytes());
        InputStream originalIn = System.in;

        try {
            System.setIn(testInput); // Перекидаємо ввід
            ConsoleReader reader = new ConsoleReader(); // Буде використовувати наш testInput
            BigInteger result = reader.readBigInteger(BigInteger.TEN);
            assertEquals(result, BigInteger.valueOf(15));
        } finally {
            System.setIn(originalIn); // Обов'язково відновити
        }
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
