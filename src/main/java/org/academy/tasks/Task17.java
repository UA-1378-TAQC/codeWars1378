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
        writer.writePrompt("Enter books in the format: CODE QUANTITY (e.g. ABART 20):");
        String[] lstOfArt = reader.readStringArray("[A-Z]+\\s\\d+");

        writer.writePrompt("Enter book categories (e.g. A,B,C):");
        String[] lstOf1stLetter = reader.readStringArray("[A-Z]");

        //validate
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            writer.writePrompt("One of the arrays is empty. Calculation cannot proceed.");
            return;
        }

        Set<String> uniqueCategories = new HashSet<>(Arrays.asList(lstOf1stLetter));
        if (uniqueCategories.size() < lstOf1stLetter.length) {
            writer.writePrompt("Duplicate categories found. Calculation cannot proceed.");
        }

        String result = author.getSix().stockSummary(lstOfArt, lstOf1stLetter);

        writer.writePrompt("Result:");
        writer.writeResult(result);
    }
}
