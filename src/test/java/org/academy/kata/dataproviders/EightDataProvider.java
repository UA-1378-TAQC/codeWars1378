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
                {-1.0, -2.0, -3.0, -6.0},
                {1.5, 2.5, -3.5, -13.125},
        };
        return combineDataProviders(data, EIGHTS);
    }

    @DataProvider(name = "countPositiveSumNegativeDataProvider")
    protected Object[][] countPositiveSumNegativeDataProvider() {
        Object[][] data = new Object[][]{
                {new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[] {10, -65}},
                {new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, new int[] {8, -50}},
                {new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[] {10, 0}},
                {new int[] {-11, -12, -13, -14, -15}, new int[] {0, -65}},
                {new int[] {0}, new int[] {0, 0}},
                {new int[] {0, 0, 0, 0, 0, 0, 0}, new int[] {0, 0}},
                {new int[] {-1, 1}, new int[]{1, -1}},
                {new int[] {1, -1}, new int[]{1, -1}},
                {new int[] {-19, 0}, new int[]{0, -19}},
                {new int[] {0, -19}, new int[]{0, -19}},
                {new int[] {0, 19}, new int[]{1, 0}},
                {new int[] {19, 0}, new int[]{1, 0}},
                {new int[] {7}, new int[]{1, 0}},
                {new int[] {-7}, new int[]{0, -7}}
                //{new int[] {}, new int[] {}},
                //{null, new int[] {}},
        };
        return combineDataProviders(data, EIGHTS);
    }

}
