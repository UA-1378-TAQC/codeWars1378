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
            new org.academy.kata.implementation.keepCalmGirl.EightImpl(),
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

}
