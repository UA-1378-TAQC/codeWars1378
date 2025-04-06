package org.academy.util.data;

public interface IWriter {
    public void writePrompt(String prompt);

    public void writeResult(String result);
    public void writeResult(int result);
    public void writeResult(float result);
}
