package org.academy.util.data;

import java.math.BigInteger;

public interface IReader {
    int readInt(Integer minVal);

    long readLong(Long minVal);

    float readFloat(Float minVal);

    double readDouble(Double minVal);

    BigInteger readBigInteger(BigInteger minVal);

    String readString(String regEx);

    int[] readIntArray(Integer minVal);

    double[] readDoubleArray(Double minVal);

    String[] readStringArray(String regEx);
}
