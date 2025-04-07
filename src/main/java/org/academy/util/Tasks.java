package org.academy.util;

import org.academy.interfaces.ITask;
import org.academy.tasks.*;

public enum Tasks {
    Task1(1,"Keep Hydrated!","",new Task1()),
    Task2(2,"Volume of a cuboid","",new Task2()),
    Task3(3,"Miles per gallon to kilometers per liter","",new Task3()),
    Task4(4,"To square root or no to square","",new Task4()),
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
    Task21(21,"Which x for that sum?","",null),
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
