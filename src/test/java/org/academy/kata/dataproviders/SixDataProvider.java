package org.academy.kata.dataproviders;


import org.academy.kata.ISix;
import org.academy.kata.implementation.dima123493.SixImpl;
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

    @DataProvider(name = "stockSummaryDataProvider")
    protected Object[][] stockSummaryDataProvider() {
        Object[][] data = new Object[][]{
                {
                        new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},
                        new String[]{"A", "B"},
                        "(A : 200) - (B : 1140)"
                },
                {
                        new String[]{"ABAR 100", "CDXE 200"},
                        new String[]{"A", "C"},
                        "(A : 100) - (C : 200)"
                },
                {
                        new String[]{},
                        new String[]{"A", "B"},
                        ""
                },
                {
                        new String[]{"ABAR 100"},
                        new String[]{},
                        ""
                },
                {
                        new String[]{"ABAR 100", "BTSQ 200", "CDXE 300"},
                        new String[]{"A", "B", "C", "D"},
                        "(A : 100) - (B : 200) - (C : 300) - (D : 0)"
                }
        };

        return combineDataProviders(data, SIXES);
    }
}
