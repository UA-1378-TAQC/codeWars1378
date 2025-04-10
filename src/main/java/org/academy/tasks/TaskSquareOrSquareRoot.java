package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskSquareOrSquareRoot implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {

        writer.writePrompt("Enter an integer array.");
        int minArrayLength = 0;
        int[] array = reader.readIntArray(minArrayLength);

        int[] result = author.getEight().squareOrSquareRoot(array);

        writer.writePrompt(array + "->");
        writer.writeResult(result);

    }
}
