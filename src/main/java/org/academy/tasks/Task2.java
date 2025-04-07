package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;


public class Task2 implements ITask {    
    String name = "Volume of a Cuboid";
    int Id = 2;
    String description = "Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\r\n" + //
                "\r\n" + //
                "Write a function to help Bob with this calculation.";

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
