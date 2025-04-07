package org.academy.tasks;
import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task6 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {;
        String integerRegex = "^[-+]?\\d+$";
        writer.writePrompt("ВEnter a string containing a number : ");
        String input = reader.readString(integerRegex);
        int result = author.getEight().stringToNumber(input);
        writer.writePrompt("The result of the conversion : ");
        writer.writeResult(result);
    }
}
