package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task22 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Введіть додатнє ціле число:");
        long n = reader.readLong(0L);
        try {
            long[] result = author.getFive().smallest(n);
            writer.writePrompt("Результат:");
            writer.writeArray(result);
            if(result[1] == result[2]) writer.writePrompt("Число залишилося незмінним.");
        }catch(Exception e){
            writer.writePrompt("Щось пішло не так.");
        }
    }
}
