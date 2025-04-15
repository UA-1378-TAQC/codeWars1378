    package org.academy.kata;

    import org.academy.kata.dataproviders.FiveDataProvider;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    import java.util.Arrays;

    public class FiveTest extends FiveDataProvider {

        @Test(dataProvider = "gapDataProvider")
        public void testGap(int g, long m, long n, Long[] expected, IFive fiveImpl) {
            long[] actual = fiveImpl.gap(g, m, n);

            if (expected == null) {
                Assert.assertNull(actual, "Expected null but got result from " + fiveImpl.getClass().getSimpleName());
            } else {
                Long[] actualBoxed = Arrays.stream(actual).boxed().toArray(Long[]::new);
                Assert.assertEquals(actualBoxed, expected, "Failed for implementation: " + fiveImpl.getClass().getSimpleName());
            }
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

        @Test
        public void testSmallest() {
        }
    }
