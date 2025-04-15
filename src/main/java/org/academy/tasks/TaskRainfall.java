package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskRainfall implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter town name (e.g., London): ");
        String town = reader.readString("^[A-Za-z\\s]+$");
        writer.writePrompt("""
                                            Enter rainfall data in the following format:
                                            <City>:<Month1> <value1>,<Month2> <value2>,...,<Month12> <value12>
                                            Example:
                                            London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9
                """);
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
