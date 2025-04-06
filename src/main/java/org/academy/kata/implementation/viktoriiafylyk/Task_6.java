package org.academy.kata.implementation.viktoriiafylyk;
import org.academy.interfaces.ITask;
import org.academy.kata.IEight;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task_6 implements ITask {
    private final IEight impl;
    private String str;

    public Task_6(IEight impl) {
        this.impl = impl;
    }
    @Override

    public void run(Authors author, IReader reader, IWriter writer) {;
        String input = reader.readString("Введіть рядок, який містить число :");
        int result = impl.stringToNumber(input);
        writer.writePrompt("Результат конвертування : ");
        writer.writeResult(result);
    }
}