package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task22 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter a positive integer:");
        long n = reader.readLong(0L);
        long[] result = author.getFive().smallest(n);
        writer.writePrompt("Result:");
        writer.writeArray(result);
        if (result[1] == result[2]) writer.writePrompt("The number remained unchanged.");
    }
}
