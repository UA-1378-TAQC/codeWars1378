package org.academy.util.data;

import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.WriterDataProvider;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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
        writer.writeResult(input);

        assertEquals(captor.getOutput(), expectedOutput);
    }
}
