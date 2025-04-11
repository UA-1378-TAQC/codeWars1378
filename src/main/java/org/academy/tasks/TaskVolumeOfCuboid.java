package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskVolumeOfCuboid implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {

        writer.writePrompt("Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\n");
        writer.writePrompt("Enter length.");
        double minValue = 0;
        double length = reader.readDouble(minValue);
        writer.writePrompt("Enter width.");
        double width = reader.readDouble(minValue);
        writer.writePrompt("Enter height.");
        double height = reader.readDouble(minValue);

        double result = author.getEight().getVolumeOfCuboid(length, width, height);

        writer.writePrompt("The volume of a rectangular cuboid is ");
        writer.writeResult(result);

    }
}
