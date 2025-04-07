package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task1 implements ITask {

    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter time:");
        double time = reader.readDouble(0.0);

        int result = author.getEight().liters(time);

        writer.writePrompt("time = " + time + "----> litres = " + result);
    }
}