package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskSeriesSum implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter the term number of the series (it must be a natural number):");
        int number = reader.readInt(0);
        String result = author.getSeven().seriesSum(number);
        writer.writePrompt(String.format("Result. The value of the %dth term of the series is:", number));
        writer.writeResult(result);
    }
}
