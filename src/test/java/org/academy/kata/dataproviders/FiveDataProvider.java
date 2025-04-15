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
        return combineDataProviders(data, FIVES);
    }

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
