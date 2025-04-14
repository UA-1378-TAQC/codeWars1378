package org.academy.kata.dataproviders;


import org.academy.kata.IFive;
import org.academy.kata.implementation.novitskiiy.FiveImpl;
import org.testng.annotations.DataProvider;

import java.util.List;

public class FiveDataProvider extends BaseDataProvider {
    private final static List<IFive> FIVES = List.of(
            new org.academy.kata.implementation.adidvar.FiveImpl(),
            new org.academy.kata.implementation.Anat0li1.FiveImpl(),
            new org.academy.kata.implementation.BohdanKovalets.FiveImpl(),
            new org.academy.kata.implementation.dima123493.FiveImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.FiveImpl(),
            new org.academy.kata.implementation.HrushaNataliia.FiveImpl(),
            new org.academy.kata.implementation.keepCalmGirl.FiveImpl(),
            new org.academy.kata.implementation.KhrystynaTs.FiveImpl(),
            new org.academy.kata.implementation.MMykha.FiveImpl(),
            new org.academy.kata.implementation.novitskiiy.FiveImpl(),
            new org.academy.kata.implementation.roman50021.FiveImpl(),
            new org.academy.kata.implementation.RomanKmet.FiveImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.FiveImpl()

    );

    @DataProvider(name = "zerosDataProvider")
    protected Object[][] zerosDataProvider() {
        Object[][] data = new Object[][]{
                {0, 0},
                {4, 0},
                {5, 1},
                {10, 2},
                {25, 6},
                {100, 24},
                {125, 31},
                {1000, 249},
                {100000, 24999},
                {1000000000, 249999998},
        };
        return combineDataProviders(data, FIVES);
    }
}
