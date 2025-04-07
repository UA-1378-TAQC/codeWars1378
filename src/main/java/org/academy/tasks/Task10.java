package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class Task10 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter a list of positive numbers of first donations:");
        double [] arr = reader.readDoubleArray(1.0);
        writer.writePrompt("Enter the required average number (must be a positive number):");
        double navg = reader.readDouble(1.0);
        try{
            long result = author.getSeven().newAvg(arr,navg);
            writer.writePrompt("Result. Expected donation:");
            writer.writeResult(result);
        }catch(IllegalArgumentException e){
            writer.writePrompt("Unfortunately, the expected donation is not large enough and is not a positive number..");
        }
    }
}
