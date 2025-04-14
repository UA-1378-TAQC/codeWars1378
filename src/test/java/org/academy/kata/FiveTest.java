    package org.academy.kata;

    import org.academy.kata.dataproviders.FiveDataProvider;
    import org.testng.annotations.Test;
    import static org.testng.Assert.assertEquals;

    public class FiveTest extends FiveDataProvider {

        @Test
        public void testGap() {
        }

        @Test
        public void testZeros() {
        }

        @Test
        public void testPerimeter() {
        }

        @Test
        public void testSolve() {
        }

        @Test(dataProvider = "smallestValueDataProvider")
        public void testSmallest(long input, long[] expected, IFive iFive) {
            long[] actual = iFive.smallest(input);
            assertEquals(actual.length, expected.length, "Length mismatch");

            for (int i = 0; i < expected.length; i++) {
                assertEquals(actual[i], expected[i], "Mismatch at index " + i);
            }
        }
    }
