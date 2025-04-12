    package org.academy.kata;

    import org.testng.annotations.Test;

    public class FiveTest {


        @Test
        public void testGap() {
        }

        @Test
        public void testZeros() {
        }

        @Test
        public void testPerimeter() {
        }

        @Test(dataProvider = "solveDataProvider")
        public void testSolve(double m, double expected, IFive iFive) {
            double actual = iFive.solve(m);
            Assert.assertEquals(actual, expected, 1e-12);
        }

        @Test
        public void testSmallest() {
        }
    }

