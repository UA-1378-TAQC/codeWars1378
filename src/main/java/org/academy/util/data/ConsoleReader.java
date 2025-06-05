package org.academy.util.data;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Pattern;

public class ConsoleReader implements IReader {
    private final Scanner scanner = new Scanner(System.in);

    private <T> T readValue(Function<String, T> parser, Function<String, Boolean> validator) {
        T value;
        while (true) {
            String input = scanner.nextLine().trim();
            if (validator != null && !validator.apply(input)) {
                System.out.println("Incorrect input, please try again:");
                continue;
            }
            value = parser.apply(input);
            break;
        }
        return value;
    }

    @Override
    public int readInt(Integer minVal) {
        return readValue(Integer::parseInt, input -> InputValidator.isValidInt(input, minVal));
    }

    @Override
    public long readLong(Long minVal) {
        return readValue(Long::parseLong, input -> InputValidator.isValidLong(input, minVal));
    }

    @Override
    public float readFloat(Float minVal) {
        return readValue(Float::parseFloat, input -> InputValidator.isValidFloat(input, minVal));
    }

    @Override
    public double readDouble(Double minVal) {
        return readValue(Double::parseDouble, input -> InputValidator.isValidDouble(input, minVal));
    }

    @Override
    public BigInteger readBigInteger(BigInteger minVal) {
        return readValue(BigInteger::new, input -> InputValidator.isValidBigInteger(input, minVal));
    }

    @Override
    public String readString(String regEx) {
        return readValue(String::new, input -> InputValidator.isValidString(input, regEx));
    }

    @Override
    public int[] readIntArray(Integer minVal) {
        int[] result;
        while (true) {
            System.out.println("Enter a delimiter:");
            String delimiter = scanner.nextLine();
            String safeDelimiter = Pattern.quote(delimiter);
            System.out.println("Enter values separated by '" + delimiter + "':");
            String input = scanner.nextLine().trim();
            if (!InputValidator.isValidIntegerArray(input, delimiter, minVal)) {
                System.out.println("Incorrect input, please try again:");
                continue;
            }
            String[] array = Arrays.stream(input.trim().split(safeDelimiter)).filter(str -> !str.isBlank()).toArray(String[]::new);
            if(array.length == 0){
                System.out.println("Entered array should`t be empty");
                continue;
            }
            result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = Integer.parseInt(array[i].trim());
            }
            break;
        }
        return result;
    }

    @Override
    public double[] readDoubleArray(Double minVal) {
        double[] result;
        while (true) {
            System.out.println("Enter a delimiter:");
            String delimiter = scanner.nextLine();
            String safeDelimiter = Pattern.quote(delimiter);
            System.out.println("Enter values separated by '" + delimiter + "':");
            String input = scanner.nextLine().trim();
            if (!InputValidator.isValidDoubleArray(input, delimiter, minVal)) {
                System.out.println("Incorrect input, please try again:");
                continue;
            }
            String[] array = Arrays.stream(input.trim().split(safeDelimiter)).filter(str -> !str.isBlank()).toArray(String[]::new);
            if(array.length == 0){
                System.out.println("Entered array should`t be empty");
                continue;
            }
            result = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = Double.parseDouble(array[i].trim());
            }
            break;
        }
        return result;
    }

    @Override
    public String[] readStringArray(String regEx) {
        String[] result;
        while (true) {
            System.out.println("Enter a delimiter:");
            String delimiter = scanner.nextLine();
            String safeDelimiter = Pattern.quote(delimiter);
            System.out.println("Enter values separated by '" + safeDelimiter + "':");
            String input = scanner.nextLine().trim();
            if (!InputValidator.isValidStringArray(input, safeDelimiter, regEx)) {
                System.out.println("Incorrect input, please try again:");
                continue;
            }
            String[] array = Arrays.stream(input.trim().split(safeDelimiter)).filter(str -> !str.isBlank()).toArray(String[]::new);
            if(array.length == 0){
                System.out.println("Entered array should`t be empty");
                continue;
            }
            result = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i].trim();
            }
            break;
        }
        return result;
    }

}
