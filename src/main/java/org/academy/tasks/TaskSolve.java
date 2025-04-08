package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;


public class TaskWhichXForThatSum implements ITask {    

    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        double magicValue = 0;

        writer.writePrompt("Enter an double value: ");

        double m = reader.readDouble(magicValue);

        double result = author.getFive().solve(m);

        writer.writeResult(result);
    }
}
