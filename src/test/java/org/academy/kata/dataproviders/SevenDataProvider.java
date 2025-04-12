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

    @DataProvider(name="benefactorDataProvider")
    protected Object[][] benefactorDataProvider() {
        Object[][] data = new Object[][]{
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, "628"},
                {new double[]{14, 30, 5, 7, 9, 11, 15}, 92, "645" },
                {new double[]{14, 30, 5, 7, 9, 11, 15}, 2, "exception"},
                {new double[]{1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98}, 10000.0, "58430"},
                {new double[]{1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98}, 5800.0, "20630"},
                {new double[]{1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98}, 4800.0, "11630"},
                {new double[]{}, 90.0, "90"},
                {new double[]{14000.25, 300.76, 50.56, 70.0, 90.0, 11.0, 150.48, 1200.98}, 4800.0, "27326"},
                {new double[]{14.25, 30.76, 5.56, 7.0, 9.0, 11.0, 15.48, 12.987}, 5.0, "exception"},
                {new double[]{1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98}, 2000.0, "exception"},
                {new double[]{100.0}, 50.0, "exception"},
                {new double[]{666.0, 747.0, 846.0, 558.0, 783.0, 162.0, 855.0, 180.0}, 533.0, "exception"},
                {new double[]{86.0}, 43.0, "exception"},
                {new double[]{9523.8, 151686.7, 110246.4, 27234.9}, 82368.95, "113153"},
                {new double[]{190799.4, 194286.4, 111432.2, 74253.3, 131645.8, 176808.5, 113223.0, 178537.7, 189458.5, 29683.5, 210271.6, 149941.0}, 154915.74166666667, "263564"}
        };
        return combineDataProviders(data, SEVENS);
    }
}
