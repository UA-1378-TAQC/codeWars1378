package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task10 implements ITask {
    public Task10() {}
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Для виконання цього завдання необхідно ввести список чисел перших пожертв" +
                " та необхідне середнє число, якого мають досягти пожертвування.");
        writer.writePrompt("Введіть список додатніх чисел перших пожертв:");
        double [] arr = reader.readDoubleArray(1.0);
        writer.writePrompt("Введіть необхідне середнє число (має бути додатнім числом):");
        double navg = reader.readDouble(1.0);
        try{
            long result = author.getSeven().newAvg(arr,navg);
            writer.writePrompt("Результат виконання - очікувана пожертва:");
            writer.writeResult(result);
        }catch(IllegalArgumentException e){
            writer.writePrompt("Нажаль, очікувана пожертва недостатньо велика і не є додатнім числом.");
        }
    }
}
