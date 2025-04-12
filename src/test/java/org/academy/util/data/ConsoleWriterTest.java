package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;


public class ConsoleWriterTest {

    private ConsoleOutputCaptor captor;
    private IWriter writer;

    @BeforeMethod
    public void captureInput() {
        writer = new ConsoleWriter();
        captor = new ConsoleOutputCaptor();
        captor.startCapture();
    }

    @AfterMethod
    public void releaseCapture() {
        captor.stopCapture();
    }

    @Test
    public void testWritePrompt() {
    }

    @Test
    public void testWriteResult() {
    }

    @Test
    public void testTestWriteResult() {
    }

    @Test
    public void testTestWriteResult1() {
    }

    @Test
    public void testTestWriteResult2() {
    }

    @Test
    public void testTestWriteResult3() {
    }

    @Test
    public void testTestWriteResult4() {
    }

    @Test
    public void testTestWriteResult5() {
    }

    @Test
    public void testTestWriteResult6() {
    }

    @Test
    public void testWriteArray() {
    }

    @Test
    public void testTestWriteArray() {
    }


    @Test(dataProvider = "doubleArrayDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteArray1(double[] inputArray, String expectedOutput) {
        writer.writeArray(inputArray);
        String actualOutput = captor.getOutput();

        String normalizedActual = actualOutput.replace("\r\n", "\n");
        String normalizedExpected = expectedOutput.replace("\r\n", "\n");

        Assert.assertEquals(normalizedActual, normalizedExpected);
    }

    @Test
    public void testTestWriteArray2() {
    }
}
