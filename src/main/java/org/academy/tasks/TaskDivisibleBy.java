package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskDivisibleBy implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter a list of positive integers:");
        int[] numbers = reader.readIntArray(0);
        writer.writePrompt("Enter the divisor (must be a positive integer):");
        int divider = reader.readInt(1);
        int[] result = author.getEight().divisibleBy(numbers, divider);
        writer.writePrompt("Result. All entered numbers that are divisible by the entered divisor:");
        writer.writeArray(result);
    }
}
