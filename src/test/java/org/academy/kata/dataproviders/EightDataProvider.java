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



}
