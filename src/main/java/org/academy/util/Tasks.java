package org.academy.util;

import org.academy.interfaces.ITask;

public enum Tasks {
   ;



    public final int id;
    public final String name;
    public final String description;
    public final ITask runner;

    Tasks(int id, String name, String description, ITask runner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.runner = runner;
    }
}
