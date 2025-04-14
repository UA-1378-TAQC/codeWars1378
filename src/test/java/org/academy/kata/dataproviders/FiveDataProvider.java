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
    public Object[][] provideZerosData() {
        return new Object[][]{
                {new FiveImpl(), 0, 0},
                {new FiveImpl(), 5, 1},
                {new FiveImpl(), 6, 1},
                {new FiveImpl(), 10, 2},
                {new FiveImpl(), 25, 6},
                {new FiveImpl(), 100, 24},
                {new FiveImpl(), 125, 31},
                {new FiveImpl(), 200, 49},
                {new FiveImpl(), 1000, 249}
        };
    }
}
