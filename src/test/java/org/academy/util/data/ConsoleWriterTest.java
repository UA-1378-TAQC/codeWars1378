package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.ConsoleWriterDataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ConsoleWriterTest extends ConsoleWriterDataProvider {
    private ConsoleOutputCaptor captor;

    @BeforeMethod
    public void captureInput() {
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

    @Test(dataProvider = "writeResultObjectDataProvider")
    public void testTestWriteResultObject(Object input, String expected) {
        ConsoleWriter consoleWriter = new ConsoleWriter();
        consoleWriter.writeResult(input);
        Assert.assertEquals(expected, captor.getOutput());
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
