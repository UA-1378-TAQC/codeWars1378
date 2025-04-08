package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskZeros implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter a number n to calculate the number of trailing zeros in n! (n ≥ 0):");
        int n = reader.readInt(0);

        int result = author.getFive().zeros(n);

        writer.writePrompt("The number of trailing zeros in " + n + "! is:");
        writer.writeResult(result);
    }
}
