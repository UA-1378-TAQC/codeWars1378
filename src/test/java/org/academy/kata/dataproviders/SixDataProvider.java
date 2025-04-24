package org.academy.kata.dataproviders;

import org.academy.kata.ISix;
import org.testng.annotations.DataProvider;

import java.util.List;

public class SixDataProvider extends BaseDataProvider {
    private final static List<ISix> SIXES = List.of(
            new org.academy.kata.implementation.adidvar.SixImpl(),
            new org.academy.kata.implementation.Anat0li1.SixImpl(),
            new org.academy.kata.implementation.BohdanKovalets.SixImpl(),
            new org.academy.kata.implementation.dima123493.SixImpl(),
            new org.academy.kata.implementation.DMSlobodianiuk.SixImpl(),
            new org.academy.kata.implementation.HrushaNataliia.SixImpl(),
            new org.academy.kata.implementation.KhrystynaTs.SixImpl(),
            new org.academy.kata.implementation.MMykha.SixImpl(),
            new org.academy.kata.implementation.novitskiiy.SixImpl(),
            new org.academy.kata.implementation.roman50021.SixImpl(),
            new org.academy.kata.implementation.RomanKmet.SixImpl(),
            new org.academy.kata.implementation.viktoriiafylyk.SixImpl()
    );

    @DataProvider(name = "dataForF")
    public static Object[][] dataForF() {
        return new Object[][]{
                {5, 120},
                {0, 1},
                {1, 1},
                {3, 6},
                {7, 5040}
        };
    }

    @DataProvider(name = "balanceDataProvider")
    protected Object[][] balanceDataProvider() {
        Object[][] data = new Object[][]{
                {"""
1000.00!=
125 Market !=:125.45
126 Hardware =34.95
127 Video! 7.45
128 Book :14.32
129 Gasoline ::16.10""", """
Original Balance: 1000.00
125 Market 125.45 Balance 874.55
126 Hardware 34.95 Balance 839.60
127 Video 7.45 Balance 832.15
128 Book 14.32 Balance 817.83
129 Gasoline 16.10 Balance 801.73
Total expense  198.27
Average expense  39.65"""},
                {"""
1233.00
125 Hardware;! 24.8?;
123 Flowers 93.5
127 Meat 120.90
120 Picture 34.00
124 Gasoline 11.00
123 Photos;! 71.4?;
122 Picture 93.5
132 Tyres;! 19.00,?;
129 Stamps 13.6
129 Fruits{} 17.6
129 Market;! 128.00?;
121 Gasoline;! 13.6?;""",
                        """
Original Balance: 1233.00
125 Hardware 24.8 Balance 1208.20
123 Flowers 93.5 Balance 1114.70
127 Meat 120.90 Balance 993.80
120 Picture 34.00 Balance 959.80
124 Gasoline 11.00 Balance 948.80
123 Photos 71.4 Balance 877.40
122 Picture 93.5 Balance 783.90
132 Tyres 19.00 Balance 764.90
129 Stamps 13.6 Balance 751.30
129 Fruits 17.6 Balance 733.70
129 Market 128.00 Balance 605.70
121 Gasoline 13.6 Balance 592.10
Total expense  640.90
Average expense  53.41"""},
                {"""
1000.00
125 Market 125.45
126 Hardware 34.95
127 Video 7.45""", """
Original Balance: 1000.00
125 Market 125.45 Balance 874.55
126 Hardware 34.95 Balance 839.60
127 Video 7.45 Balance 832.15
Total expense  167.85
Average expense  55.95"""}
        };
        return combineDataProviders(data, SIXES);
    }

    @DataProvider(name = "meanDataProvider")
    protected Object[][] meanDataProvider() {
        String rainfallData =
                "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" +
                        "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                        "\n" +
                        "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" +
                        "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" +
                        "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" +
                        "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" +
                        "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +
                        "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +
                        "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                        "\n" +
                        "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

        Object[][] testData = new Object[][]{
                {"London", rainfallData, 51.199999999999996},
                {"Beijing", rainfallData, 52.416666666666664}
        };
        return combineDataProviders(testData, SIXES);
    }

    @DataProvider(name = "nbaData")
    public Object[][] nbaData() {
        String resultSheet = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,"
                + "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";

        Object[][] data = new Object[][]{
                {resultSheet, "Boston Celtics", "Boston Celtics:W=4;D=0;L=0;Scored=403;Conceded=350;Points=12"},
                {resultSheet, "Boston Celt", "Boston Celt:This team didn't play!"},
                {resultSheet, "", ""},
                {resultSheet + ",Fake Team 100.5 Real Team 99", "Real Team", "Error(float number):Fake Team 100.5 Real Team 99"}
        };

        return combineDataProviders(data, SIXES);
    }

    @DataProvider(name = "findNbDataProvider")
    protected Object[][] findNbDataProvider() {
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

    @DataProvider(name="varianceDataProvider")
    protected Object[][] varianceDataProvider(){
        String townsData = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
        "\n" +
        "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
        "\n" +
        "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
        "\n" +
        "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
        "\n" +
        "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
        "\n" +
        "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
        "\n" +
        "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
        "\n" +
        "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
        "\n" +
        "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
        "\n" +
        "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";
        Object[][] data = new Object[][]{
            {"Lime",townsData,1.5790972222222222},
            {"Beijing",townsData,4808.37138888889},
            {"Rome",townsData,915.3852083333335},
            {"London",townsData,57.428333333333335},
            {"Kyiv",townsData,-1.0},
            {"Lviv",townsData,-1.0}
        };
        return combineDataProviders(data, SIXES);
    }
}
