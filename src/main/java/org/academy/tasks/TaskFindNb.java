package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskFindNb implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter the building volume (positive integer):");
        long minValue = 0L;
        long m = reader.readLong(minValue);
        long result = author.getSix().findNb(m);
        if (result != -1) {
            writer.writePrompt("Result. The number of cubes is:");
            writer.writeResult(result);
        } else {
            writer.writePrompt("Result: It is impossible to calculate the number of cubes based on the given volume.");
        }
    }
}
