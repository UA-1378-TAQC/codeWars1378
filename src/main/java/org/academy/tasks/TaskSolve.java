package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskSolve implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        writer.writePrompt("Enter an double value.");

        double m = reader.readDouble((double) 0);

        double result = author.getFive().solve(m);

        writer.writeResult(result);
    }
}