package org.academy.util.data;

import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

import static org.testng.Assert.assertEquals;


public class ConsoleReaderTest {

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

    @Test
    public void testReadDoubleArray() {
    }

    @Test
    public void testReadStringArray() {
    }
}
