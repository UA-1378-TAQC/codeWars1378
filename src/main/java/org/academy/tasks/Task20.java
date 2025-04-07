package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

import java.math.BigInteger;

public class Task20 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter number n to calculate perimeter (n ≥ 0):");

        BigInteger n = reader.readBigInteger(BigInteger.ZERO);
        BigInteger result = author.getFive().perimeter(n);

        writer.writePrompt("Perimeter for n = " + n + " equals:");
        writer.writeResult(result);

    }
}
