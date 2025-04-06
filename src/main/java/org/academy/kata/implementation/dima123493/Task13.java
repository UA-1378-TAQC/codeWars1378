package org.academy.kata.implementation.dima123493;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task13 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter book values: ");

        String numberWithDecimal = "\\d+\\.\\d{2}";// Формат числа з крапкою та двома знаками після
        String newline = "\\n";// Розділювач рядків
        String checkNumber = "\\d+";// Номер чека
        String category = "[A-Za-z0-9]+";// Категорія (одне слово, без пробілів)
        String amount = "\\d+\\.\\d{2}";// Сума (як і початковий баланс)

        String entryLine = newline + checkNumber + " " + category + " " + amount;
        String fullRegex = numberWithDecimal + "(" + entryLine + ")*";

        String book = reader.readString(fullRegex);

        String result = author.getSix().balance(book);

        writer.writePrompt("Result:");
        writer.writeResult(result);
    }
}
