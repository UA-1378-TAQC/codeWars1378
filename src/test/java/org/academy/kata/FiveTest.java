    package org.academy.kata;

    import org.academy.kata.dataproviders.FiveDataProvider;
    import org.testng.annotations.Test;

    import static org.testng.Assert.assertEquals;

    public class FiveTest {

        @Test
        public void testGap() {
        }

        @Test(dataProvider = "zerosDataProvider", dataProviderClass = FiveDataProvider.class)
        public void testZeros(IFive impl, int input, int expected) {
            int result = impl.zeros(input);
            assertEquals(result, expected, "Failed for input: " + input);
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
