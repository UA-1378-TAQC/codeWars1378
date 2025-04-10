package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskVolumeOfCuboid implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {

        writer.writePrompt("Enter length, width, height.");
        writer.writePrompt("Enter length.");
        double minValue = 0;
        final double length = reader.readDouble(minValue);
        writer.writePrompt("Enter width.");
        final double width = reader.readDouble(minValue);
        writer.writePrompt("Enter height.");
        final double height = reader.readDouble(minValue);

        double result = author.getEight().getVolumeOfCuboid(length, width, height);

        writer.writePrompt("The volume of a rectangular cuboid is ");
        writer.writeResult(result);

    }
}
