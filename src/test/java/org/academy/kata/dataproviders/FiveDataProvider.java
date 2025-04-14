package org.academy.kata.dataproviders;


import org.academy.kata.IFive;
import org.testng.annotations.DataProvider;

import java.math.BigInteger;
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

    @DataProvider(name="perimeterDataProvider")
    protected Object[][] perimeterDataProvider(){
        Object[][] data = new Object[][]{
                {BigInteger.valueOf(0), BigInteger.valueOf(4)},
                {BigInteger.valueOf(1), BigInteger.valueOf(8)},
                {BigInteger.valueOf(5), BigInteger.valueOf(80)},
                {BigInteger.valueOf(7), BigInteger.valueOf(216)},
                {BigInteger.valueOf(30), BigInteger.valueOf(14098308)}
        };

    @DataProvider(name = "gapDataProvider")
    public Object[][] gapDataProvider() {
        Object[][] data = new Object[][]{
                {2, 100L, 110L, new Long[]{101L, 103L}},
                {4, 100L, 110L, new Long[]{103L, 107L}},
                {6, 100L, 110L, null},
                {8, 300L, 400L, new Long[]{359L, 367L}},
                {10, 300L, 400L, new Long[]{337L, 347L}},
        };

        return combineDataProviders(data, FIVES);
    }

}
