package org.academy.util.data;

// import org.academy.kata.console.ConsoleCaptor;

public class ConsoleWriter implements IWriter {
    @Override
    public void writePrompt(String prompt) {
        System.out.print(prompt);
    }

    @Override
    public void writeResult(String result) {
        System.out.println(result);
    }

    @Override
    public void writeResult(int result) {
        System.out.println(result);
    }

    @Override
    public void writeResult(float result) {
        System.out.println(result);
    }

    public void writeResult(double result) {
        System.out.println(result);
    }

    public void writeResult(long result) {
        System.out.println(result);
    }

    public void writeResult(boolean result) {
        System.out.println(result);
    }

    public void writeResult(char result) {
        System.out.println(result);
    }

    public void writeResult(Object result) {
        System.out.println(result);
    }

    public void writeArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public void writeArray(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }

    public void writeArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public void writeArray(long[] array) {
        for (long element : array) {
            System.out.println(element);
        }
    }
}
