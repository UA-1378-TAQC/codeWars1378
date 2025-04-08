package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;


public class TaskGetVolumeOfCuboid implements ITask {    

    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        double magicValue = 0;

        writer.writePrompt("Enter length, width, height.\n");
        writer.writePrompt("Enter length: ");
        final double length = reader.readDouble(magicValue);
        writer.writePrompt("Enter width: ");
        final double width = reader.readDouble(magicValue);
        writer.writePrompt("Enter height: ");
        final double height = reader.readDouble(magicValue);

        double result = author.getEight().getVolumeOfCuboid(length,width,height);

        writer.writePrompt("The volume of a rectangular cuboid is ");
        writer.writeResult(result);

    }
}
