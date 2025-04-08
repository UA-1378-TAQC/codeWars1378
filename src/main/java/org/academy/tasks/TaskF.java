package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskF implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter x value: ");
        double x = reader.readDouble(0.0);

        double result = author.getSix().f(x);

        writer.writePrompt("Result:");
        writer.writeResult(String.valueOf(result));
    }
}
