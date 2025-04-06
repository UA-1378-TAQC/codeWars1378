
package org.academy.kata.implementation.viktoriiafylyk;
import org.academy.kata.IEight;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;
import org.academy.interfaces.ITask;

public class Task_5 implements ITask{
    private final IEight impl;
     public Task_5(IEight impl) {
         this.impl = impl;
     }

    @Override
     public void run(Authors author, IReader reader, IWriter writer) {
         Integer minValue = 0 ;
         int[] input = reader.readIntArray(minValue);
         int[] result = impl.countPositivesSumNegatives(input);
         writer.writePrompt("Результат : ");
         writer.writeResult(result);
     }
}