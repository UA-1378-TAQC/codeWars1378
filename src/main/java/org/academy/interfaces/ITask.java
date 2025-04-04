package org.academy.interfaces;

import org.academy.util.Authors;

abstract public class ITask {
    public abstract void run(Authors author, Reader reader, Writter writter);
}

//enum Tasks{
//    ;
//    public final int id;
//    public final String name;
//    public final String description;
//    public final ITask task;
//
//    Tasks(int id, String name, String description, ITask task) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.task = task;
//    }
//
//    Task1(1,"Name","Description", new Task1());
//    Task2(2,"Name","Description", new Task2());
//    Task3(3,"Name","Description", new Task3());
//    Task4(4,"Name","Description", new Task4());
//}
