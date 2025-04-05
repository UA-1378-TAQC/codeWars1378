package org.academy.interfaces;

import org.academy.util.Authors;

abstract public class ITask {
    public abstract void run(Authors author, Reader reader, Writter writter);
}