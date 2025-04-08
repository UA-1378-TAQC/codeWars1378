package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskLiters implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter time: ");

        double magicValue = 0;

        double time = reader.readDouble(magicValue);

        int result = author.getEight().liters(time);

        writer.writePrompt("time = " + time + "----> litres = ");
        writer.writeResult(result);
    }
}