package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Task3 implements ITask {    
    String name = "Miles per gallon to kilometers per liter";
    int Id = 3;
    String description = "Sometimes, I want to quickly be able to convert miles per imperial gallon (mpg) into kilometers per liter (kpl).\r\n" + //
        "\r\n" + //
        "Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).\r\n" + //
        "\r\n" + //
        "Make sure to round off the result to two decimal points.\r\n" + //
        "\r\n" + //
        "Some useful associations relevant to this kata:\r\n" + //
        "\r\n" + //
        "1 Imperial Gallon = 4.54609188 litres\r\n" + //
        "\r\n" + //
        "1 Mile = 1.609344 kilometres";

    public void run(Authors author, Reader reader, Writter writter){

        writter.writePrompt("Введіть кількість галонів для конвертації.");

        int mpg = reader.readInt();

        double result = author.getEight().mpgToKPM(mpg);

        writter.writePrompt(mpg +"Імперських галонів, це " + result + "кілометрів на літр");
    }
}
