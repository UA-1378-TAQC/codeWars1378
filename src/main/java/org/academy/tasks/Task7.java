package org.academy.tasks;
import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;
public class Task7 implements ITask {

    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        Long minValue = 1L;
        writer.writePrompt("Введіть число для перевірки на Wilson Prime :");
        long number = reader.readLong(minValue);
        boolean isWilson = author.getEight().am_i_wilson(number);
        writer.writePrompt("Результат : ");
        writer.writeResult(isWilson);
    }
}
