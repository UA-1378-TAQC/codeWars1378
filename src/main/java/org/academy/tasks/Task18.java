package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task18 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Введіть бажаний розмір проміжку між простими числами (g ≥ 2):");
        int g = reader.readInt(2);

        writer.writePrompt("Введіть початкове число діапазону (m > 2):");
        long m = reader.readLong(3L);

        writer.writePrompt("Введіть кінцеве число діапазону (n ≥ m):");
        long n = reader.readLong(m);

        long[] result = author.getFive().gap(g, m, n);

        if (result == null || result.length == 0) {
            writer.writePrompt("Пари простих чисел із проміжком " + g + " не знайдено.");
        } else {
            /*
            @TODO add writeArra();
            writer.writePrompt("Знайдено пару:");
            writer.writeArray(result);
             */
        }
    }
}
