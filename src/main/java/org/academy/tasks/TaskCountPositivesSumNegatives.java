
package org.academy.tasks;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskCountPositivesSumNegatives implements ITask{
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter an array of integers (positive and negative) :");
        Integer minValue = 0 ;
        int[] input = reader.readIntArray(minValue);
        int[] result = author.getEight().countPositivesSumNegatives(input);
        writer.writePrompt("Result : ");
        writer.writeArray(result);
    }
}
