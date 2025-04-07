package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

<<<<<<< HEAD
import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.academy.util.Authors;


public class Task1 implements ITask {    
    // String name = "Keep Hydrated!";
    // int Id = 1;
    // String description = "Nathan loves cycling.\r\n" + //
    //             "\r\n" + //
    //             "Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.\r\n" + //
    //             "\r\n" + //
    //             "You get given the time in hours and you need to return the number of litres Nathan will drink, rounded down.\r\n" + //
    //             "\r\n" + //
    //             "For example:" +
    //             "time = 3 ----> litres = 1" + 
    //             "\r\n" + 
    //             "time = 6.7---> litres = 3" +
    //             "\r\n" +   
    //             "time = 11.8--> litres = 5";

    public void run(Authors author, Reader reader, Writter writter){
        writter.writePrompt('Введіть час.');
        double time = reader.readDouble();

        int result = author.getEight().liters(time);

        writter.writePrompt("time = " + time + "----> litres = " + result);
=======
public class Task1 implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        /*
        writer.writePrompt("Введіть n");
        int value1 = reader.readInt(); //41234123 [1,100];
        writer.writePrompt("Введіть k");
        int value2 = reader.readInt(); //324124231

        //validate

        int result = author.getFive().solve(value1,value2);

        writer.writePrompt("Результат:");
        writer.writeResult(result);
         */
>>>>>>> 26260cb4b755d09709edc14494833eb9e720aafb
    }
}
