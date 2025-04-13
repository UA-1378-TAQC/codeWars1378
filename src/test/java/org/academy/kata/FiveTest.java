    package org.academy.kata;

    import org.academy.kata.dataproviders.FiveDataProvider;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    import java.math.BigInteger;

    public class FiveTest extends FiveDataProvider {

        @Test
        public void testGap() {
        }

        @Test
        public void testZeros() {
        }

        @Test(dataProvider = "perimeterDataProvider")
        public void testPerimeter(BigInteger n, BigInteger expected, IFive iFive) {
            BigInteger actual = iFive.perimeter(n);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testSolve() {
        }

        @Test
        public void testSmallest() {
        }
    }
