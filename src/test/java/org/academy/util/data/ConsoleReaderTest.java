package org.academy.util.data;

import org.academy.kata.console.ConsoleInputCaptor;
import org.academy.kata.console.ConsoleOutputCaptor;
import org.academy.kata.dataproviders.ConsoleReaderDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.testng.Assert.assertEquals;


public class ConsoleReaderTest {
    ConsoleInputCaptor inputCaptor;
    ConsoleOutputCaptor outputCaptor;

    @BeforeMethod
    public void setUpInputStream() {
        inputCaptor = new ConsoleInputCaptor();
    }

    @AfterMethod
    public void restoreInputStream() {
        inputCaptor.restoreInput();
    }

    @BeforeMethod
    public void setUpOutputStream() {
        outputCaptor = new ConsoleOutputCaptor();
    }

    @AfterMethod
    public void restoreOutputStream() {
        outputCaptor.stopCapture();
    }

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadLong() {
    }

    @Test
    public void testReadFloat() {
    }

    @Test(dataProvider = "doubleDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadDouble(Double minValue, String input, Double expectedResult) {
        inputCaptor.setInput(input);
        ConsoleReader reader = new ConsoleReader();
        outputCaptor.startCapture();

        if(expectedResult!=null){
            assertEquals(reader.readDouble(minValue), expectedResult);
        }else{
            try{
                reader.readDouble(minValue);
            }catch(Exception e) {
                assertEquals(outputCaptor.getOutput(), "Incorrect input, please try again:");
            }
        }
    }

    @Test(dataProvider = "bigIntegerDataProvider", dataProviderClass = ConsoleReaderDataProvider.class)
    public void testReadBigInteger(BigInteger minVal, String input, BigInteger expectedResult) {
        inputCaptor.setInput(input);

        ConsoleReader reader = new ConsoleReader();

        BigInteger result = reader.readBigInteger(minVal);

        assertEquals(result, expectedResult);
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadIntArray() {
    }

    @Test
    public void testReadDoubleArray() {
    }

    @Test
    public void testReadStringArray() {
    }
}
