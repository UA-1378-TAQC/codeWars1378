package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task9 implements ITask {
    public Task9() {}
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Для виконання цього завдання необхідно ввести список чисел та дільник.");
        writer.writePrompt("Введіть список додатніх цілих чисел:");
        int [] numbers = reader.readIntArray(0);
        writer.writePrompt("Введіть дільник (має бути цілим додатнім числом):");
        int divider = reader.readInt(1);
        try {
            int[] result = author.getEight().divisibleBy(numbers, divider);
            writer.writePrompt("Результат. Всі введені числа, які діляться на введений дільник:");
            writer.writeArray(result);
        }catch(Exception e){
            writer.writePrompt("Щось пішло не так.");
        }
    }
}
