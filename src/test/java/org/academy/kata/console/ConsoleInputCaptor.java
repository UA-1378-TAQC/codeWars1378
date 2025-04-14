package org.academy.kata.console;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleInputCaptor {
    private final InputStream originalIn = System.in;

    public void setInput(String simulatedInput) {
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
    }

    public void restoreInput() {
        System.setIn(originalIn);
    }
}
