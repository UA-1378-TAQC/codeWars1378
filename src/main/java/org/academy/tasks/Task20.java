package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;
import org.academy.util.data.InputValidator;

import java.math.BigInteger;

public class Task20 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter number n to calculate perimeter (n ≥ 0):");

        String input = reader.readString(null);

        if (!InputValidator.isValidBigInteger(input, BigInteger.ZERO)) {
            writer.writePrompt("Error: Invalid input. Number must be an integer ≥ 0");
            return;
        }

        BigInteger n = new BigInteger(input);

        BigInteger result = author.getFive().perimeter(n);
        writer.writePrompt("Perimeter for n = " + n + " equals:");
        writer.writeResult(result);
    }
}
