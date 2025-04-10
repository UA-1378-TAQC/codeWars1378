package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskTwoDecimalPlaces implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        Double minValue = 0.0;
        writer.writePrompt("Enter a number to format:");
        double number = reader.readDouble(minValue);
        double result = author.getEight().TwoDecimalPlaces(number);
        writer.writePrompt("The result of formatting: ");
        writer.writeResult(result);
    }
}
