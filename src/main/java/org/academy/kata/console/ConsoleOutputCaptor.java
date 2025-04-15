package org.academy.kata.console;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleOutputCaptor {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    public void startCapture() {
        System.setOut(new PrintStream(outputStream));
    }

    public String getOutput() {
        return outputStream.toString().trim();
    }

    public void stopCapture() {
        System.setOut(originalOut);
    }


    public void setInput(String simulatedInput) {
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
    }

    public void restoreInput() {
        System.setIn(originalIn);
    }
}
