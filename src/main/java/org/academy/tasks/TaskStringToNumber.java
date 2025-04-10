package org.academy.tasks;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskStringToNumber implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        String integerRegex = "^[-+]?\\d+$";
        writer.writePrompt("Enter a string containing a number: ");
        String input = reader.readString(integerRegex);
        int result = author.getEight().stringToNumber(input);
        writer.writePrompt("The result of the conversion: ");
        writer.writeResult(result);
    }
}
