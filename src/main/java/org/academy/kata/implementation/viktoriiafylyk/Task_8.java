package org.academy.kata.implementation.viktoriiafylyk;

import org.academy.interfaces.ITask;
import org.academy.kata.IEight;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task_8 implements ITask {
    private final IEight impl;
    private double number;


    public Task_8(IEight impl) {
        this.impl = impl;
    }
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        double number = reader.readDouble("Введіть число для форматування :");
        double result = impl.TwoDecimalPlaces(number);
        writer.writePrompt("Результат форматування : ");
        writer.writeResult(result);
    }
}