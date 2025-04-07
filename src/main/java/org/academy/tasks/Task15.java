package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task15 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter mean value: ");
        String town = reader.readString("^[A-Za-z\\s]+$");
        writer.writePrompt("Enter variance value: ");
        String stringRegex = "^([A-Za-z ]+):((Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s\\d+(\\.\\d+)?)(,((Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s\\d+(\\.\\d+)?)){11}$";
        String string = reader.readString(stringRegex);

        double meanResult = author.getSix().mean(town, string);
        double varianceResult = author.getSix().variance(town, string);

        writer.writePrompt("Mean Result:");
        writer.writeResult(String.valueOf(meanResult));
        writer.writePrompt("VarianceResult Result:");
        writer.writeResult(String.valueOf(varianceResult));

    }
}
