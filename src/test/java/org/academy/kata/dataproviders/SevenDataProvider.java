package org.academy.kata.dataproviders;


import org.academy.kata.ISeven;
import org.testng.annotations.DataProvider;

import java.util.List;

public class SevenDataProvider extends BaseDataProvider{
    private final static List<ISeven> SEVENS = List.of(
            new org.academy.kata.implementation.adidvar.SevenImpl(),
            new org.academy.kata.implementation.Anat0li1.SevenImpl(),
            new org.academy.kata.implementation.BohdanKovalets.SevenImpl(),
            new org.academy.kata.implementation.dima123493.SevenImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.SevenImpl(),
            new org.academy.kata.implementation.HrushaNataliia.SevenImpl(),
            new org.academy.kata.implementation.keepCalmGirl.SevenImpl(),
            new org.academy.kata.implementation.KhrystynaTs.SevenImpl(),
            new org.academy.kata.implementation.MMykha.SevenImpl(),
            new org.academy.kata.implementation.novitskiiy.SevenImpl(),
            new org.academy.kata.implementation.roman50021.SevenImpl(),
            new org.academy.kata.implementation.RomanKmet.SevenImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.SevenImpl()
    );

    @DataProvider(name = "seriesSumDataProvider")
    public Object[][] seriesSumDataProvider() {
        Object[][] data = new Object[][]{
                {5, "1,57"},
                {9, "1,77"},
                {15, "1,94"}
        };
        return combineDataProviders(data, SEVENS);
    }
}
