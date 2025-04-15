package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskBalance implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter book values in the following format:");
        writer.writePrompt("First line: initial balance (e.g. 1000.00)");
        writer.writePrompt("Next lines: check number, category, and amount separated by spaces (e.g. 125 Market 125.45)");
        writer.writePrompt("NOTE: Use spaces between values. Avoid commas and other separators.");

        String numberWithDecimal = "\\d+\\.\\d{2}";
        String newline = "\\R";
        String checkNumber = "\\d+";
        String category = "[A-Za-z0-9]+";
        String amount = "\\d+\\.\\d{2}";

        String entryLine = newline + checkNumber + " " + category + " " + amount;
        String fullRegex = "^" + numberWithDecimal + "(" + entryLine + ")*$";

        String book = reader.readString(fullRegex);

        if (book == null || book.isBlank()) {
            writer.writePrompt("Check book string cannot be empty");
            return;
        }

        String result = author.getSix().balance(book);

        writer.writePrompt("Result:");
        writer.writeResult(result);
    }
}
