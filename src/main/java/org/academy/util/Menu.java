package org.academy.util;

import org.academy.interfaces.ITask;
import org.academy.util.data.ConsoleReader;
import org.academy.util.data.ConsoleWriter;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

import java.util.Scanner;

public class Menu {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        out:
        while (true) {
            showMainMenu();
            System.out.print("Please choose your option: ");
            int option = readOption(4, scanner);
            switch (option) {
                case 1 -> showAuthors(scanner);
                case 2 -> {
                    // Add new author (Not relevant if we are using enum, so skipping)
                }
                case 3 -> {
                    // Remove an author (Not relevant for enums)
                }
                case 4 -> {
                    break out; // Exit the loop
                }
            }
        }
        System.out.println("Bye!");
    }

    private void showMainMenu() {
        System.out.println("""
                Main menu:
                1. Show authors
                2. Add new author (Feature not implemented)
                3. Remove author (Feature not implemented)
                4. Exit
                """
        );
    }

    private void showAuthors(Scanner scanner) {
        System.out.println("Authors List:");
    
        for (Authors author : Authors.values()) {
            System.out.println(author.getId() + ". " + author.getName());
        }
        System.out.print("Select an author by number to view their tasks: ");
        int authorId = readOption(Authors.values().length, scanner);
        Authors selectedAuthor = Authors.getById(authorId);
        if (selectedAuthor != null) {
            showAuthorTasksMenu(scanner, selectedAuthor);
        } else {
            System.out.println("Invalid author selection.");
        }
    }

    private void showAuthorTasksMenu(Scanner scanner, Authors selectedAuthor) {
        System.out.println("\nTasks for author: " + selectedAuthor.getName());
        int taskTotalNumber = Tasks.values().length;
        for (int i = 0; i < taskTotalNumber; i++) {
            Tasks task = Tasks.values()[i];
            System.out.println((i + 1) + ". " + task.getName());
        }
        System.out.print("Select a task to run (or 0 to go back): ");
        int taskId = readOption(taskTotalNumber, scanner);
        if (taskId == 0) {
            return; // Go back to the previous menu
        }
        executeSelectedTask(selectedAuthor, taskId);
    }

    private void executeSelectedTask(Authors selectedAuthor, int taskId) {
        Tasks selectedTask = Tasks.values()[taskId -1];
        System.out.println("\nExecuting task: " + selectedTask.getName());
        ITask runner = selectedTask.getRunner();
        if (runner != null) {
            try {
                IReader reader = getReader();
                IWriter writer = getWriter();

                runner.run(selectedAuthor, reader, writer);
                System.out.println("Task executed successfully.");

            } catch (Exception e) {
                System.err.println("Error executing task: " + e.getMessage());
                e.printStackTrace();  // Print stack trace for debugging purposes
            }
        } else {
            System.out.println("This task has no implementation yet.");
        }
    }
    private IReader getReader() {
        return new ConsoleReader();
    }
    private IWriter getWriter() {
        return new ConsoleWriter();
    }

    private int readOption(int maxOption, Scanner scanner) {
        int option;
        while (true) {
            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option >= 0 && option <= maxOption) {
                    return option;
                } else {
                    System.out.println("Invalid option. Please enter a number between 0 and " + maxOption + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}
