package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task1 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        /*
        writer.writePrompt("Введіть n");
        int value1 = reader.readInt(); //41234123 [1,100];
        writer.writePrompt("Введіть k");
        int value2 = reader.readInt(); //324124231

        //validate

        int result = author.getFive().solve(value1,value2);

        writer.writePrompt("Результат:");
        writer.writeResult(result);
         */
    }
}
