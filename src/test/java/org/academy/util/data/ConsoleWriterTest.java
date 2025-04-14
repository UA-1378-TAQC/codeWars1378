package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import static org.testng.AssertJUnit.assertEquals;


public class ConsoleWriterTest extends WriterDataProvider {


    @Test(dataProvider="testWritePrompt",dataProviderClass=WriterDataProvider.class)
    public void testWritePrompt(String input,String expectedOutput) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleOutputCaptor captor = new ConsoleOutputCaptor();

        writer.writePrompt(input);

        org.testng.AssertJUnit.assertEquals(captor.getOutput(),expectedOutput);
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

    @Test
    public void testTestWriteArray1() {
    }

    @Test(dataProvider="testWriteArray2String",dataProviderClass= WriterDataProvider.class)
    public void testTestWriteArray2(String[] input, String[] expectedOutput) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleOutputCaptor captor = new ConsoleOutputCaptor();
        writer.writeResult(input);

        org.testng.AssertJUnit.assertEquals(captor.getOutput(), expectedOutput);
    }
}
