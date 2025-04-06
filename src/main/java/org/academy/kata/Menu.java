package org.academy.kata;

import org.academy.util.Authors;

import java.util.*;

public class Menu {
    private final Map<Integer, Authors> authors = new HashMap<>();
    private int idCounter = 1;  // Counter for unique IDs for authors

    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(4);
            switch (option) {
                case 1 -> showAuthors();
                case 2 -> {
                    Authors newAuthor = promptNewAuthor();
                    addAuthor(newAuthor);
                }
                case 3 -> removeAuthor();
                case 4 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }
    private void showAuthorTasksMenu(Scanner scanner, Authors author) {
        while (true) {
            System.out.println("""
                Select an option:
                1. View tasks for """ + author.getName() + """
                4. Back to Main Menu
                """);

            int option = readOption(2);  // Read a valid option

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
    private void removeAuthor() {
        if (authors.isEmpty()) {
            System.out.println("No authors available to remove.");
            return;
        }
        showAuthors();  // Display the list of authors before removal
        Scanner scanner = new Scanner(System.in);
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

        // Check for each task implementation and print the associated tasks
        if (author.getEight() != null) {
            System.out.println("IEight tasks: " + author.getEight());
        }
        if (author.getSeven() != null) {
            System.out.println("ISeven tasks: " + author.getSeven());
        }
        if (author.getSix() != null) {
            System.out.println("ISix tasks: " + author.getSix());
        }

        if (author.getFive() != null) {
            System.out.println("IFive tasks: " + author.getFive());
        }

    }
    private Authors promptNewAuthor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's add a new author!");
        System.out.print("Please enter the name of the author: ");
        String name = scan.nextLine();
        System.out.print("Please enter the GitHub username of the author: ");
        String githubUser = scan.nextLine();

      //  return new Authors(idCounter++, name, githubUser);
        return null;
    }
    private void showAuthors() {
        if (authors.isEmpty()) {
            System.out.println("There are no authors yet.");
        } else {
            System.out.println("Authors:");
            for (var entry : authors.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue().getName());
            }
        }
    }
    private int readOption(int nOptions) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter option from 1 to " + nOptions + ":");
        return Integer.parseInt(scan.nextLine());
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
    public static void main(String[] args) {
        new Menu().run();
    }

}
