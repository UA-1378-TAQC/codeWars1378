package org.academy.util;

import org.academy.interfaces.ITask;

public enum Tasks {
    Task1(1,"Keep Hydrated!","",null),
    Task2(2,"Volume of a cuboid","",null),
    Task3(3,"Miles per gallon to kilometers per liter","",null),
    Task4(4,"To square root or no to square","",null),
    Task5(5,"Count of positives / sum of negatives","",null),
    Task6(6,"Convert a String to a Number","",null),
    Task7(7,"Willson primes","",null),
    Task8(8,"Formatting decimal places","",null),
    Task9(9,"Find numbers which are divisible by given number","",null),
    Task10(10,"Looking for a benefactor","",null),
    Task11(11,"Sum of the first nth term of Series","",null),
    Task12(12,"Build a pile of Cubes","",null),
    Task13(13,"Easy balance checking","",null),
    Task14(14,"Floating-point Approximation (I)","",null),
    Task15(15,"Rainfall","",null),
    Task16(16,"Ranking NBA","",null),
    Task17(17,"Help the bookseller!","",null),
    Task18(18,"Gap in Primes","",null),
    Task19(19,"Trailing zeros in factorial","",null),
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
