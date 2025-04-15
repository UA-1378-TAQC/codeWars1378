package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.academy.kata.dataproviders.WriterStringDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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

    @Test(dataProvider = "testWritePrompt", dataProviderClass = WriterDataProvider.class)
    public void testWritePrompt(String input, String expectedOutput) {
        writer.writePrompt(input);

        Assert.assertEquals(captor.getOutput(), expectedOutput);
    }

    @Test(dataProvider = "stringData", dataProviderClass = WriterStringDataProvider.class)
    public void testWriteResult(String input, String expectedOutput) {
        writer.writeResult(input);
        Assert.assertEquals(captor.getOutput(), expectedOutput);
    }

    @Test(dataProvider = "floatDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult1(float input, String expectedOutput) {
        writer.writeResult(input);
        String actualOutput = captor.getOutput();
        Assert.assertEquals(actualOutput, expectedOutput);
    }

    @Test(dataProvider = "doubleDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult2(double value, String expectedOutput) {
        writer.writeResult(value);
        String actualOutput = captor.getOutput().trim();

        Assert.assertEquals(actualOutput, expectedOutput, "Expected output: " + expectedOutput + ", but got: " + actualOutput);
    }

    @Test(dataProvider = "booleanDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult4(boolean input, String expected) {
        writer.writeResult(input);
        Assert.assertEquals(captor.getOutput(), expected);
    }

    @Test(dataProvider = "characterData", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult5(char input, String expectedOutput) {
        writer.writeResult(input);
        Assert.assertEquals(captor.getOutput(), expectedOutput);
    }

    @Test
    public void testTestWriteResult6() {
    }

    @Test(dataProvider = "writeArrayDataProvider")
    public void testWriteArray(int[] input, String expected) {
        writer.writeArray(input);
        Assert.assertEquals(captor.getOutput(), expected);
    }

    @Test
    public void testTestWriteArray() {
    }


    @Test
    public void testTestWriteArray1() {
    }

    @Test(dataProvider = "testWriteArray2String", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteArray2(String[] input, String[] expectedOutput) {
        writer.writeResult(input);

        Assert.assertEquals(captor.getOutput(), expectedOutput);
    }
}
