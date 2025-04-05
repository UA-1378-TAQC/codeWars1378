package org.academy.util.data;

import java.math.BigInteger;

public interface IReader {
    int readInt(String prompt);
    long readLong(String prompt);
    float readFloat(String prompt);
    double readDouble(String prompt);
    BigInteger readBigInteger(String prompt);
    String readString(String prompt);
    int[] readIntArray(String prompt, String delimiter);
    double[] readDoubleArray(String prompt, String delimiter);
    String[] readStringArray(String prompt, String delimiter);
}
