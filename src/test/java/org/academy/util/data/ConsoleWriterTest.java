package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.academy.kata.dataproviders.WriterStringDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ConsoleWriterTest extends WriterDataProvider {
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

    @Test(dataProvider = "stringData", dataProviderClass = WriterStringDataProvider.class)
    public void testWriteResult(String input, String expectedOutput) {
        writer.writeResult(input);
        assertEquals(captor.getOutput(), expectedOutput);
    }

    @Test
    public void testTestWriteResult1() {
    }

    @Test(dataProvider = "doubleDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult2(double value, String expectedOutput) {
        writer.writeResult(value);
        String actualOutput = captor.getOutput().trim();

        Assert.assertEquals(actualOutput, expectedOutput, "Expected output: " + expectedOutput + ", but got: " + actualOutput);
    }

    @Test
    public void testTestWriteResult4() {
    }

    @Test(dataProvider = "characterData", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult5(char input, String expectedOutput) {
        writer.writeResult(input);

        assertEquals(captor.getOutput(), expectedOutput);
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
