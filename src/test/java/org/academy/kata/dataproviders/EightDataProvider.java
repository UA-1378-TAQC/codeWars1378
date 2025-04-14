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
                {1.12, 2.35, 3.8, 10.0016},
        };
        return combineDataProviders(data, EIGHTS);
    }

}
