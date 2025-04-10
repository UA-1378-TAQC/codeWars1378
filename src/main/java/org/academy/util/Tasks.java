package org.academy.util;

import org.academy.tasks.ITask;
import org.academy.tasks.*;

public enum Tasks {
    Task1(1,"Keep Hydrated!","",new TaskLiters()),
    Task2(2,"Volume of a cuboid","",new TaskVolumeOfCuboid()),
    Task3(3,"Miles per gallon to kilometers per liter","",new TaskMpgToKpm()),
    Task4(4,"To square root or no to square","",new TaskSquareOrSquareRoot()),
    Task5(5,"Count of positives / sum of negatives","",new TaskCountPositivesSumNegatives()),
    Task6(6,"Convert a String to a Number","",new TaskStringToNumber()),
    Task7(7,"Willson primes","",new TaskWilson()),
    Task8(8,"Formatting decimal places","",new TaskTwoDecimalPlaces()),
    Task9(9,"Find numbers which are divisible by given number","",new TaskDivisibleBy()),
    Task10(10,"Looking for a benefactor","",new TaskNewAvg()),
    Task11(11,"Sum of the first nth term of Series","",new TaskSeriesSum()),
    Task12(12,"Build a pile of Cubes","",new TaskFindNb()),
    Task13(13,"Easy balance checking","",new TaskBalance()),
    Task14(14,"Floating-point Approximation (I)","",new TaskFloatingPointApproximation()),
    Task15(15,"Rainfall","",new TaskRainfall()),
    Task16(16,"Ranking NBA","",new TaskNbaCup()),
    Task17(17,"Help the bookseller!","",new TaskStockSummary()),
    Task18(18,"Gap in Primes","",new TaskGap()),
    Task19(19,"Trailing zeros in factorial","",new TaskZeros()),
    Task20(20,"Perimeter of squares in a rectangle","",new TaskPerimeter()),
    Task21(21,"Which x for that sum?","",new TaskSolve()),
    Task22(22,"Find the smallest","",new TaskSmallest());

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
