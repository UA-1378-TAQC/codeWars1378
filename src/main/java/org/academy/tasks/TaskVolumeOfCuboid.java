package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskVolumeOfCuboid implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        writer.writePrompt("Enter length, width, height.");
        writer.writePrompt("Enter length.");
        final double length = reader.readDouble(0.0);
        writer.writePrompt("Enter width.");
        final double width = reader.readDouble(0.0);
        writer.writePrompt("Enter height.");
        final double height = reader.readDouble(0.0);

        double result = author.getEight().getVolumeOfCuboid(length,width,height);

        writer.writePrompt("The volume of a rectangular cuboid is ");
        writer.writeResult(result);

    }
}
