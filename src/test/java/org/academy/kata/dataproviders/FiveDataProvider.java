package org.academy.kata.dataproviders;

import org.academy.kata.IFive;
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
            new org.academy.kata.implementation.KhrystynaTs.FiveImpl(),
            new org.academy.kata.implementation.MMykha.FiveImpl(),
            new org.academy.kata.implementation.novitskiiy.FiveImpl(),
            new org.academy.kata.implementation.roman50021.FiveImpl(),
            new org.academy.kata.implementation.RomanKmet.FiveImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.FiveImpl()

    );

    @DataProvider(name = "solveDataProvider")
    protected Object[][] solveDataProvider() {
        Object[][] data = new Object[][]{
                {2.00, 0.500000000000},
                {4.00, 0.6096117967978},
                {5.00, 0.6417424305044},
                {6.00, 0.6666666666667},
                {20.00, 0.8000000000000},
                {50.00, 0.868225531212422}
        };
        return combineDataProviders(data, FIVES);
    }
}
