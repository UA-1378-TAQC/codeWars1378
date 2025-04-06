package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task11 implements ITask {
    public Task11() {}

    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Для виконання цього завдання необхідно ввести номер шуканого члену ряду послідовності.");
        writer.writePrompt("Введіть натуральне число:");
        int number = reader.readInt(0);
        try {
            String result = author.getSeven().seriesSum(number);
            writer.writePrompt(String.format("Результат. Значення %d-го члену ряду дорівнює:",number));
            writer.writeString(result);
        }catch(Exception e){
            writer.writePrompt("Щось пішло не так.");
        }
    }
}
