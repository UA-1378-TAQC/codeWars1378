package org.academy.kata.implementation.dima123493;

import org.academy.kata.ISix;

public class Task15 implements Task {
    ISix iSix;

    public Task15(ISix sixImpl) {
        this.iSix = sixImpl;
    }

    @Override
    public void run(Reader reader, Writer writer) {
        String town = reader.readln();
        String string = reader.readln();
        iSix.mean(town, string);
        iSix.variance(town, string);
    }

    @Override
    public String getDescription() {
        return """
                data and data1 are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by \\n. The name of each town is followed by :.
                data and towns can be seen in "Your Test Cases:".
                
                Task:
                function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).
                function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
                """;
    }

    @Override
    public String getName() {
        return "Rainfall";
    }

    @Override
    public String getId() {
        return "Task 15";
    }
}
