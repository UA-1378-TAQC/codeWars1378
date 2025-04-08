package org.academy.tasks;

import java.util.Arrays;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;


public class TaskSquareOrSquareRoot implements ITask {    

    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        int magicValue = 0;

        writer.writePrompt("Enter an integer array: ");

        int[] array = reader.readIntArray(magicValue);

        int[] result = author.getEight().squareOrSquareRoot(array);

        writer.writePrompt(Arrays.toString(array) + "->");
        writer.writeResult(result);

    }
}
