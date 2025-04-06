package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task13 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter book values: ");

        String numberWithDecimal = "\\d+\\.\\d{2}";// Number format with a period and two digits after
        String newline = "\\n";// Line separator
        String checkNumber = "\\d+";// Check number
        String category = "[A-Za-z0-9]+";// Category (one word, no spaces)
        String amount = "\\d+\\.\\d{2}";// Amount (same as the initial balance)


        String entryLine = newline + checkNumber + " " + category + " " + amount;
        String fullRegex = "^" + numberWithDecimal + "(" + entryLine + ")*$";

        String book = reader.readString(fullRegex);

        if (book.isEmpty()) {
            writer.writePrompt("Check book string cannot be empty");
            return;
        }

        String result = author.getSix().balance(book);

        writer.writePrompt("Result:");
        writer.writeResult(result);
    }
}
