package org.academy.util.data;

import org.academy.kata.console.ConsoleCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ConsoleWriterTest {

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

    @Test(dataProvider = "characterData", dataProviderClass = WriterDataProvider.class)
    public void testTestWriteResult5(char input, String expectedOutput) {
        ConsoleCaptor captor = new ConsoleCaptor();
        captor.startCapture();

        IWriter writer = new ConsoleWriter();
        writer.writeResult(input);

        captor.stopCapture();
        Assert.assertEquals(captor.getOutput(), expectedOutput);
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
