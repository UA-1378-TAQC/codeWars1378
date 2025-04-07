package org.academy.util.data;

public interface IWriter {
    void writePrompt(String prompt);

    void writeResult(String result);
    void writeResult(int result);
    void writeResult(float result);
    void writeResult(double result);
    void writeResult(long result);
    void writeResult(boolean result);
    void writeResult(char result);
    void writeResult(Object result);

    void writeArray(int[] array);
    void writeArray(double[] array);
    void writeArray(String[] array);
    void writeArray(long[] array);
}
