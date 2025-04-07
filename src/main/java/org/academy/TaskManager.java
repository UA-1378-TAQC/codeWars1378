package org.academy;

import org.academy.util.Authors;
import org.academy.util.Tasks;
import org.academy.util.data.ConsoleReader;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskManager {
    public void run(Authors authors, Tasks tasks){
        IReader reader = new ConsoleReader();
        IWriter writer = new ConsoleWriter();
        tasks.getRunner().run(authors, reader, writer);
    }
}
