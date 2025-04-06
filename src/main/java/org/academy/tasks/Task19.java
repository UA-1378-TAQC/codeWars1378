package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task19 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Введіть число n, для якого треба знайти кількість нулів у n! (n ≥ 0):");
        int n = reader.readInt(0);

        int result = author.getFive().zeros(n);

        writer.writePrompt("Кількість нулів у " + n + "! дорівнює:");
        writer.writeResult(result);
    }
}
