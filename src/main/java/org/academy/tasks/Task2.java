package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Task2 implements ITask {    
    String name = "Volume of a Cuboid";
    int Id = 2;
    String description = "Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\r\n" + //
                "\r\n" + //
                "Write a function to help Bob with this calculation.";

    public void run(Authors author, Reader reader, Writter writter){

        writter.writePrompt("Введіть довжину, ширину та висоту.");
        writter.writePrompt("Введіть довжину.");
        final double length = reader.readDouble();
        writter.writePrompt("Введіть ширину.");
        final double width = reader.readDouble();
        writter.writePrompt("Введіть висоту.");
        final double height = reader.readDouble();

        double result = author.getEight().getVolumeOfCuboid(length,width,height);

        writter.writePrompt("Объем прямоугольного параллелепипеда дорівнює: " + result);

    }
}
