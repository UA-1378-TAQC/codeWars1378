package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public interface ITask {
    void run(Authors author, IReader reader, IWriter writer);
}
