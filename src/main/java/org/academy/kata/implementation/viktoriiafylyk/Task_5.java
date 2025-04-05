
package org.academy.kata.implementation.viktoriiafylyk;
import org.academy.kata.IEight;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;
import org.academy.interfaces.ITask;


public class Task_5 implements ITask{
    private final IEight impl;
    private int[] input;
     public Task_5(IEight impl) {
         this.impl = impl;
     }

     public void run(Authors author, IReader reader, IWriter writer) {
         int[] input = reader.readIntArray("Введіть масив цілих чисел (додатні та від'ємні) :", "" );
         int[] result = impl.countPositivesSumNegatives(input);
         writer.writePrompt("Результат : ");
         writer.writeResult(result);
     }

}