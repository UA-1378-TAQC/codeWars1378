package org.academy.kata.dataproviders;

import org.academy.kata.IEight;
import org.testng.annotations.DataProvider;

import java.util.List;

public class EightDataProvider extends BaseDataProvider {
    private final static List<IEight> EIGHTS = List.of(
            new org.academy.kata.implementation.adidvar.EightImpl(),
            new org.academy.kata.implementation.Anat0li1.EightImpl(),
            new org.academy.kata.implementation.BohdanKovalets.EightImpl(),
            new org.academy.kata.implementation.dima123493.EightImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.EightImpl(),
            new org.academy.kata.implementation.HrushaNataliia.EightImpl(),
            new org.academy.kata.implementation.KhrystynaTs.EightImpl(),
            new org.academy.kata.implementation.MMykha.EightImpl(),
            new org.academy.kata.implementation.novitskiiy.EightImpl(),
            new org.academy.kata.implementation.roman50021.EightImpl(),
            new org.academy.kata.implementation.RomanKmet.EightImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.EightImpl()
    );

    @DataProvider(name = "cuboidDataProvider")
    protected Object[][] cuboidDataProvider() {
        Object[][] data = new Object[][]{
                {2.0, 3.0, 4.0, 24.0},
                {1.0, 2.0, 3.0, 6.0},
                {2.5, 3.5, 4.5, 39.375},
                {1.5, 2.5, 3.5, 13.125},
                {0.0, 0.0, 0.0, 0.0},
                {1.12, 2.35, 3.8, 10.0016},
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "kmPerLiterProvider")
    protected Object[][] kmPerLiterProvider() {
        Object[][] data = new Object[][]{
                {10.0f, 3.54f},
                {20.0f, 7.08f},
                {30.0f, 10.62f},
                {4145.0f, 1467.36f},
                {407.0f, 144.08f},
                {24.0f, 8.5f},
                {36.0f, 12.74f},
                {1826.0f, 646.42f},
                {3.0f, 1.06f},
                {513.0f, 181.61f},
                {4496.0f, 1591.61f},
                {2424.0f, 858.11f},
                {4665.0f, 1651.44f},
                {4023.0f, 1424.17f},
                {3187.0f, 1128.22f},
                {4845.0f, 1715.16f},
                {3686.0f, 1304.87f},
                {3114.0f, 1102.37f},
                {931.0f, 329.58f},
                {4397.0f, 1556.56f},
                {3984.0f, 1410.36f},
                {2230.0f, 789.43f},
                {4434.0f, 1569.66f},
                {3296.0f, 1166.8f}
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "twoDecimalPlacesDataProvider")
    public Object[][] twoDecimalPlacesDataProvider() {
        Object[][] data = new Object[][]{
                {3.14159, 3.14},
                {1.9999, 2.00},
                {-1.98765, -1.99},
                {0.0, 0.00},
                {123.456, 123.46}
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "divisibleByDataProvider")
    protected Object[][] divisibleByDataProvider() {
        Object[][] data = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{3, 6}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{}, 2, new int[]{}},
                {new int[]{1, 3, 5}, 2, new int[]{}},
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "squareRootDataProvider")
    public Object[][] squareRootDataProvider() {
        Object[][] data = new Object[][]{
                {new int[]{4, 3, 9, 7, 2, 1}, new int[]{2, 9, 3, 49, 4, 1}},
                {new int[]{100, 101, 5, 5, 1, 1}, new int[]{10, 10201, 25, 25, 1, 1}},
                {new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 4, 9, 2, 25, 36}},
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "stringToNumberDataProvider")
    protected Object[][] stringToNumberDataProvider() {
        Object[][] data = new Object[][]{
                {"1234", 1234},
                {"605", 605},
                {"1405", 1405},
                {"-7", -7},
                {"-2147483648", -2147483648},
                {"2147483647", 2147483647},
                {"0", 0},
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "countPositiveSumNegativeDataProvider")
    protected Object[][] countPositiveSumNegativeDataProvider() {
        Object[][] data = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[]{10, -65}},
                {new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, new int[]{8, -50}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{10, 0}},
                {new int[]{-11, -12, -13, -14, -15}, new int[]{0, -65}},
                {new int[]{0}, new int[]{0, 0}},
                {new int[]{0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0}},
                {new int[]{-1, 1}, new int[]{1, -1}},
                {new int[]{1, -1}, new int[]{1, -1}},
                {new int[]{-19, 0}, new int[]{0, -19}},
                {new int[]{0, -19}, new int[]{0, -19}},
                {new int[]{0, 19}, new int[]{1, 0}},
                {new int[]{19, 0}, new int[]{1, 0}},
                {new int[]{7}, new int[]{1, 0}},
                {new int[]{-7}, new int[]{0, -7}}
        };
        return combineDataProviders(data, EIGHTS);
    }


    @DataProvider(name = "litersDataProvider")
    protected Object[][] litersDataProvider() {
        Object[][] data = new Object[][]{
                {0.0, 0},
                {1.4, 0},
                {12.3, 6},
                {3.7, 1},
                {3.8, 1},
                {3.9, 1},
                {4.0, 2},
                {4.1, 2},
                {10.8, 5},
                {5.9, 2},
                {6.0, 3}
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name="wilsonDataProvider")
    protected Object[][] wilsonDataProvider(){
        Object[][] data = new Object[][]{
            {0,false},
            {1,false},
            {5,true},
            {13,true},
            {15,false}
        };
        return combineDataProviders(data, EIGHTS);
    }
}
