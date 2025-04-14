package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import static org.testng.AssertJUnit.assertEquals;


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

    @Test
    public void testWriteResult() {
    }

    @Test(dataProvider = "intDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult(int input, String expectedOutput) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleOutputCaptor captor = new ConsoleOutputCaptor();

        captor.startCapture();
        writer.writeResult(input);
        captor.stopCapture();

        String output = captor.getOutput();
        assertEquals(output, expectedOutput);
    }

    @Test
    public void testTestWriteResult1() {
    }

    @Test(dataProvider = "doubleDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult2(double value, String expectedOutput) {
        writer.writeResult(value);
        String actualOutput = captor.getOutput().trim();

        Assert.assertEquals(actualOutput, expectedOutput,
                "Expected output: " + expectedOutput + ", but got: " + actualOutput);
    }

    @Test(dataProvider = "longDataProvider")
    public void testTestWriteResult3(long input, String expectedOutput) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleOutputCaptor captor = new ConsoleOutputCaptor();

        captor.startCapture();
        writer.writeResult(input);
        captor.stopCapture();

        String output = captor.getOutput();
        assertEquals(output.trim(), expectedOutput.trim());

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

    @Test
    public void testTestWriteArray1() {
    }

    @Test
    public void testTestWriteArray2() {
    }
}
