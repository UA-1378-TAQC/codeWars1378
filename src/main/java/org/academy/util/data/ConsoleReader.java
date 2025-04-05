package org.academy.util.data;

import java.math.BigInteger;
import java.util.Scanner;

public class ConsoleReader implements IReader {
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public int readInt(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public float readFloat(String prompt) {
        return 0;
    }

    @Override
    public double readDouble(String prompt) {
        return 0;
    }

    @Override
    public BigInteger readBigInteger(String prompt) {
        return null;
    }

    @Override
    public String readString(String prompt) {
        return "";
    }

    @Override
    public int[] readIntArray(String prompt, String delimiter) {
        return new int[0];
    }

    @Override
    public double[] readDoubleArray(String prompt, String delimiter) {
        return new double[0];
    }

    @Override
    public String[] readStringArray(String prompt, String delimiter) {
        return new String[0];
    }
}
