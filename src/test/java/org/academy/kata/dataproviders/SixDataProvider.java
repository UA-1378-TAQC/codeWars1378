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


    @DataProvider(name="balanceDataProvider")
    protected Object[][] balanceDataProvider(){
        Object[][] data =  new Object[][]{
                {"1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10", "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874.55\\r\\n126 Hardware 34.95 Balance 839.60\\r\\n127 Video 7.45 Balance 832.15\\r\\n128 Book 14.32 Balance 817.83\\r\\n129 Gasoline 16.10 Balance 801.73\\r\\nTotal expense  198.27\\r\\nAverage expense  39.65"},
                {"1233.00\n125 Hardware;! 24.8?;\n123 Flowers 93.5\n127 Meat 120.90\n120 Picture 34.00\n124 Gasoline 11.00\n123 Photos;! 71.4?;\n122 Picture 93.5\n132 Tyres;! 19.00,?;\n129 Stamps 13.6\n129 Fruits{} 17.6\n129 Market;! 128.00?;\n121 Gasoline;! 13.6?;",
                        "Original Balance: 1233.00\\r\\n" +
                        "125 Hardware 24.8 Balance 1208.20\\r\\n" +
                        "123 Flowers 93.5 Balance 1114.70\\r\\n" +
                        "127 Meat 120.90 Balance 993.80\\r\\n" +
                        "120 Picture 34.00 Balance 959.80\\r\\n" +
                        "124 Gasoline 11.00 Balance 948.80\\r\\n" +
                        "123 Photos 71.4 Balance 877.40\\r\\n" +
                        "122 Picture 93.5 Balance 783.90\\r\\n" +
                        "132 Tyres 19.00 Balance 764.90\\r\\n" +
                        "129 Stamps 13.6 Balance 751.30\\r\\n" +
                        "129 Fruits 17.6 Balance 733.70\\r\\n" +
                        "129 Market 128.00 Balance 605.70\\r\\n" +
                        "121 Gasoline 13.6 Balance 592.10\\r\\n" +
                        "Total expense  640.90\\r\\n" +
                        "Average expense  53.41"},
                {"1000.00\n125 Market 125.45\n126 Hardware 34.95\n127 Video 7.45","Original Balance: 1000.00\\r\\n" +
                  "125 Market 125.45 Balance 874.55\\r\\n" +
                  "126 Hardware 34.95 Balance 839.60\\r\\n" +
                  "127 Video 7.45 Balance 832.15\\r\\n" +
                  "Total expense  167.85\\r\\n" +
                  "Average expense  55.95"},
                {"1500.00\n123 Groceries! 120.25\n124-Pharmacy? 45.30\n125 Cinema* 30.00\n126#Utilities@ 130.75\n127 Fast-Food 25.50",
                "Original Balance: 1500.00\\r\\n" +
                        "123 Groceries 120.25 Balance 1379.75\\r\\n" +
                        "124 Pharmacy 45.30 Balance 1334.45\\r\\n" +
                        "125 Cinema 30.00 Balance 1304.45\\r\\n" +
                        "126 Utilities 130.75 Balance 1173.70\\r\\n" +
                        "127 Fast Food 25.50 Balance 1148.20\\r\\n" +
                        "Total expense 351.80\\r\\n" +
                        "Average expense 70.36"
                },
                { "800.00\n\n130 Clothes 150.00\n\n131 Food 50.00\n",
                        "Original Balance: 800.00\\r\\n" +
                                "130 Clothes 150.00 Balance 650.00\\r\\n" +
                                "131 Food 50.00 Balance 600.00\\r\\n" +
                                "Total expense 200.00\\r\\n" +
                                "Average expense 100.00"
                }

        };
        return combineDataProviders(data, SIXES);
    }
}
