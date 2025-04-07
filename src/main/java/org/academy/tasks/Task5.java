
package org.academy.tasks;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;
import org.academy.interfaces.ITask;

public class Task5 implements ITask{

    @Override
     public void run(Authors author, IReader reader, IWriter writer) {
         writer.writePrompt("Введіть масив цілих чисел (додатні та від'ємні) :");
         Integer minValue = 0 ;
         int[] input = reader.readIntArray(minValue);
         int[] result = author.getEight().countPositivesSumNegatives(input);
         writer.writePrompt("Результат : ");
         writer.writeResult(result);
     }
}