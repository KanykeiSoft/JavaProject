import org.junit.jupiter.api.Test;
import BasicsSyntax.Factorial;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialTest {

        @Test
        void testFactorialOfZero() {
            assertEquals(1, Factorial.factorial(0));
        }

        @Test
        void testFactorialOfOne() {
            assertEquals(1, Factorial.factorial(1));
        }

        @Test
        void testFactorialOfFive() {
            assertEquals(120, Factorial.factorial(5));
        }

        @Test
        void testFactorialOfTen() {
            assertEquals(3628800, Factorial.factorial(10));
        }
    }


