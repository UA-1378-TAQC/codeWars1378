package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskFloatingPointApproximation implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter a small positive value for x (e.g. 2.6e-08):");
        double minimumValue = 0.0;
        double x = reader.readDouble(minimumValue);

        double result = author.getSix().f(x);

        writer.writePrompt("Result:");
        writer.writeResult(String.valueOf(result));
    }
}
