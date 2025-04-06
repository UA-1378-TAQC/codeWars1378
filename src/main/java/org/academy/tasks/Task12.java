package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task12 implements ITask {
    public Task12() {}

    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Для виконання цього завдання необхідно ввести об'єм побудови.");
        writer.writePrompt("Введіть ціле додатнє число:");
        long m = reader.readLong(0L);
        try {
            long result = author.getSix().findNb(m);
            if(result != -1){
                writer.writePrompt("Результат. Кількість кубиків дорівнює значенню:");
                writer.writeLong(result);
            }else {
                writer.writePrompt("Результат. За заданим об'ємом " +
                        "не було знайдено існуїчої кількості кубиків.");
            }
        }catch(Exception e){
            writer.writePrompt("Щось пішло не так.");
        }
    }
}
