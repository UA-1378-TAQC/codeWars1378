package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;


public class TaskMpgToKpm implements ITask {    

    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        int magicValue = 0;

        writer.writePrompt("Enter the number of gallons to convert: ");

        int mpg = reader.readInt(magicValue);

        double result = author.getEight().mpgToKPM(mpg);

        writer.writePrompt(mpg +"of Imperial gallons, that is ");
        writer.writeResult(result);
        writer.writePrompt(" kilometers per liter");
    }
}
