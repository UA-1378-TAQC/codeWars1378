package org.academy.kata.implementation.dima123493;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task13 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter book values: ");
        String book = reader.readString();

        String result = author.getSix().balance(book);

        writer.writePrompt("Result:");
        writer.writeResult(result);
    }
}
