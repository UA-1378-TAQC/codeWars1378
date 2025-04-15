package org.academy.kata.dataproviders;

import org.testng.annotations.DataProvider;

public class WriterDataProvider {
    @DataProvider(name = "characterData")
    public Object[][] characterData() {
        return new Object[][]{
                {'A', "A"},
                {'m', "m"},
                {'Z', "Z"},
                {'1', "1"},
                {'#', "#"}
        };
    }

    @DataProvider(name = "testWritePrompt")
    public Object[][] testWritePrompt(){
        return new Object[][]{
            {"Enter length.","Enter length."},
            {"Enter height.","Enter height."},
            {"Enter widths.","Enter widths."},
            {"Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\n","\"Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.\\n" + //
                                "\""}
        };
    };

    @DataProvider(name = "testWriteArray2String")
    public Object[][] testWriteArray2String(){
        return new Object[][]{
            {new String[]{"0ABAR 20", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},new String[]{"0ABAR 20", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}},
            {new String[]{"Hello","World","Hi"},new String[]{"Hello","World","Hi"}},
            {new String[]{"I","want","to","all","tests","goes","well"},new String[]{"I","want","to","all","tests","goes","well"}}
        };
    }
  
    @DataProvider(name = "booleanDataProvider")
    public Object[][] booleanDataProvider() {
        return new Object[][]{
                {true, "true"},
                {false, "false"}
        };
    }

    @DataProvider(name = "floatDataProvider")
    public static Object[][] floatDataProvider() {
        return new Object[][]{
                {0.0f, "0.0"},
                {1.23f, "1.23"},
                {-4.56f, "-4.56"},
                {Float.MAX_VALUE, String.valueOf(Float.MAX_VALUE)},
                {Float.MIN_VALUE, String.valueOf(Float.MIN_VALUE)},
                {3.14159f, "3.14159"}
              };
    }

    @DataProvider(name = "writeArrayDataProvider")
    public Object[][] writeArrayDataProvider() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, "1\n2\n3\n4\n5"},
                {new int[]{}, ""},
                {new int[]{42}, "42"},
                {new int[]{-1, 0, 1}, "-1\n0\n1"},
                {new int[]{100, 200, 300}, "100\n200\n300"}
        };
    }

    @DataProvider(name = "intDataProvider")
    public Object[][] intDataProvider() {
        return new Object[][]{
                {0, "0"},
                {1, "1"},
                {-42, "-42"},
                {Integer.MAX_VALUE, String.valueOf(Integer.MAX_VALUE)},
                {Integer.MIN_VALUE, String.valueOf(Integer.MIN_VALUE)}
        };
    }

    @DataProvider(name = "doubleDataProvider")
    public static Object[][] doubleDataProvider() {
        return new Object[][]{
                {0.0, "0.0"},
                {1.23, "1.23"},
                {-4.56, "-4.56"},
                {Double.MAX_VALUE, "1.7976931348623157E308"},
                {Double.MIN_VALUE, "5.0E-324"},
                {Math.PI, "3.141592653589793"}
        };
    }

    @DataProvider(name = "longDataProvider")
    public Object[][] longDataProvider() {
        return new Object[][]{
                {1L, "1\n"},
                {123L, "123\n"},
                {999999999999L, "999999999999\n"}
        };
    }


    @DataProvider(name = "doubleArrayDataProvider")
    public Object[][] doubleArrayDataProvider() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0}, "1.0\n2.0\n3.0"},
                {new double[]{0.5, -2.3, 4.1}, "0.5\n-2.3\n4.1"},
                {new double[]{}, ""},
                {new double[]{Double.MAX_VALUE}, "1.7976931348623157E308"},
                {new double[]{Double.MIN_VALUE}, "4.9E-324"},
                {new double[]{0.0}, "0.0"},
                {new double[]{Double.NaN}, "NaN"},
        };
    }
}
