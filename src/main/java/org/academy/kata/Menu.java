package org.academy.kata;

import org.academy.util.Authors;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        out:
        while (true) {
            showMainMenu();
            int option = readOption(4, scanner);
            switch (option) {
                case 1 -> showAuthors(scanner);
                case 2 -> {
                    // Add new author (Not relevant if we are using enum)
                }
                case 3 -> {
                    // Remove an author (Not for enums)
                }
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
    private void showAuthorTasksMenu(Scanner scanner, Authors author) {
        while (true) {
            System.out.println("""
                Select an option:
               1. View tasks for \s """ + author.getName() + """
           \n  2. Back to Main Menu
                """);

            int option = readOption(2, scanner);  // Read a valid option (1 or 2)

            switch (option) {
                case 1 -> showAuthorTasks(scanner, author);  // Show tasks for the selected author
                case 2 -> {
                    return;  // Go back to the main menu
                }
            }
        }
    }

    private void showAuthorTasks(Scanner scanner, Authors author) {
        while (true) {
            // Display the tasks for the selected author
            System.out.println("Tasks for " + author.getName() + ":");
            for (int i = 0; i < author.getTasks().size(); i++) {
                System.out.println((i + 1) + ". " + author.getTasks().get(i));
            }

            System.out.print("Select a task by number to input data and see the result (0 to go back): ");

            // Input validation for task selection
            int taskId = -1;
            try {
                taskId = Integer.parseInt(scanner.nextLine());  // Read input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid task number.");
            }

            // Check for a valid task ID or back to the main menu
            if (taskId == 0) {
                System.out.println("Returning to main menu...");
                break;  // Exit the task menu and return to the main menu
            }

            // Handle invalid taskId and ensure it's within the valid range
            if (taskId >= 1 && taskId <= author.getTasks().size()) {
                inputDataForTask(scanner, author, taskId - 1);  // Subtract 1 for correct index
            } else {
                System.out.println("Invalid task ID. Please try again.");
            }
        }
    }


    private void inputDataForTask(Scanner scanner, Authors author, int taskIndex) {
        String result = null;

        switch (taskIndex) {
            case 0:  // Task 1: liters
                System.out.print("Enter time (hours) for the task: ");
                try {
                    double time = Double.parseDouble(scanner.nextLine());
                    result = String.valueOf(author.getEight().liters(time));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number for time (e.g., 2.5 hours).");
                }
                break;

            case 1:  // Task 2: getVolumeOfCuboid
                System.out.print("Enter the length, width, and height for the cuboid (comma separated): ");
                try {
                    String[] input = scanner.nextLine().split(",");
                    if (input.length != 3) {
                        System.out.println("Invalid input format. Please enter length, width, and height separated by commas.");
                        return;
                    }

                    double length = Double.parseDouble(input[0].trim());
                    double width = Double.parseDouble(input[1].trim());
                    double height = Double.parseDouble(input[2].trim());

                    result = String.valueOf(author.getEight().getVolumeOfCuboid(length, width, height));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numeric values for length, width, and height.");
                }
                break;

            case 2:  // Task 3: mpgToKPM
                System.out.print("Enter miles per gallon (mpg) value: ");
                try {
                    float mpg = Float.parseFloat(scanner.nextLine());
                    result = String.valueOf(author.getEight().mpgToKPM(mpg));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number for mpg (e.g., 30.5).");
                }
                break;

            case 3:  // Task 4: squareOrSquareRoot
                System.out.print("Enter an array of integers (comma separated): ");
                try {
                    String[] input = scanner.nextLine().split(",");
                    int[] array = new int[input.length];

                    for (int i = 0; i < input.length; i++) {
                        array[i] = Integer.parseInt(input[i].trim());
                    }

                    int[] resultArray = author.getEight().squareOrSquareRoot(array);
                    result = "Resulting array: " + Arrays.toString(resultArray);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter integers separated by commas (e.g., 1, 4, 9).");
                }
                break;

            case 4:  // Task 5: countPositivesSumNegatives
                System.out.print("Enter an array of integers (comma separated): ");
                try {
                    String[] input = scanner.nextLine().split(",");
                    int[] array = new int[input.length];

                    for (int i = 0; i < input.length; i++) {
                        array[i] = Integer.parseInt(input[i].trim());
                    }

                    int[] resultArray = author.getEight().countPositivesSumNegatives(array);
                    result = "Count of positives: " + resultArray[0] + ", Sum of negatives: " + resultArray[1];
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter integers separated by commas (e.g., 1, -2, 3, -4).");
                }
                break;

            case 5:  // Task 6: stringToNumber
                System.out.print("Enter a string to convert to number: ");
                try {
                    String input = scanner.nextLine();
                    result = String.valueOf(author.getEight().stringToNumber(input));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric string.");
                }
                break;

            case 6:  // Task 7: TwoDecimalPlaces
                System.out.print("Enter a number to round to 2 decimal places: ");
                try {
                    double number = Double.parseDouble(scanner.nextLine());
                    result = String.valueOf(author.getEight().TwoDecimalPlaces(number));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number (e.g., 123.456).");
                }
                break;

            case 7:  // Task 8: divisibleBy
                System.out.print("Enter an array of integers (comma separated): ");
                try {
                    String[] input = scanner.nextLine().split(",");
                    int[] array = new int[input.length];

                    for (int i = 0; i < input.length; i++) {
                        array[i] = Integer.parseInt(input[i].trim());
                    }

                    System.out.print("Enter a divider: ");
                    int divider = Integer.parseInt(scanner.nextLine());
                    int[] resultArray = author.getEight().divisibleBy(array, divider);
                    result = "Numbers divisible by " + divider + ": " + Arrays.toString(resultArray);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid integers.");
                }
                break;

            case 8:  // Task 9: am_i_wilson
                System.out.print("Enter a number to check if it's a Wilson prime: ");
                try {
                    long number = Long.parseLong(scanner.nextLine());
                    result = String.valueOf(author.getEight().am_i_wilson(number));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
                break;

            case 9:  // Task from IFive: gap
                System.out.print("Enter values for g, m, n (comma separated): ");
                try {
                    String[] input = scanner.nextLine().split(",");
                    if (input.length != 3) {
                        System.out.println("Invalid input format. Please enter three values.");
                        return;
                    }

                    int g = Integer.parseInt(input[0].trim());
                    long m = Long.parseLong(input[1].trim());
                    long n = Long.parseLong(input[2].trim());

                    long[] gapResult = author.getFive().gap(g, m, n);
                    result = "Gap: " + Arrays.toString(gapResult);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numeric values for g, m, and n.");
                }
                break;

            case 10:  // Task from IFive: zeros
                System.out.print("Enter a number to count zeros: ");
                try {
                    int n = Integer.parseInt(scanner.nextLine());
                    result = String.valueOf(author.getFive().zeros(n));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
                break;

            case 11:  // Task from IFive: perimeter
                System.out.print("Enter a number for perimeter calculation: ");
                try {
                    BigInteger n = new BigInteger(scanner.nextLine());
                    result = String.valueOf(author.getFive().perimeter(n));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
                break;

            case 12:  // Task from IFive: solve
                System.out.print("Enter a number for solve calculation: ");
                try {
                    double m = Double.parseDouble(scanner.nextLine());
                    result = String.valueOf(author.getFive().solve(m));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
                break;

            case 13:  // Task from IFive: smallest
                System.out.print("Enter a number for smallest calculation: ");
                try {
                    long n = Long.parseLong(scanner.nextLine());
                    long[] smallestResult = author.getFive().smallest(n);
                    result = "Smallest: " + Arrays.toString(smallestResult);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
                break;

            case 14:  // Task from ISeven: newAvg
                System.out.print("Enter an array of numbers (comma separated): ");
                try {
                    String[] input = scanner.nextLine().split(",");
                    double[] arr = new double[input.length];

                    for (int i = 0; i < input.length; i++) {
                        arr[i] = Double.parseDouble(input[i].trim());
                    }

                    System.out.print("Enter the average to compare against: ");
                    double navg = Double.parseDouble(scanner.nextLine());

                    long avgResult = author.getSeven().newAvg(arr, navg);
                    result = "Calculated new average: " + avgResult;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numbers.");
                }
                break;

            case 15:  // Task from ISeven: seriesSum
                System.out.print("Enter a number for the series sum calculation: ");
                try {
                    int n = Integer.parseInt(scanner.nextLine());
                    String seriesResult = author.getSeven().seriesSum(n);
                    result = "Series sum result: " + seriesResult;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
                break;
            case 16:  // Task from ISix: findNb
                System.out.print("Enter a number to calculate findNb: ");
                try {
                    long m = Long.parseLong(scanner.nextLine());
                    long resultNb = author.getSix().findNb(m);
                    result = "Result from findNb: " + resultNb;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
                break;

            case 17:  // Task from ISix: balance
                System.out.print("Enter the balance book string: ");
                String book = scanner.nextLine();
                String balanceResult = author.getSix().balance(book);
                result = "Balance result: " + balanceResult;
                break;

            case 18:  // Task from ISix: f
                System.out.print("Enter a number for the function f(x): ");
                try {
                    double x = Double.parseDouble(scanner.nextLine());
                    double fResult = author.getSix().f(x);
                    result = "Result of f(" + x + "): " + fResult;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
                break;

            case 19:  // Task from ISix: mean
                System.out.print("Enter the town name: ");
                String town = scanner.nextLine();
                System.out.print("Enter the rainfall data string: ");
                String rainfallData = scanner.nextLine();
                double meanResult = author.getSix().mean(town, rainfallData);
                result = "Mean rainfall for " + town + ": " + meanResult;
                break;

            case 20:  // Task from ISix: variance
                System.out.print("Enter the town name: ");
                String varianceTown = scanner.nextLine();
                System.out.print("Enter the rainfall data string: ");
                String varianceData = scanner.nextLine();
                double varianceResult = author.getSix().variance(varianceTown, varianceData);
                result = "Variance of rainfall for " + varianceTown + ": " + varianceResult;
                break;

            case 21:  // Task from ISix: nbaCup
                System.out.print("Enter the result sheet: ");
                String resultSheet = scanner.nextLine();
                System.out.print("Enter the team to search for: ");
                String toFind = scanner.nextLine();
                String nbaResult = author.getSix().nbaCup(resultSheet, toFind);
                result = "NBA Cup result: " + nbaResult;
                break;

            case 22:  // Task from ISix: stockSummary
                System.out.print("Enter the list of articles (comma separated): ");
                String[] lstOfArt = scanner.nextLine().split(",");
                System.out.print("Enter the list of first letters (comma separated): ");
                String[] lstOf1stLetter = scanner.nextLine().split(",");
                String stockSummaryResult = author.getSix().stockSummary(lstOfArt, lstOf1stLetter);
                result = "Stock summary: " + stockSummaryResult;
                break;

            default:
                System.out.println("Invalid task index.");
                return;
        }

// Output the result if a valid calculation was made
        if (result != null) {
            System.out.println("Result: " + result);
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
