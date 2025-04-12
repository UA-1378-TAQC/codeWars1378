package org.academy.kata.dataproviders;


import org.academy.kata.ISix;
import org.testng.annotations.DataProvider;

import java.util.List;

public class SixDataProvider extends BaseDataProvider{
    private final static List<ISix> SIXES = List.of(
            new org.academy.kata.implementation.adidvar.SixImpl(),
            new org.academy.kata.implementation.Anat0li1.SixImpl(),
            new org.academy.kata.implementation.BohdanKovalets.SixImpl(),
            new org.academy.kata.implementation.dima123493.SixImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.SixImpl(),
            new org.academy.kata.implementation.HrushaNataliia.SixImpl(),
            new org.academy.kata.implementation.keepCalmGirl.SixImpl(),
            new org.academy.kata.implementation.KhrystynaTs.SixImpl(),
            new org.academy.kata.implementation.MMykha.SixImpl(),
            new org.academy.kata.implementation.novitskiiy.SixImpl(),
            new org.academy.kata.implementation.roman50021.SixImpl(),
            new org.academy.kata.implementation.RomanKmet.SixImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.SixImpl()
    );

    @DataProvider(name = "findNbDataProvider")
    protected Object[][] findNbDataProvider(){
        Object[][] data = new Object[][]{
                //{0, -1},
                {1, 1},
                {2, -1},
                {9, 2},
                {4, -1},
                {100, 4},
                {4183059834009L, 2022},
                {24723578342962L, -1},
                {135440716410000L, 4824},
                {40539911473216L, 3568},
                {40539911473215L, -1},
                {40539911473217L, -1},
                {112668204662785L, -1},
                {1621633670997983721L, 50466},
                {1622276423986056337L, -1},
        };
        return combineDataProviders(data, SIXES);
    }
}
