package org.academy.kata.implementation.viktoriiafylyk;
import org.academy.interfaces.ITask;
import org.academy.kata.IEight;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;
public class Task_7 implements ITask {
    private final IEight impl;
    private long n;


    public Task_7(IEight impl) {
        this.impl = impl;
    }

    public void run(Authors author, IReader reader, IWriter writer) {
        long number = reader.readLong("Введіть число для форматування :");
        boolean isWilson = impl.am_i_wilson(number);
        writer.writePrompt("Результат : ");
        writer.writeResult(isWilson);
    }

}
