package org.academy.interfaces;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

abstract public class ITask {
    public abstract void run(Authors author, IReader reader, IWriter writer);
}