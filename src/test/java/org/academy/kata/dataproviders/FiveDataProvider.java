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
            new org.academy.kata.implementation.keepCalmGirl.FiveImpl(),
            new org.academy.kata.implementation.KhrystynaTs.FiveImpl(),
            new org.academy.kata.implementation.MMykha.FiveImpl(),
            new org.academy.kata.implementation.novitskiiy.FiveImpl(),
            new org.academy.kata.implementation.roman50021.FiveImpl(),
            new org.academy.kata.implementation.RomanKmet.FiveImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.FiveImpl()

    );
    @DataProvider(name="smallestValueDataProvider")
    protected Object[][] smallestValueDataProvider(){
        Object[][] data =  new Object[][]{
                {261235, new long[]{126235, 2, 0}},
                {209917, new long[]{29917, 0, 1}},
                {285365, new long[]{238565,  3, 1}},
                {269045, new long[]{26945, 3, 0}},
                {296837, new long[]{239687, 4, 1}},
        };
        return combineDataProviders(data, FIVES);
    }
}
