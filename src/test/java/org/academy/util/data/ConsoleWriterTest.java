package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class ConsoleWriterTest extends WriterDataProvider {
    private ConsoleOutputCaptor outputCaptor;
    private ConsoleInputCaptor inputCaptor;
    @BeforeMethod
    public void setUpStartCaptureStream() {
        outputCaptor = new ConsoleOutputCaptor();
        outputCaptor.startCapture();

        inputCaptor = new ConsoleInputCaptor();
    }

    @AfterMethod
    public void restoreStreams() {
        outputCaptor.stopCapture();
        inputCaptor.restoreInput();
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

        writer.writeResult(input); 

        String output = outputCaptor.getOutput();
        assertEquals(output.trim(), expectedOutput.trim(), "Output mismatch for input: " + input);
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
