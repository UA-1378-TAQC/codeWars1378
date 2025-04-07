package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Task4 implements ITask {    
    String name = "Miles per gallon to kilometers per liter";
    int Id = 4;
    String description = "Write a method, that will get an integer array as parameter and will process every number from this array.\r\n" + //
        "\r\n" + // 
        "Return a new array with processing every number of the input-array like this:\r\n" + //
        "\r\n" + //
        "If the number has an integer square root, take this, otherwise square the number.\r\n" + //
        "\r\n" + //
        "Example\r\n" + //
        "\r\n" + //
        "[4,3,9,7,2,1] -> [2,9,3,49,4,1]\r\n" + //
        "\r\n" + //
        "Notes\r\n" + //
        "\r\n" + //
        "The input array will always contain only positive numbers, and will never be empty or null.";

    @Override
    public void run(Authors author, Reader reader, Writter writter){

        writter.writePrompt("Введіть масив значень.");

        int[] array = reader.readIntArray();

        int[] result = author.getEight().squareOrSquareRoot(array);

        writter.writePrompt(array + "->" + result);

    }
}