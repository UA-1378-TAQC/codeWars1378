package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskNewAvg implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter a list of positive numbers of first donations:");
        double minValueArr = 1.0;
        double [] arr = reader.readDoubleArray(minValueArr);
        writer.writePrompt("Enter the required average number (must be a positive number):");
        double minValueNavg = 1.0;
        double navg = reader.readDouble(minValueNavg);
        try{
            long result = author.getSeven().newAvg(arr,navg);
            writer.writePrompt("Result. Expected donation:");
            writer.writeResult(result);
        }catch(IllegalArgumentException e){
            writer.writePrompt("Unfortunately, the expected donation is not large enough and is not a positive number..");
        }
    }
}
