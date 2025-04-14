    package org.academy.kata;

    import org.academy.kata.dataproviders.FiveDataProvider;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class FiveTest extends FiveDataProvider {

        @Test
        public void testGap() {
        }

        @Test(dataProvider = "zerosDataProvider")
        public void testZeros(int input, int expected, IFive iFive) {
            int actual = iFive.zeros(input);
            Assert.assertEquals(actual, expected,
                    "Failed for implementation: " + iFive.getClass().getSimpleName() + " with input: " + input);
        }

        @Test
        public void testPerimeter() {
        }

        @Test
        public void testSolve() {
        }

        @Test
        public void testSmallest() {
        }
    }
