package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task17 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Введіть книги у форматі: CODE КІЛЬКІСТЬ (наприклад: ABART 20):");
        String[] lstOfArt = reader.readStringArray("[A-Z]+\\s\\d+");
        writer.writePrompt("Введіть категорії книг (наприклад: A,B,C):");
        String[] lstOf1stLetter = reader.readStringArray("[A-Z]");

        //validate
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            writer.writePrompt("Один із масивів порожній. Неможливо виконати обчислення.");
            return;
        }

        Set<String> uniqueCategories = new HashSet<>(Arrays.asList(lstOf1stLetter));
        if (uniqueCategories.size() < lstOf1stLetter.length) {
            writer.writePrompt("У категоріях є дублікати. Неможливо виконати обчислення.");
        }

        String result = author.getSix().stockSummary(lstOfArt, lstOf1stLetter);

        writer.writePrompt("Результат:");
        writer.writeResult(result);
    }
}
