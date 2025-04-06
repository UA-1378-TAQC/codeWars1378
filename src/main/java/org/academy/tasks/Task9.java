package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task9 implements ITask {
    public Task9() {}
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Для виконання цього завдання необхідно ввести масив чилел та дільник:");
        writer.writePrompt("1.Введіть масив додатніх цілих чисел:");
        int [] numbers = reader.readIntArray(0);
        writer.writerPrompt("Введіть дільник (має бути цілим додатнім числом, більше нуля):");
        int divider = reader.readInt(1);
        int [] result = author.getEight().divisibleBy(numbers,divider);
        writer.writePrompt("Результат виконання - всі введені числа, які діляться на введений дільник:");
        writer.writeIntArray(result);
    }
}
