package org.academy.kata.console;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputCaptor {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public void startCapture() {
        System.setOut(new PrintStream(outputStream));
    }

    public String getOutput() {
        return outputStream.toString().trim();
    }

    public void stopCapture() {
        System.setOut(originalOut);
    }
}



