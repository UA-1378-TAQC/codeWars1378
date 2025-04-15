package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterStringDataProvider;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


import static org.testng.Assert.assertEquals;

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

        Assert.assertEquals(actualOutput, expectedOutput,
                "Expected output: " + expectedOutput + ", but got: " + actualOutput);
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
