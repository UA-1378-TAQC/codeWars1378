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
        writer.writePrompt("Введіть число n для обчислення периметра (n ≥ 0):");

        String input = reader.readString(null);

        if (!InputValidator.isValidBigInteger(input, BigInteger.ZERO)) {
            writer.writePrompt("Помилка: введено некоректне число. Число має бути цілим і ≥ 0");
            return;
        }

        BigInteger n = new BigInteger(input);

        BigInteger result = author.getFive().perimeter(n);
        writer.writePrompt("Периметр для n = " + n + " дорівнює:");
        writer.writeResult(result);
    }
}
