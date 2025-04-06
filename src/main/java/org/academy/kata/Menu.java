package org.academy.kata;

import org.academy.util.Authors;

import java.util.*;

public class Menu {

    private Map<Integer, Authors> authors = new HashMap<>();


    public void run() {
        Scanner scanner = new Scanner(System.in);
        out:
        while (true) {
            showMainMenu();
            int option = readOption(4, scanner);
            switch (option) {
                case 1 -> showAuthors(scanner);
                case 2 -> {
                    Authors newAuthor = promptNewAuthor(scanner);
                    addAuthor(newAuthor);
                }
                case 3 -> removeAuthor(scanner);
                case 4 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }
    private void showMainMenu() {
        System.out.println("""
                Main menu:
                1. Show authors
                2. Add new author
                3. Remove author
                4. Exit
                """
        );
    }

    private void showAuthorTasksMenu(Scanner scanner, Authors author) {
        while (true) {
            System.out.println("""
                Select an option:
               1. View tasks for \s """ + author.getName() + """
           \n  2. Back to Main Menu
                """);

            int option = readOption(2, scanner);  // Read a valid option (1 or 2)

            switch (option) {
                case 1 -> showAuthorTasks(author);  // Show tasks for the selected author
                case 2 -> {
                    return;  // Go back to the main menu
                }
            }
        }
    }

    // Add new author to the map
    private void addAuthor(Authors author) {
        authors.put(author.getId(), author);
        System.out.println("Author " + author.getName() + " added.");
    }

    // Remove an author from the map
    private void removeAuthor(Scanner scanner) {
        if (authors.isEmpty()) {
            System.out.println("No authors available to remove.");
            return;
        }
        showAuthors(scanner);  // Display the list of authors before removal
        System.out.print("Enter the ID of the author to remove: ");
        int authorId = scanner.nextInt();
        if (authors.containsKey(authorId)) {
            Authors removedAuthor = authors.remove(authorId);
            System.out.println("Author " + removedAuthor.getName() + " removed.");
        } else {
            System.out.println("Invalid author ID.");
        }
    }

    private void showAuthorTasks(Authors author) {
        System.out.println("Tasks for " + author.getName() + ":");

        if (author.getEight() != null) {
            System.out.println("IEight tasks:");
            author.getEight().getTasks().forEach(task -> System.out.println("- " + task));
        }

        if (author.getSeven() != null) {
            System.out.println("ISeven tasks:");
            author.getSeven().getTasks().forEach(task -> System.out.println("- " + task));
        }

        if (author.getSix() != null) {
            System.out.println("ISix tasks:");
            author.getSix().getTasks().forEach(task -> System.out.println("- " + task));
        }
        if (author.getFive() != null) {
            System.out.println("IFive tasks:");
            author.getFive().getTasks().forEach(task -> System.out.println("- " + task));
        }
    }

    private Authors promptNewAuthor(Scanner scanner) {
        System.out.println("Let's add a new author!");
        System.out.print("Please enter the name of the author: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the GitHub username of the author: ");
        String githubUser = scanner.nextLine();
        return null;
       // return new Authors(idCounter++, name, githubUser);
    }

    private void showAuthors(Scanner scanner) {
        if (Authors.values().length == 0) {
            System.out.println("No authors available.");
        } else {
            System.out.println("Authors:");
            // Iterate through the enum values and print them
            for (Authors author : Authors.values()) {
                System.out.println(author.ordinal() + 1 + ". " + author.getName());  // Display enum ordinal and name
            }

            // Prompt user to select an author by index (ordinal)
            System.out.print("Select an author by number to see their tasks: ");
            int authorId = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Check if the authorId is within the range of the enum values
            if (authorId >= 1 && authorId <= Authors.values().length) {
                Authors selectedAuthor = Authors.values()[authorId - 1];  // Get selected author by ordinal
                showAuthorTasksMenu(scanner, selectedAuthor);  // Show tasks for the selected author
            } else {
                System.out.println("Invalid author ID.");
            }
        }
    }


    private int readOption(int nOptions, Scanner scanner) {
        System.out.println("Enter option from 1 to " + nOptions + ":");
        return Integer.parseInt(scanner.nextLine());
    }


    public static void main(String[] args) {
        new Menu().run();
    }
}
