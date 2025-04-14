package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.annotations.*;

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

    @Test
    public void testTestWriteResult2() {
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

    @Test(dataProvider = "booleanDataProvider", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult4(boolean input, String expected) {
        writer.writeResult(input);
        assertEquals(captor.getOutput(), expected);
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

    @Test
    public void testTestWriteArray1() {
    }

    @Test
    public void testTestWriteArray2() {
    }
}
