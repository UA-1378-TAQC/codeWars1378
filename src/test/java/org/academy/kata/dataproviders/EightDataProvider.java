package org.academy.kata.dataproviders;

import org.academy.kata.IEight;
import org.testng.annotations.DataProvider;

import java.util.List;

public class EightDataProvider extends BaseDataProvider{
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

    @DataProvider(name="cuboidDataProvider")
    protected Object[][] cuboidDataProvider(){
        Object[][] data =  new Object[][]{
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

    @DataProvider(name="kmPerLiterProvider")
    protected Object[][] kmPerLiterProvider(){
        Object[][] data =  new Object[][]{
                {10.0, 3.54},
                {20.0, 7.08},
                {30.0, 10.62},
                {4145.0, 1467.36},
                {407.0, 144.08},
                {24.0, 8.5},
                {36.0, 12.74},
                {1826.0, 646.42},
                {3.0, 1.06},
                {513.0, 181.61},
                {4496.0, 1591.61},
                {2424.0, 858.11},
                {4665.0, 1651.44},
                {4023.0, 1424.17},
                {3187.0, 1128.22},
                {4845.0, 1715.16},
                {3686.0, 1304.87},
                {3114.0, 1102.37},
                {931.0, 329.58},
                {4397.0, 1556.56},
                {3984.0, 1410.36},
                {2230.0, 789.43},
                {4434.0, 1569.66},
                {3296.0, 1166.8}
        };
        return combineDataProviders(data, EIGHTS);
    }



}
