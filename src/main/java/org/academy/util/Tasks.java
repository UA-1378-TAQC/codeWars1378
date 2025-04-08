package org.academy.util;

import org.academy.interfaces.ITask;
import org.academy.tasks.Task10;
import org.academy.tasks.Task11;
import org.academy.tasks.Task12;
import org.academy.tasks.Task13;
import org.academy.tasks.Task14;
import org.academy.tasks.Task15;
import org.academy.tasks.Task16;
import org.academy.tasks.Task17;
import org.academy.tasks.Task18;
import org.academy.tasks.Task19;
import org.academy.tasks.Task5;
import org.academy.tasks.Task6;
import org.academy.tasks.Task7;
import org.academy.tasks.Task8;
import org.academy.tasks.Task9;
import org.academy.tasks.TaskGetVolumeOfCuboid;
import org.academy.tasks.TaskLiters;
import org.academy.tasks.TaskMpgToKpm;
import org.academy.tasks.TaskSolve;
import org.academy.tasks.TaskSquareOrSquareRoot;

public enum Tasks {
    Task1(1,"Keep Hydrated!","",new TaskLiters()),
    Task2(2,"Volume of a cuboid","",new TaskGetVolumeOfCuboid()),
    Task3(3,"Miles per gallon to kilometers per liter","",new TaskMpgToKpm()),
    Task4(4,"To square root or no to square","",new TaskSquareOrSquareRoot()),
    Task5(5,"Count of positives / sum of negatives","",new Task5()),
    Task6(6,"Convert a String to a Number","",new Task6()),
    Task7(7,"Willson primes","",new Task7()),
    Task8(8,"Formatting decimal places","",new Task8()),
    Task9(9,"Find numbers which are divisible by given number","",new Task9()),
    Task10(10,"Looking for a benefactor","",new Task10()),
    Task11(11,"Sum of the first nth term of Series","",new Task11()),
    Task12(12,"Build a pile of Cubes","",new Task12()),
    Task13(13,"Easy balance checking","",new Task13()),
    Task14(14,"Floating-point Approximation (I)","",new Task14()),
    Task15(15,"Rainfall","",new Task15()),
    Task16(16,"Ranking NBA","",new Task16()),
    Task17(17,"Help the bookseller!","",new Task17()),
    Task18(18,"Gap in Primes","",new Task18()),
    Task19(19,"Trailing zeros in factorial","",new Task19()),
    Task20(20,"Perimeter of squares in a rectangle","",null),
    Task21(21,"Which x for that sum?","",new TaskSolve()),
    Task22(22,"Find the smallest","",null);

    private final int id;
    private final String name;
    private final String description;
    private final ITask runner;

    Tasks(int id, String name, String description, ITask runner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.runner = runner;
    }

    public int getId() {
        return id;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public ITask getRunner() { return runner; }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static Tasks getById(int id) {
        for (Tasks task : values()) {
            if (task.id == id) {
                return task;
            }
        }
        return null;
    }

    public static void print() {
        for (Tasks task : values()) {
            System.out.println(task);
        }
    }
}
