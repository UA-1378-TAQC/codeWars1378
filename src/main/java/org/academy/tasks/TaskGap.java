package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskGap implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter the desired prime gap size (g ≥ 2):");
        int g = reader.readInt(2);

        writer.writePrompt("Enter the start of the range (m > 2):");
        long m = reader.readLong(3L);

        writer.writePrompt("Enter the end of the range (n ≥ m):");
        long n = reader.readLong(m);

        long[] result = author.getFive().gap(g, m, n);

        if (result == null || result.length == 0) {
            writer.writePrompt("No prime pair found with a gap of " + g + ".");
        } else {
            writer.writePrompt("Found prime pair:");
            writer.writeArray(result);
        }
    }
}
